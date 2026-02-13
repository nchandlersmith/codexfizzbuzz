package org.example

fun fizzbuzz(n: Int): String {
    return when {
        n % 3 == 0 && n % 5 != 0 -> "Fizz"
        else -> n.toString()
    }
}

fun main() {
}