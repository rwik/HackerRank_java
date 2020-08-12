    package woc.assignment.one;

    import java.util.Scanner;

    public class Prime20 {
        public static void main(String[] args) {

            print20Prime(20);

        }

        private static void print20Prime(int num1 ) {
            if(num1 > 0 ){
                System.out.println("2");
            }
            boolean flag = true;
            int opNum = 3;
            int counter = 1;
            while (counter < num1) {
                for (int i = 2; i <= Math.sqrt(opNum); i++) {
                    if (opNum % i == 0) {
                       flag = false;
                       break;
                    }
                }

                if(flag == false){
                    flag = true;
                }else{
                    counter++;
                    System.out.println(opNum);
                }
                opNum++;
            }

        }
    }
