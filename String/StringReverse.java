//removes leading and trailing space

public class StringReverse {
    
    public static void main(String[] args) {
        String str = "Apple"; 
        StringBuilder result1 = new StringBuilder(str);
        result1 = result1.reverse();
        System.out.print("builtin : "+result1.toString()); 
        char[] chAr = str.toCharArray();
        for (int i = str.length()-1; i>=0; i--) 
            System.out.print(chAr[i]); 
        

    } 
}