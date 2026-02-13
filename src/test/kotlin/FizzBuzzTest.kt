package org.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FizzBuzzTest : StringSpec({
    "fizzbuzz function should return '1' for input 1" {
        val result = fizzbuzz(1)
        result.shouldBe("1")
    }
})

