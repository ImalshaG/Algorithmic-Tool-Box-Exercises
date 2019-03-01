import java.util.Scanner;

/**
 * Created by DELL on 3/1/2019.
 */
public class LCM_Naive {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();

        System.out.println(getLCM(num1,num2));
    }
    public static long getLCM(int number1, int number2){
        for (long multiple=1; multiple>0;multiple++){
            if (multiple%number1==0 && multiple%number2==0){
                return multiple;
            }
        }
        return 0;

    }

}
