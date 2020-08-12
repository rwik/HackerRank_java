package woc.assignment.one;

public class StringSplit {
    public static void main(String[] args) {
        String key = "Ram is a good boy";
        String[] strARR = key.split(" ");
        System.out.println("Word coumt : "+strARR.length);
        for (String i : strARR){
            System.out.println(i);
        }
    }
}
