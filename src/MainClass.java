import java.util.Random;
/**
 * Created by DELL on 2/27/2019.
 */
public class MainClass {
    public static void main(String args[]){

        Random r=new Random();
        while(true){
            int num1=r.nextInt(10)+1;
            int num2=r.nextInt(10)+1;

            GCD_Algo1 test1=new GCD_Algo1();
            int out1=(test1.getGCDalgo1(num1,num2));
            GCD_AlgoEfficient test2= new GCD_AlgoEfficient();
            int out2=(test2.euclidGCD((num1),num2));

            if (out1==out2){
                System.out.println("OK");
            }else {
                System.out.printf("num1 = %d num2 = %d", num1, num2);
                System.out.print("");
                System.out.printf("output1 = %d output2 = %d", out1, out2);
                System.out.print("");
                break;
            }
        }
    }
}
