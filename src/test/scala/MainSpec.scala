import org.scalatest._
import org.scalatest.funspec.AnyFunSpec

class ExampleTests extends AnyFunSpec {
  describe("Codewars.spinWordsSimple") {
    it("should work with example tests") {
      assertResult ("emocleW") {Codewars.spinWordsSimple("Welcome")}
      assertResult ("Hey wollef sroirraw") {Codewars.spinWordsSimple("Hey fellow warriors")}
      assertResult ("This is a test") {Codewars.spinWordsSimple("This is a test")}
      assertResult ("This is rehtona test") {Codewars.spinWordsSimple("This is another test")}
      assertResult ("You are tsomla to the last test") {Codewars.spinWordsSimple("You are almost to the last test")}
      assertResult ("Just gniddik ereht is llits one more") {Codewars.spinWordsSimple("Just kidding there is still one more")}
      assertResult ("ylsuoireS this is the last one") {Codewars.spinWordsSimple("Seriously this is the last one")}
    }
  }

  describe("Codewars.spinWordsUsingVars") {
    it("should work with example tests") {
      assertResult ("emocleW") {Codewars.spinWordsUsingVars("Welcome")}
      assertResult ("Hey wollef sroirraw") {Codewars.spinWordsUsingVars("Hey fellow warriors")}
      assertResult ("This is a test") {Codewars.spinWordsUsingVars("This is a test")}
      assertResult ("This is rehtona test") {Codewars.spinWordsUsingVars("This is another test")}
      assertResult ("You are tsomla to the last test") {Codewars.spinWordsUsingVars("You are almost to the last test")}
      assertResult ("Just gniddik ereht is llits one more") {Codewars.spinWordsUsingVars("Just kidding there is still one more")}
      assertResult ("ylsuoireS this is the last one") {Codewars.spinWordsUsingVars("Seriously this is the last one")}
    }
  }
}
