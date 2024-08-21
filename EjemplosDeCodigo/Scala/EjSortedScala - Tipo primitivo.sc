import scala.util.Random
/* Funciones que use de base para el codigo de abajo
def logRandomArray(n: Int): Unit = {
  val randomArray = Array.fill(n)(Random.nextInt(100))
  println(randomArray.mkString(", "))
}

def logAndSortRandomArray(randomArray: Array[Int]): Array[Int] = {
  val sortedArray = randomArray.sorted
  println(sortedArray.mkString(", "))
  sortedArray
}
*/

def generateAndSortRandomArray(n: Int): Array[Int] = {
  val randomArray = Array.fill(n)(Random.nextInt(100))
  println(randomArray.mkString(", "))

  val startTime = System.nanoTime()

  val sortedArray = randomArray.sorted

  val elapsedTime = (System.nanoTime() - startTime) / 1000000.0
  
  println(s"El ordenamiento tardó $elapsedTime ms")

  println(sortedArray.mkString(", "))
  sortedArray
}

generateAndSortRandomArray(10)