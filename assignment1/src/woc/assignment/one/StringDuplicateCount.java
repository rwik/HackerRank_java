package woc.assignment.one;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringDuplicateCount {
    public static void main(String[] args) {
        String key = "Ram is a good boy Ram good";
        String[] strARR = key.split(" ");
        System.out.println("Word coumt : "+strARR.length);
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for (String i : strARR){
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);

            }else{
                map.put(i,1);
            }
        }
        System.out.println(map);
    }
}
