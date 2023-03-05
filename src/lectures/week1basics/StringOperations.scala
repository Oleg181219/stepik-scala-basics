package lectures.week1basics

import scala.+:

object StringOperations extends App {
  val aString: String = "Hello, world!"

  println(aString.length) // выводит 13
  println(aString.charAt(1)) // выводит e
  println(aString.substring(0, 2)) // выводит He
  println(aString.split(" ").toList) // выводит List(Hello,, world!)
  println(aString.startsWith("He")) // выводит true
  println(aString.replace("!", ".")) // выводит Hello, world.
  println(aString.toLowerCase) // выводит hello, world!
  println(aString.toUpperCase) // выводит HELLO, WORLD!
  println("abcd".reverse) // выводит dcba
  println("abcd".take(2)) // выводит ab
  // пример
  println("example".toUpperCase().take(2))
  //  алетрнативный код примера
  val upperCaseVal = "example".toUpperCase()
  val res = upperCaseVal.take(2)
  println(res)

  val bString = "Scala course"
  println(bString.take(12))

  //  println(bString.charAt(12)) 11 позиций в строке

  //  println(bString.substring(12, 13))

  println(bString.substring(11, 12))

  //  println(bString.take(-1))  нет функционала

  println(bString.charAt(11))

  println("nen")
  println(bString.substring(0, 5).toUpperCase)

  println(bString.take(6).toUpperCase)

//  bString = bString.take(5);  println(bString.toUpperCase)

  println(bString.substring(0, 6).toUpperCase)

  println(bString.take(5).toUpperCase)

  println(bString.substring(1, 5).toUpperCase)

  println(bString.toUpperCase.substring(0, 5))

//  println('3' +: '4')


//
//val link = "https://stepik.org"


  //  println(raw"The link is \t $link")//  The link is \t https://stepik.org
  //  println(link :+ '/catalog')//    unclosed character literal
  //  println(s"The link is link")//  The link is link
  //  println(link :++ "/catalog")//    https://stepik.org/catalog
  //  println(s"The link is ${link.toUpperCase}")//    The link is HTTPS://STEPIK.ORG
  //  println(s"The link is $linc")//  not found: value
  //  println(s"The link is \t $link")//  The link is   https://stepik.org
  //  println(s"The link is $link.toUpperCase") //    The link is https://stepik.org.toUpperCase

}
