# kotlin-for-java-developers

## #1. Tipos de variáveis - Inferência de tipos

Kotlin consegue criar variáveis por inferência, bastando pra isso, informar o conteudo da mesma.
    
    val myPhraser = "I'm a String"
    val myPI = 3.14
    val myAnswer = 47
    val myDouble = 1.999
    val myInt = 199

Caso a variável não tenha o conteudo informado, deve-se informar o tipo.

    val aString: String
    val aDouble: Double
    val aInt: Int

Para tipos Float, deve-se informar "F" ou "f" ao final. Caso contrário, o Kotlin fará cast para Double.
    
    val myFloat = 1.99F

Deve-se informar "L" ao final. Caso contrário, o Kotlin fará cast para Int.

    val myLong = 9977989623232L

Tipos Short devem ser explicamente informados.

    val myShort: Short = 12

Tipos Devem devem ser explicamente informados.

    val myByte: Byte = -128

Pode ser utilizado "_" para tornar variáveis numéricas mais legiveis.

    val aLongNumber = 123_456_789
    val theSameNumber = 123456789

O Kotlin, diferente do Java, exige que as conversões sejam explicitas!!! (mesmo que esta conversão seja para um tipo maior) Para isso, o Kotlin fornece um conjunto de conversores.

    val anInt: Int = 7
    val aLong: Long = anInt.toLong()


## #2. Comentários em Kotlin 

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

## #3.Expressão If

- Em Kotlin, If é uma expressão e não uma instrução;
- É a maneira mais básica de controlar um fluxo em Kotlin;
- O valor de retorno é o valor da última expressão;
- Declaração ternária é desnecessária;

Ao utilizar o if como expressão, é obrigatória a clausula "else"

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

    // Para contatenar variáveis no Kotlin, basta informar a variavel precedida de $
    println("Is the air conditioner on: $isAirConditionerOn")

# IMPORTANTE:
O If também pode ser utilizado da forma convencional, ou seja, como uma estrutura de decisão



