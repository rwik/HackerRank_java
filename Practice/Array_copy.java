public class Array_copy {
    public static void main(String[] args) {

        int[] src= {1,2,3,4,5,6,7,8};
        int[] dest= new int[3] ;
        System.arraycopy(src, 0, dest, 0, 3);
        for(int x : dest){
            System.out.println(x);
        }
       

    }
}