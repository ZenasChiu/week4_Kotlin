fun main(args: Array<String>) {
    //test1()
    //test2()
    whiletest(10)
    testing()
    val abc : String = "abc"
    println(abc.length)

}
fun String() {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")


    val apple = "apple " //read
    val interger = 123
    var interger_2 = 1 //changable

    val interger_3: Int = 4
    println("fruit $apple where prices $ $interger")
    println("fruit $apple where new prices $ ${interger_2 + interger + interger_3}")
    //print $
    //val read only
    //var changable
}
fun listandSet() {
    val name: String = "First name"
    val name_Set = listOf(name, "abc")
    var name_Set_2 = listOf<String>("${name + name_Set}", "bbc")
    val name_Set_3 = listOf<String>("mutable Name list ", "asfdafewfsvs")
    val name_Set_Set = setOf<List<String>>(
        name_Set_2,
        name_Set_2,
        listOf("name", "abc"),
        listOf("name", "abc")
    ) // only can store listOf but not mutableListOf
    val name_Set_list =
        mutableListOf<List<String>>(name_Set_2, name_Set_2) // only can store listOf but not mutableListOf
    println(name_Set_Set)

    //Different between List and Set :
    // List can store elements that duplicate/Repeat with position order
    // Set can only store elements that was unique with no position order

    val fruit = "apple"
    val fruitSet = mutableSetOf(fruit, "bananananana")


    println(fruitSet.add("carry"))
    println("all name data $name_Set")
    println("Second name list ${name_Set_2.count()} number of name ")
    println("Name list contain $name : " + (name in name_Set))
    //Both Set + list comment :
    //Integer .count
    //boolean .in
    //fun .add .remove

    val readOnlyAccountBalances = mapOf(1 to 100, 2 to 100, 3 to 100)
    println("This map has ${readOnlyAccountBalances.count()} key-value pairs")
    //Map<Key ,value> same as JAVA
}
fun IFWhen(){
    val a = 1
    val b = 2

    println(if (a > b) a else b) // Returns a value: 2
   //If case

    val obj = "Hello"
    val temp = 10

    val description = when {
        // If temp < 0 is true, sets description to "very cold"
        temp < 0 -> "very cold"
        // If temp < 10 is true, sets description to "a bit cold"
        temp < 10 -> "a bit cold"
        // If temp < 20 is true, sets description to "warm"
        temp < 20 -> "warm"
        // Sets description to "hot" if no previous condition is satisfied
        else -> "hot"
    }
    println(description)
    //"when" just like "Swtich"

}

fun test1() {
    val button = "A"

  println( when(button){
        "A" -> "Yes"
        "B" -> "NO"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
   }
  )
        // Write your code here

}

fun test2(){
    val int = 10
    for(x in 1..int){
        println(x)
    }
}

fun whiletest(number : Int ){
    var number = number
    do{
        println(number)
        number -=2
    }while (number > 0)

}
fun testing(){
    val a = Apple()
    println(a.model)
}
