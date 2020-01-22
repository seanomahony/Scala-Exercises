package example

import scala.annotation.tailrec

object RecursiveListSearch {

  /**
   * Retrieve an element from a list, given its index (0-based).
   *
   * @param n  index of the element of interest
   * @param ls list upon which the search happens
   * @tparam A type of the elements of the list
   * @return element with the given index
   * @throws NoSuchElementException if the given index corresponds to no element of the list
   */
  @tailrec
  def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => nthRecursive(n - 1, tail)
    case _ => throw new NoSuchElementException
  }
}


