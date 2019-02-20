import java.util.Scanner;
/**
 * Created by DELL on 2/20/2019.
 */
public class MaxPairwiseProduct {


    public long getMaxProduct(int arr[]){
        long maxProduct=0;
        long product;
        for (int num1=0;num1<arr.length;num1++ ){
            for (int num2=0;num2<arr.length;num2++){
                product=(long)(arr[num1])*(long)(arr[num2]);
                if (product>maxProduct && num1!=num2){
                    maxProduct=product;
                }
            }
        }
        return maxProduct;
    }
}