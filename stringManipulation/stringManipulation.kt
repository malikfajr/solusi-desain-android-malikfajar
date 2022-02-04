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
  var result = mutableListOf<String>()

  for(item in keys) {
    var pattern = Regex(item.lowercase())
    var getItem : Sequence<MatchResult>  = pattern.findAll(txt.lowercase())
    getItem.forEach(){
      result.add(item)
    }
  }

  return result
}
