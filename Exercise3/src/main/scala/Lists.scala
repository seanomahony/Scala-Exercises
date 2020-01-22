class Lists {
 def flatten(input :List[Any]) : List[Any] =
   input match {
   case Nil => Nil;
   case x :: xs => x match {
     case y : List[Any] => y ++ flatten(xs)
     case _ => x::flatten(xs)
   }
 }
}
