package woc.assignment.one;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicate {
    public static void main(String[] args) {
        String key = "Ram is a good boy Ram good";
        String[] strARR = key.split(" ");
        System.out.println("Word coumt : "+strARR.length);
        Set<String> set = new HashSet<String>();
        for (String i : strARR){
            if(set.contains(i))
            {
                System.out.println("Duplicate : "+i);

            }else{
                set.add(i);
            }
        }
    }
}
