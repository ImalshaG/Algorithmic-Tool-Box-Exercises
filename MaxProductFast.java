import java.util.Scanner;
/**
 * Created by DELL on 2/20/2019.
 */
public class MaxProductFast {


    public long getMaxPro(int arr[]){
        long maxProduct=0;
        int max1=0;
        int max2=0;
        int maxIndex=0;
        for (int num1=0;num1<arr.length;num1++ ){
            if (arr[num1]>max1){
                max1=arr[num1];
                maxIndex=num1;
            }
        }
        for (int num1=0;num1<arr.length;num1++ ){
            if (num1!=maxIndex && arr[num1]>max2){
                max2=arr[num1];
            }
        }
        maxProduct=(long)max1*(long)max2;
        return maxProduct;
    }
}
