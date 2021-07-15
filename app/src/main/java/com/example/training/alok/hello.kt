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
    print("Number is ${GivenNumber}")

}*/

/*fun main(args: Array<String>) {
    for (i in 1..5) {
        if (i == 3) {
            continue
        }
        println(i)
    }
}*/

fun main(args: Array<String>){
        val arrayname = arrayOf(1, 2, 3, 4, "Prakhar")
        for (i in 1..arrayname.size-1)
        {
            print(" "+arrayname[i])
        }
        println()
    for(i in 0..5)
    {
        println(i)
    }
    print("nothing print")
    for(i in 5..1)
    {
        println(i)
    }
    println("For print element in reverse order")
    for(i in 5 downTo 1)
    {
        println(i)
    }
    for(i in 5 downTo 1 step 3)
    {
        println(i)
    }
}

