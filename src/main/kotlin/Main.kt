package org.example

fun fizzbuzz(n: Int): String {
    val rules = listOf(
        { value: Int -> value % 3 == 0 && value % 5 == 0 } to { _: Int -> "FizzBuzz" },
        { value: Int -> value % 3 == 0 } to { _: Int -> "Fizz" },
        { value: Int -> value % 5 == 0 } to { _: Int -> "Buzz" }
    )

    val rule = rules.firstOrNull { (check, _) -> check(n) }
    return rule?.second?.invoke(n) ?: n.toString()
}