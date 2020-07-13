//List is an interface which impliments ArrayList , LinkedList , Vector
//Stack

import java.util.ArrayList;
import java.util.List;

public class List_demo {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(10);
        ls.add(1,21);

        System.out.println(ls);

    }
}