package org.example

fun fizzbuzz(n: Int): String {
    val rules = listOf<Pair<(Int) -> Boolean, (Int) -> String>>(
        { value: Int -> value % 3 == 0 && value % 5 == 0 && value % 7 == 0 } to { _: Int -> "FizzBuzzFozz" },
        { value: Int -> value % 3 == 0 && value % 5 == 0 } to { _: Int -> "FizzBuzz" },
        { value: Int -> value % 3 == 0 && value % 7 == 0 } to { _: Int -> "FizzFozz" },
        { value: Int -> value % 5 == 0 && value % 7 == 0 } to { _: Int -> "BuzzFozz" },
        { value: Int -> value % 3 == 0 } to { _: Int -> "Fizz" },
        { value: Int -> value % 5 == 0 } to { _: Int -> "Buzz" },
        { value: Int -> value % 7 == 0 } to { _: Int -> "Fozz" }
    )

    val rule = rules.firstOrNull { (check, _) -> check(n) }
    return rule?.second?.invoke(n) ?: n.toString()
}