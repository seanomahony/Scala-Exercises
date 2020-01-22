package example


import org.scalatest.wordspec.AnyWordSpec


class ListsSpec extends AnyWordSpec {
  "A list of integers" when {
    "full" should {
      "return a packed list" in {
        assertResult(List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))(Lists.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
      }
    }
    "empty" should {
      "return an empty list" in {
        assert(Lists.pack(List()).isEmpty)
      }
    }
  }
}

