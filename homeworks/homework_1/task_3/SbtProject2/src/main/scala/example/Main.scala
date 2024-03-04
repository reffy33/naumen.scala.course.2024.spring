package example

object Main {
  @main def run() =
    def printHelloMessage(helloWord: String, name: String): Unit = {
      println(helloWord + ", Scala! This is " + name);
    }

    var name = "Dimo4ka";
    var langHellos = Array("Hello", "Hola", "Bonjour")
  
    langHellos.foreach(printHelloMessage(_, name))
  
    var nameReversed = name.reverse;
  
    langHellos.foreach(printHelloMessage(_, nameReversed))
}
