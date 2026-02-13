package org.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.property.Arb
import io.kotest.property.arbitrary.filter
import io.kotest.property.arbitrary.int
import io.kotest.property.checkAll

class FizzBuzzTest : StringSpec({

    "fizzbuzz should return the number as string for integers not divisible by 3 or 5" {
        checkAll(
            Arb.int().filter { n -> n % 3 != 0 && n % 5 != 0 }
        ) { n ->
            fizzbuzz(n).shouldBe(n.toString())
        }
    }

    "fizzbuzz should return 'Fizz' for integers divisible by 3 but not 5" {
        checkAll(
            Arb.int().filter { n -> n % 3 == 0 && n % 5 != 0 }
        ) { n ->
            fizzbuzz(n).shouldBe("Fizz")
        }
    }

    "fizzbuzz should return 'Buzz' for integers divisible by 5 but not 3" {
        checkAll(
            Arb.int().filter { n -> n % 5 == 0 && n % 3 != 0 }
        ) { n ->
            fizzbuzz(n).shouldBe("Buzz")
        }
    }
})

