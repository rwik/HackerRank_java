package io.github.rwik.p2;

public abstract class AbstarctAnimal {
    public   abstract void name(String name);
    public   void color(String color){
        System.out.println("Color passed = "+color);
    }

}