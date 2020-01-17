package example

object LastFromList  {
  def GetLastFromList(inputList:List[Any]): Any ={
    val lengthOfList = inputList.length;
    return inputList(lengthOfList-1);
  }
}

