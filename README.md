# Kotlin para desenvolvedores Java

## Tipos de variáveis - Inferência de tipos

Kotlin consegue criar variáveis por inferência, bastando para isso, informar o conteúdo da mesma.

```    
    val myPhraser = "I'm a String"
    val myPI = 3.14
    val myAnswer = 47
    val myDouble = 1.999
    val myInt = 199
```

Caso a variável não tenha o conteudo informado, deve-se informar o tipo.

```
    val aString: String
    val aDouble: Double
    val aInt: Int
```

Para tipos Float deve-se informar "F" ou "f" ao final. Caso contrário, o Kotlin fará cast para Double.

```    
    val myFloat = 1.99F
```

Deve-se informar "L" ao final. Caso contrário, o Kotlin fará cast para Int.

```
    val myLong = 9977989623232L
```

Tipos Short devem ser explicamente informados.

```
    val myShort: Short = 12
```

Tipos Byte devem ser explicamente informados.
```
    val myByte: Byte = -128
```

Pode ser utilizado "_" para tornar variáveis numéricas mais legiveis.

```
    val aLongNumber = 123_456_789
    val theSameNumber = 123456789
```

O Kotlin, diferente do Java, exige que as conversões sejam explicitas!!! (mesmo que esta conversão seja para um tipo maior). 

Para isso, o Kotlin fornece um conjunto de conversores.

```
    val anInt: Int = 7
    val aLong: Long = anInt.toLong()
```

## Comentários em Kotlin 

Comentários em Kotlin são similares aos comentários em Java.

```
    // Comentário de fim de linha
    val myPhraser = "I'm a String" // Isto também é um comentário de fim de linha
   
    /*
    Comentário em bloco
         
    val aString: String
    val aDouble: Double
    val aInt: Int
    */
```

O Kotlin permite fazer comentários em bloco aninhados

```
   /*
    fun fooBar() {
       /*
       eu sou um comentário incorporado
       */
   }
   */
```

## Expressão If

- Em Kotlin, If é uma expressão e não uma instrução;
- É a maneira mais básica de controlar um fluxo em Kotlin;
- O valor de retorno é o valor da última expressão;
- Declaração ternária é desnecessária;

Ao utilizar o if como expressão, é obrigatória a claúsula "else"

```
    val myInt = 199
    val aInt: Int = 7
    
    val lowest = if (myInt < aInt) myInt else aInt
```

Outro exemplo:

```
    val temp = 26
   
    val isAirConditionerOn = if (temp >= 26) {
        println("It is warn")
        true
    } else {
        println("It is not so warn")
        false
    }
   
   println("Is the air conditioner on: $isAirConditionerOn")
```

Para contatenar variáveis no Kotlin, basta informar a variavel precedida de $ 

|IMPORTANTE:                                                                                  | 
|---------------------------------------------------------------------------------------------|
| O If também pode ser utilizado da forma convencional, ou seja, como uma estrutura de decisão|


## Expressão When

No Kotlin, a Expressão When substitui o Switch, e apresenta duas formas:

- Com argumento

Utilize "{}" para mais ações para o argumento 

```
   val pizzaOrdered = 2
   
   when (pizzaOrdered) {
       0 -> { 
           println("Not hungry")
           println("Thanks")
       }
       1 -> println("Hungry")
       2 -> println("Very hungry")
       else -> println("Are you sure?")
   }
```

Também é possível combinar argumentos

```
   when (pizzaOrdered) {
       0 -> {
           println("Not hungry")
           println("Thanks")
       }
       1, 2 -> println("Hungry")
       3 -> println("Very hungry")
       else -> println("Are you sure?")
   }
```

A expressão When não está limitada a simplesmente comparar com constantes (como em Switch).
Também é possível comparar o argumento com o resultado de uma expressão

```
   when (pizzaOrdered) {
       Math.abs(pizzaOrdered) -> println("Ordered or more pizzas")
       else -> println("Ordered less than 0")
   }
```

Também é possível comparar o argumento com ranges

```
   when (pizzaOrdered) {
       0 -> println("We need orders")
       in 1..4 -> println("Got some orders")
       in 5..9 -> println("Business is up")
       else -> println("Are you sure?")
   }
```

- Sem argumentos

Neste caso, o When é um substituto do if... if else...
Temos a funcionalidade do if else, de forma mais compacta

```
   when {
       pizzasOrdered <= 0 -> println("None ordered")
       pizzasOrdered % 2 == 1 -> println("Odd number ordered")
       pizzasOrdered % 2 == 0 -> println("Even number ordered")
   }
```

## While e Expressão For

- While / Do While

While e Do While, se comportam exatamente como no Java

```
    var x = 0
    while (x < 10) {
        println("x = $x")
        x += 3
    }

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)
```

- For

Um loop for clássico contém:

1. Inicializador do loop
2. Verificador do loop
3. Iterador do loop
4. Instruções do loop

```
   for(int i-0; i<10; i++) {// Instruções do loop}
```


A instrução for do Kotlin, funciona com qualquer interador, não existindo, portanto, o forEach

```
    for (item in 1..10) {
        print("$item, ")
    }

    for (ch in "Iterating over Strings") {
        println(ch)
    }
```

Os pontos chaves do for, no Kotlin, são:
1. O valor da iteração: item;
2. O iterador: 1 .. 10 e 
3. O corpo do for

| IMPORTANTE                                                                                                                                                                                                                  |       
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| A  variável $item no for é um tipo de valor imutável, ou seja, internamente é um val. Portanto, ao tentar modificá-lo (por exemplo, com item++), o compilador irá reportar um erro                                          |

## Expressões For com arrays

Iterando com um range e capturando o índice

```
    println()

    var index = 0
    for (item in 10.rangeTo(20).step(2)) {
        println("${++index} -> $item")
    }
```

Iterando com um range e capturando o índice sem a necessidade de criar uma variável

```
    println()

    for ((ind, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("${ind + 1} -> $item")
    }
```

Iterando com um array

```
    println()

    val myArray = arrayOf(10, 20, 30, 40, 50)

    for (item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
```

# Funções em Kotlin

Declarar funções em Kotlin é muito semelhante à declaracao de variaveis, porém, ao invés de utilizar "val" ou "var", a palavra chave no caso é "fun", seguida de: 
- nome da função, 
- parametros, e 
- tipo de retorno

A assinatura do um método, em Java, seria escrito da seguinte forma:

```
public Integer myMathFunction(Integer number1, Integer number2) {// conteudo}
```

A assinatura de mesma função/método em Kotlin, seria:

```
fun myMathFunction(number1: Int, number2: Int): Int {// conteúdo}
```

Onde:

- fun -> palavra chave para a criação da função
- myMathFunction -> nome da função/método
- (number1: Int, number2: Int) -> parametros da função/método
- : Int -> retorno da função/método

Observe a sintaxe mais enxuta e menos verbosa do Kotlin

``` 
fun myMathFunction(number1: Int, number2: Int): Int {
   return number1 + number2
}
```
Quando uma função tem apenas uma linha, a mesma pode ser simplificada com Expression Body, como a seguir:

```
fun myExpressionBodyFunction(number1: Int, number2: Int): Int = number1 + number2
```
E pode ser simplificado ainda mais, utilizando a inferência de dados.

Uma vez que os dois parametros são do tipo Int, o Kotlin irá inferir o retorno da função

```
fun myExpressionBodyFunctionWithInference(number1: Int, number2: Int) = number1 + number2
```

Também é possível configurar valores-padrão para os parâmetros. Isto evita bastante o uso de sobrecarga de métodos que utilizamos em Java

```
fun myFunctionWithDefault(number1: Int = 1, number2: Int = 5, message: String = "Hi"): Int {
   val result = number1 + number2
   println(message)
   return result
}
```

Utilizando a função main para executar os métodos declarados:

```
fun main() {
   println("10 + 20 = ${myMathFunction(10, 20)}")
   println("15 + 25 = ${myExpressionBodyFunction(15, 25)}")
   println("25 + 35 = ${myExpressionBodyFunctionWithInference(25, 35)}")
   println("25 + 35 = ${myFunctionWithDefault(25, 35)}")
   println("25 + 35 = ${myFunctionWithDefault(25, 35, "Hello")}")
   println("25 + 35 = ${myFunctionWithDefault(25, 35, "Hello")}")

    // sem nenhum argumento
    println("Default sum without any parameter = ${myFunctionWithDefault()}")

    // utilizando argumento nomeado
    println("Default sum informing only one of the parameters = ${myFunctionWithDefault(message = "Hello")}")
}
```

## Pacotes em Kotlin

A declaração de pacotes em Kotlin é opcional, porém, se for declarada, deve ser feita na primeira linha do arquivo

```
fun main() {
    println("Declaring packages in Kotlin is optional, however, if declared, it must be done on the first line of the file")
}
```

```
package com.ewecarreira._01.conceitos.basicos._0108

fun main() {
    println("Declaring packages in Kotlin is optional, however, if declared, it must be done on the first line of the file")
}
```
