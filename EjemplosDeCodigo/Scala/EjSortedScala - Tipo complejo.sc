import scala.util.Random

case class MyStruct(field1: Int, field2: String)

def generateAndSortRandomStructs(n: Int): Array[MyStruct] = {
  val randomStructs = Array.fill(n)(MyStruct(Random.nextInt(100), Random.nextString(10)))
  println(randomStructs.mkString(", "))

  val startTime = System.nanoTime()

  val sortedStructs = randomStructs.sortBy(_.field1)

  val elapsedTime = (System.nanoTime() - startTime) / 1000000.0

  println(s"El ordenamiento tardó $elapsedTime ms")

  println(sortedStructs.mkString(", "))
  sortedStructs
}

generateAndSortRandomStructs(10)
