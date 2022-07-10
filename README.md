# Kotlin para Java developers

## Tipos de variáveis - Inferência de tipos

Kotlin consegue criar variáveis por inferência, bastando para isso, informar o conteúdo da mesma.
    
    val myPhraser = "I'm a String"
    val myPI = 3.14
    val myAnswer = 47
    val myDouble = 1.999
    val myInt = 199

Caso a variável não tenha o conteudo informado, deve-se informar o tipo.

    val aString: String
    val aDouble: Double
    val aInt: Int

Para tipos Float deve-se informar "F" ou "f" ao final. Caso contrário, o Kotlin fará cast para Double.
    
    val myFloat = 1.99F

Deve-se informar "L" ao final. Caso contrário, o Kotlin fará cast para Int.

    val myLong = 9977989623232L

Tipos Short devem ser explicamente informados.

    val myShort: Short = 12

Tipos Byte devem ser explicamente informados.

    val myByte: Byte = -128

Pode ser utilizado "_" para tornar variáveis numéricas mais legiveis.

    val aLongNumber = 123_456_789
    val theSameNumber = 123456789

O Kotlin, diferente do Java, exige que as conversões sejam explicitas!!! (mesmo que esta conversão seja para um tipo maior). 

Para isso, o Kotlin fornece um conjunto de conversores.

    val anInt: Int = 7
    val aLong: Long = anInt.toLong()


## Comentários em Kotlin 

Comentários em Kotlin são similares aos comentários em Java.
        
    // Comentário de fim de linha
    val myPhraser = "I'm a String" // Isto também é um comentário de fim de linha

    /*
    Comentário em bloco
        
    val aString: String
    val aDouble: Double
    val aInt: Int
    */

O Kotlin permite fazer comentários em bloco aninhados

    /*
    fun fooBar() {
        /*
        eu sou um comentário incorporado
        */
    }
    */

## Expressão If

- Em Kotlin, If é uma expressão e não uma instrução;
- É a maneira mais básica de controlar um fluxo em Kotlin;
- O valor de retorno é o valor da última expressão;
- Declaração ternária é desnecessária;

Ao utilizar o if como expressão, é obrigatória a claúsula "else"

    val myInt = 199
    val aInt: Int = 7

    val lowest = if (myInt < aInt) myInt else aInt

Outro exemplo:

    val temp = 26
    val isAirConditionerOn = if (temp >= 26) {
        println("It is warn")
        true
    } else {
        println("It is not so warn")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")

Para contatenar variáveis no Kotlin, basta informar a variavel precedida de $ 


|IMPORTANTE:                                                                                  | 
|---------------------------------------------------------------------------------------------|
| O If também pode ser utilizado da forma convencional, ou seja, como uma estrutura de decisão|


## Expressão When

No Kotlin, a Expressão When substitui o Switch, e apresenta duas formas:

- Com argumento

Utilize "{}" para mais ações para o argumento 

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

Também é possível combinar argumentos

    when (pizzaOrdered) {
        0 -> {
            println("Not hungry")
            println("Thanks")
        }
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> println("Are you sure?")
    }


A expressão When não está limitada a simplesmente comparar com constantes (como em Switch).
Também é possível comparar o argumento com o resultado de uma expressão

    when (pizzaOrdered) {
        Math.abs(pizzaOrdered) -> println("Ordered or more pizzas")
        else -> println("Ordered less than 0")
    }

Também é possível comparar o argumento com ranges

    when (pizzaOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> println("Are you sure?")
    }

- Sem argumentos

Neste caso, o When é um substituto do if... if else...
Temos a funcionalidade do if else, de forma mais compacta

    when {
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered % 2 == 1 -> println("Odd number ordered")
        pizzasOrdered % 2 == 0 -> println("Even number ordered")
    }

## While e Expressão For

- While / Do While

While e Do While, se comportam exatamente como no Java

    var x = 0
    while (x < 10) {
        println("x = $x")
        x += 3
    }

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

- For

Um loop for clássico contém:

1. Inicializador do loop
2. Verificador do loop
3. Iterador do loop
4. Instruções do loop

   for(int i-0; i<10; i++) {// Instruções do loop}


A instrução for do Kotlin, funciona com qualquer interador, não existindo, portanto, o forEach

    for (item in 1..10) {
        print("$item, ")
    }

    for (ch in "Iterating over Strings") {
        println(ch)
    }

Os pontos chaves do for, no Kotlin, são:
1. O valor da iteração: item;
2. O iterador: 1 .. 10 e 
3. O corpo do for

| IMPORTANTE                                                                                                                                                                                                                  |       
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| A  variável $item no for é um tipo de valor imutável, ou seja, internamente é um val. Portanto, ao tentar modificá-lo (por exemplo, com item++), o compilador irá reportar um erro                                          |

## Expressões For com arrays

Iterando com um range e capturando o índice

    println()

    var index = 0
    for (item in 10.rangeTo(20).step(2)) {
        println("${++index} -> $item")
    }

Iterando com um range e capturando o índice sem a necessidade de criar uma variável

    println()

    for ((ind, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("${ind + 1} -> $item")
    }

Iterando com um array

    println()

    val myArray = arrayOf(10, 20, 30, 40, 50)

    for (item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }