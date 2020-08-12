package io.github.rwik.p1;
import java.util.Date ;


import java.util.Calendar;

public class Hello{
    
    public void showDate(){
    Date dt = new  Date();
    Calendar calendar = Calendar.getInstance();  
	System.out.println("Current date "+dt.getDate());
    }
}
