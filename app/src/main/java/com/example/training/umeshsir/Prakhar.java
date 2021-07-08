package com.example.training.umeshsir;

abstract class Prakhar{
   abstract void play();
    }
class Emp extends Prakhar {
    void play() {
        System.out.println("ABS");
    }

    public static void main(String[] args) {
        Emp obj = new Emp();
        obj.play();
    }
}

