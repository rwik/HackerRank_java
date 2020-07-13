// Returns a string representation of the “deep contents” of the 
// specified array. If the array contains other arrays as elements, 
// the string representation contains 
// their contents and so on. This method is designed for converting multidimensional 
// arrays to strings. 
import java.util.Arrays; 
public class DeepToString {
    public static void main(String[] args) {
        int[][] dArr = {{1,2,30},{4,23,21}};
        System.out.println(Arrays.deepToString(dArr)); 

    }
}