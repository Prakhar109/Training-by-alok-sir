package com.example.training.alok


/* fun main() {
    println("This is from prakhar side");
} */

/*fun main(args: Array<String>){

    var number = 10
    var GivenNumber=when(number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        6 -> println("Six")
        7 -> println("Seven")
        8 -> println("Eight")
        9 -> println("Nine")
        10 -> println("Tenth")
        else -> println("invalid number")
    }
    print("Number is $GivenNumber")

} */

fun main(args: Array<String>) {
    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println(i)
    }
}
