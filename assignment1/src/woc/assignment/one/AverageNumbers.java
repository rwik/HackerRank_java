package woc.assignment.one;

public class AverageNumbers {
    public static void main(String[] args) {
        Integer result = 0;
        for(int i=0;i<args.length;i++)
            result += Integer.valueOf(args[i]);
        System.out.println(result/args.length);

    }
}
