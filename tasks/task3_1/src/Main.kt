// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("invalid input")
        exitProcess(1)
    }
    println(args)
}