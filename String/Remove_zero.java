//count number of zeros and then create a new substring.

public class Remove_zero {
    public static String logic(String key){
       int i =0;
       while(key.charAt(i) == '0')
        ++i;
       return key.substring(i) ;
    }
    public static void main(String[] args) {
        String str = "00000123569"; 
        str = logic(str); 
        System.out.println(str);

    } 
}