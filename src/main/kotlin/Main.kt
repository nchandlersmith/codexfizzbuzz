package org.example

fun fizzbuzz(n: Int): String {
    val fizz = if (n % 3 == 0) "Fizz" else ""
    val buzz = if (n % 5 == 0) "Buzz" else ""
    val fozz = if (n % 7 == 0) "Fozz" else ""
    val result = fizz + buzz + fozz
    return if (result.isNotEmpty()) result else n.toString()
}