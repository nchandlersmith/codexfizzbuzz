import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class AppTest : StringSpec({
    "returns an empty string" {
        app() shouldBe ""
    }
})
