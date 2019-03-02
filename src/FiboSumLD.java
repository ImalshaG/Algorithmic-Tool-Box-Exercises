import java.util.Scanner;

/**
 * Created by DELL on 3/2/2019.
 */
public class FiboSumLD {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        System.out.println(getFiboSumLD(number));
    }
    public static long getFiboSumLD(int num) {
        long sum=1;
        if (num == 0) {
            return 0;
        } else {
            long arrayFibLD[] = new long[num + 1];
            arrayFibLD[0] = 0;
            arrayFibLD[1] = 1;

            for (int i = 2; i <= num; i++) {
                arrayFibLD[i] = (arrayFibLD[i - 1] + arrayFibLD[i - 2]) % 10;
                sum+=arrayFibLD[i];
            }
            return (sum%10);
        }
    }
}

