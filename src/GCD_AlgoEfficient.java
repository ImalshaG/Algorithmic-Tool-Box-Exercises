import java.util.Scanner;

public class GCD_AlgoEfficient {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();

        System.out.println(euclidGCD(num1,num2));
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

