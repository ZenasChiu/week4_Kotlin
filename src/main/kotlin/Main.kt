fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")


    val apple = "apple " //read
    val interger = 123
    var interger_2 = 1 //changable

    val interger_3 : Int = 4
    val name : String = "First name"
    val name_Set  = listOf(name, "abc")
    var name_Set_2 = listOf<String>( "${name+name_Set}", "bbc")
    val name_Set_3 = mutableListOf<String>("mutable Name list ", "asfdafewfsvs")


    println("fruit $apple where prices $ $interger")
    println("fruit $apple where new prices $ ${interger_2 + interger + interger_3}")
    println("all name data $name_Set")
    println("Second name list ${name_Set_2.count()} number of name ")
    println("Name list contain $name : " + ( name in name_Set))

}