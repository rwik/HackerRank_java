//array is an object . Final object / variiable itself can't be changed. 
//But their memers can be changed
class jbl{
    public int m = 0;
}
public class Final_Array {
    public static void main(String[] args) {
        final int[] sm = new int[10];
        sm[0] =99;
        System.out.println(sm[0]); 
        
        
        final jbl obj = new jbl();
        obj.m =10;//This is ok
        jbl obj2 = new jbl();
        //obj = obj2;//This wont compile

    }
}