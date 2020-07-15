//removes leading and trailing space

public class String_serach {
    
    public static void main(String[] args) {
        String str = "ok google"; 
        
        System.out.println(str.contains("gle"));
        System.out.println(str.indexOf("g"));
        System.out.println(str.lastIndexOf("g"));
        System.out.println(str.lastIndexOf("g",7));//DOUBT .AFTER 7 NO G,BUT IT IS GIVING 6

    } 
}