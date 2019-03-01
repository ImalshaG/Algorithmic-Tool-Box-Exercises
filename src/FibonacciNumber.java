import java.util.Scanner;
public class FibonacciNumber {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        System.out.println(getFiboNum(number));
    }
        public static long getFiboNum(int num) {
            long arrayFib[] = new long[num + 1];
            arrayFib[0] = 0;
            arrayFib[1] = 1;

            for (int i = 2; i <= num; i++) {
                arrayFib[i] = arrayFib[i - 1] + arrayFib[i - 2];
            }
            return arrayFib[num];

        }

}
