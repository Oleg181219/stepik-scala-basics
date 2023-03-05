package lectures.week1basics

object TypesValuesVariables extends App {

// val - константы
// var - переменные
  // полная запись присвоение переменной
//  val aString: String = "PlayGround"
  // сокращеная запись, компилятор сам опеределяет тип
//  val aAnotherString = "Another string"
//  println(aString)
//  println(aAnotherString)
  //  обязательно соблюдать тип присваемого заначения
  //  val error : String = 12 не верная запись, компилятор подскажет что объявленный тип и тип присвоения различаются


  // разные типы
/*
val aString = "Hello"
  val aChar = 'C'
  val aInt = 11
  val aLong = 11L
  val aFloat = 2.0f
  val aDouble = 2.0
  val aBoolean = true

Byte [ 8 битовое знаковое значение. Диапазон от -128 до 127 ]
Short [ 16 битовое знаковое значение. Диапазон от -32768 to 32767 ]
Int [ 32 битовое знаковое значение. Диапазон от -2147483648 to 2147483647 ]
Long [ 64 битовое знаковое значение. Диапазон от -9223372036854775808 to 9223372036854775807 ]
Float [ 32 битовое IEEE 754 число с плавающей точкой одинарной точности ]
Double [ 64 битовое IEEE 754 число с плавающей точкой двойной точности ]
Char [ 16 битовое беззнаковый символ Unicode. Диапазон от U+0000 to U+FFFF ]
String [ Последовательность экземпляров Char ]
Boolean [ Логическое буквенное значение true или false ]
Unit [ Соответствует отсутствию значения ]
Null [ Null или пустая ссылка ]
Nothing [ Подтип любого другого типа, включает в себя отсутствие значения. ]
AnyRef [ Супертип любого ссылочного типа. ]
*/

//  val aLong = 11
//  println(aLong.getClass)
//
//  val bLong = 11L
//  println(bLong.getClass)

  var cString = "abc"
  cString += "defg"

  var anInt = 1
  anInt += 1

  var bnInt = 1
  bnInt -= 1

//  val cnInt = 1
//  cnInt += 1
//
//  var vString = "abc"
//  vString -= "bc"

  var greeting = "Scala Learners" ; greeting = "Hello, Scala Learners"
  println(greeting)
}
