import java.util.Scanner;
public class Scanner_demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String name = sc.next();
        String id = sc.next();
        System.out.println("Hi "+name+" "+id);
        sc.close();
        
       

    }
}