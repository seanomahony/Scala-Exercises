package example

import org.scalatest._

class RecursiveListSearchSpec extends FlatSpec with Matchers {
  "The RecursiveListSearch" should "return the nth element of a list" in {
    assert(RecursiveListSearch.nthRecursive(4, List("a","b","c","d","e")) == "e") ;
  }

  "The RecursiveListSearch" should "return an error for " in {
    intercept[NoSuchElementException] {
      RecursiveListSearch.nthRecursive(6, List("a", "b", "c", "d", "e"));
    }
  }
}
