package org.example

fun fizzbuzz(n: Int): String {
    val fizz = if (n % 3 == 0) "Fizz" else ""
    val buzz = if (n % 5 == 0) "Buzz" else ""
    return if (fizz.isNotEmpty() || buzz.isNotEmpty()) fizz + buzz else n.toString()
}