package example

import org.scalatest._

class LastFromListSpec extends FlatSpec with Matchers {
  "The LastFromList object" should "return the last item in a list" in {
    assert(LastFromList.GetLastFromList(List("a","b","c")) == "c");
  }
}
