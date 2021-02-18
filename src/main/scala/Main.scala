object Codewars extends App {
  def spinWordsSimple(sentence: String): String = {
    val reverseIfLongerThanFive = (w: String) => w match {
      case x if x.length >= 5 => w.reverse
      case _ => w
    }
    sentence.split(" ").map(reverseIfLongerThanFive).mkString(" ")
  }

  def spinWordsUsingVars(sentence: String): String = {
    val reverseWordUsingVars = (w: String) => {
      (for(i <- w.length - 1 to 0 by -1) yield w(i)).mkString
    }
    val reverseIfLongerThanFive = (w: String) => w match {
      case x if x.length >= 5 => reverseWordUsingVars(w)
      case _ => w
    }
    
    sentence.split(" ").map(reverseIfLongerThanFive).mkString(" ")
  }

  val testSentence = "Warning this is dangerous!"
  println(spinWordsSimple(testSentence))
  println(spinWordsUsingVars(testSentence))
}