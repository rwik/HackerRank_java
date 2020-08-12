package io.github;

import io.github.rwik.p1.*;
import io.github.rwik.p2.*;


class Demo extends io.github.rwik.p2.AbstarctAnimal {
	public   void name(String name){
		System.out.println("Name entered = "+name);
	}
}

public class Test{
    public static void main(String[] args){
	io.github.rwik.p1.Hello hello = new io.github.rwik.p1.Hello();
	hello.showDate();

	Demo d = new Demo();
	d.name("goat");
	d.color("grey");
	
    }
}
