import java.util.Scanner;
import java.util.Random;
/**
 * Created by DELL on 2/14/2019.
 */
public class MainClass {
    public static void main(String args[]){
        while(true) {
            Random r = new Random();
            int number = r.nextInt(1000) + 2;
            int array[] = new int[number];
            for (int count = 0; count < number; count++) {
                array[count] = r.nextInt(100000);
            }

            MaxPairwiseProduct test1 = new MaxPairwiseProduct();
            MaxProductFast test2 = new MaxProductFast();
            long res1 = (test1.getMaxProduct(array));
            long res2 = (test2.getMaxPro(array));

            if (res1 != res2) {
                System.out.println(number);
                for (int count = 0; count < number; count++) {
                    System.out.print(array[count] + " ");
                }
                System.out.println("");
                System.out.println("Wrong <<<" + res1 + "<<<" + res2);
                break;
            } else {
                System.out.println("OK");
            }
        }
    }


}
