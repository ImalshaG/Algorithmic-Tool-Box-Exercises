import java.util.Scanner;

public class FibonacciLastDigit {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        System.out.println(getFiboLastDigit(number));
    }
    public static long getFiboLastDigit(int num) {
        if (num==0){
            return 0;
        }else {
            long arrayFibLD[] = new long[num + 1];
            arrayFibLD[0] = 0;
            arrayFibLD[1] = 1;

            for (int i = 2; i <= num; i++) {
                arrayFibLD[i] = (arrayFibLD[i - 1] + arrayFibLD[i - 2]) % 10;
            }
            return arrayFibLD[num];
        }
    }

}