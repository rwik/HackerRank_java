//removes leading and trailing space

public class Startswith {
    
    public static void main(String[] args) {
        String str = "ok google"; 
        
        System.out.println(str.startsWith("goo"));
        System.out.println(str.startsWith("ok"));
        System.out.println(str.startsWith("goo",3));
        System.out.println(str.endsWith("gle"));

    } 
}