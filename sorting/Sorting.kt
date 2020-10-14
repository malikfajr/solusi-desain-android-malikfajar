import java.io.*

fun main() {
  // input 4 9 7 5 8 9 3
  print("Masukkan nilai: ")
  var input = readLine()!!
  var data = input.split(" ").map{ it.toInt() }.toIntArray()
  var n = data.size - 1
  var swap: Int = 0
  var temp: Int
  var i = 0

  while(i < n) {
    if(data[i] > data[i + 1]) {
      swap++
      temp = data[i]
      data[i] = data[i+1]
      data[i+1] = temp
      println("${swap}. [${data[i]}, ${data[i + 1]}] -> ${data.joinToString(separator = " ")}")
      i = 0
    } else {
      i++
    }
  }

  println("\nJumlah swap: ${swap}")

}
