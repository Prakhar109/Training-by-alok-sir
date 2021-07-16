package com.example.training.alok

fun search(a:Int): Int {
    val c=a/10+1
    return c
}

fun addElement(b:MutableList<Int>):Int{
    var sum=0
    for (i in b){
        sum=sum+i
    }
    return sum
}

fun CompareElement(l1:MutableList<Int>,l2:MutableList<Int>):MutableList<Int>{
    var l3:MutableList<Int> = mutableListOf()
    for (i in l1.indices){
        for (j in l2.indices){
            if (l1[i]==l2[j]){
                l3.add(l1[i])
            }

        }
    }
    return l3
}

fun  main() {
    println(search(192))
    println(search(8))

    var b:MutableList<Int> = mutableListOf(9,5,3,7)
    var c:MutableList<Int> = mutableListOf(2,7,4)
    println(addElement(b))
    println(addElement(c))


    val l3: MutableList<Int> = mutableListOf(5,8,9,6)
    val l4: MutableList<Int> = mutableListOf(5,6,7)
    println(CompareElement(l3,l4))
}
