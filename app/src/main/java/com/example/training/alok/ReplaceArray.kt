package com.example.training.alok

class ReplaceArray {
    var v = 123
}

fun main() {
    val array1 = arrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
    for(i in 0..9) {
        if (i == 5) {
            array1[5] = 5
        } else {
            array1[i] = 2;
        }
        print(array1[i])
    }

    var obj = ReplaceArray()
    println("\n"+obj.v)
}