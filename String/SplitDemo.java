

public class SplitDemo {
    
    public static void main(String[] args) {
        String str = "Namma-Bengaluru"; 
        for(String key : str.split("-"))
            System.out.println(key);

    } 
}