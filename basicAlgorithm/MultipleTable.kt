import java.io.*

fun multiplicationTable(n: Int): List<List<Int>> {
  var list = mutableListOf<Int>()
  var listOfList = mutableListOf(
      list.toMutableList()
    )
  listOfList.clear()
  for (i in 1..n) {
    list.clear()
    for (j in 1..n) {
      list.add(i*j)
      print("${i*j} ")
    }
    println()
    listOfList.add(list)

  }
  println()
  return listOfList
}

fun main() {
  print("Masukkan panjang kolom: ")
  var input = readLine()!!.toInt()

  println(multiplicationTable(input))
}
