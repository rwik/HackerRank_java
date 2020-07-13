import java.util.Scanner;

public class Switch_demo {
    public static void main(String[] args) {

      Scanner scr = new Scanner(System.in);
      int m = scr.nextInt();
      switch(m){
          case 1:
          System.out.println("One");
          break;
          case 2:
          System.out.println("Two");
          break;
          default:
          System.out.println("Default");
          break;
      }  
      scr.close();

    }
}