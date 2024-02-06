object Main {
  def main(args: Array[String]): Unit = {
//    val two:Int = 12
    val two = 12 :: 15 :: 55667 :: "kjhg" :: Nil
    val L2  = List("one", "two", "15", "55667", "qwertyuiop")
    println(
      "Hello world!", "\n",
      two, "\n",
      L2 )
  }
}
