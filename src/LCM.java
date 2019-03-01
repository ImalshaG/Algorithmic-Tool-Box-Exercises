import java.util.Scanner;

public class LCM {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        System.out.println(get_LCM(num1,num2));
    }
    public static long get_LCM(int number1, int number2){
        long lcm=(number1*(long)number2)/euclidGCD(number1,number2);
        return lcm;
    }
    public static int euclidGCD(int a,int b){
        int aRemainder;
        if (b==0){
            return a;
        }else{
            aRemainder=a%b;
            return euclidGCD(b,aRemainder);

        }
    }

}
