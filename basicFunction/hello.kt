fun hello(name: String = "") :String {
  if (name.length == 0) {
    return "Hello, World!"
  } 
  return "Hello, ${name.toLowerCase().capitalize()}!"
}

fun main() {
  println(hello("john"))
  println(hello("aliCe"))
  println(hello(""))
  println(hello())
}
