import kotlin.system.exitProcess

fun main(args: Array<String>) {
    println("Welcome to Kurdle!")

    if (intro() == -1) {
        exitProcess(-1)
    }

}

fun intro(): Int {
    println("0. Exit")
    println("1. Rules")
    println("2. Start")
    println("3. Credits")

    // prompt
    print("> ")
    // get input
    val input = readLine()
    var selection = Integer.valueOf(input)

    when (selection) {
        0 -> exitProcess(0)
        1 -> rules()
        2 -> start()
        3 -> credits()
        4 -> debug()
        else -> {
            println("Not Valid Input!!")
            return -1
        }
    }

    return 0
}

fun rules() {
    println("==================KURDLE RULES==================")
    println("The rules of kurdle are quite simple.")
    println("A five letter word will be selected randomly ")
}

fun start() {

}

fun credits() {

}

fun debug() {
    println("Program arguments: ${args.joinToString()}")
}