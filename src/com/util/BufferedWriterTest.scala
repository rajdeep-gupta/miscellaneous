package com.util

/**
  * @author rajdeep-gupta
  */
object BufferedWriterTest {

  def main(args: Array[String]): Unit = {
    val mockBufferedWriter = new MockBufferedWriter
    val inactivePartitionsList: List[String] = List(
      "Are you watching closely?",
      "I am going to make him an offer he can't refuse",
      "May the force be with you",
      "Whatever doesn't kill you makes you stronger"
    )

    val expectedConcatenatedString = "Are you watching closely?\n" +
      "I am going to make him an offer he can't refuse\n" +
      "May the force be with you\n" +
      "Whatever doesn't kill you makes you stronger\n"

    inactivePartitionsList.foreach(x => mockBufferedWriter.write(x + "\n"))

    if (mockBufferedWriter.get == expectedConcatenatedString) {
      println("String matches !")
    }
  }
}
