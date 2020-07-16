//removes leading and trailing space

public class StringCompare {
    
    public static void main(String[] args) {
        String s1 = "Nikhil";
        String s2 = "Nikki"; 
        
        System.out.println(s1.equals(s2)); // bool
        System.out.println(s1 == s2 ); // bool
        System.out.println(s1.compareTo(s2)); // int . if equal then 0, else positive if s1>s2 else negetive 
        

    } 
}