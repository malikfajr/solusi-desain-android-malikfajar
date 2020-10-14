fun main() {
  val text1 = "milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"
  val text2 = "pizzachickenfriesburgercokemilkshakefriessandwich"

  println("text1 : ${text1}")
  println(setToArr(text1).joinToString(separator = " "))

  println("\ntext2 : ${text2}")
  println(setToArr(text2).joinToString(separator = " "))
}

fun setToArr(txt: String): List<String> {
  var keys = listOf("Burger", "Fries", "Chicken", "Pizza", "Sandwich", "Onionrings", "Milkshake", "Coke")
  var arr = mutableListOf<String>()
  var result = mutableListOf<String>()
  var len = txt.length
  var i = 0

  while(i < len) {
    lpp@ for (j in keys) {
      var txtLen = j.length
      if (txtLen + i > len){
          continue@lpp
      }

      if (txt.substring(i, i + txtLen).equals(j, ignoreCase = true)) {
        i = i + txtLen - 1
        arr.add(j)
        break@lpp
      }
    }
    i++
  }

  for (key in keys) {
    item@ for (k in arr) {
      if (key == k) {
        result.add(k)
        continue@item
      }
    }
  }

  return result
}
