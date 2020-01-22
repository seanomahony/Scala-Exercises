package example

object Lists {
  /** Pack consecutive duplicates of list elements into sublists.
   * If a list contains repeated elements
   *
   * @param input list with potentially repeated subsequences
   * @tparam T
   * @return List
   */

  def pack[T](input: List[T], acc: List[T] = List.empty): List[List[T]] =
    input match {
      case Nil => Nil
      case x :: xs => xs match {
        case Nil => List(x::acc)
        case y :: ys => if (y == x) {
          pack(xs, x::acc)
        }
        else List(x :: acc) ++ pack(xs, List())
      }
    }
}

