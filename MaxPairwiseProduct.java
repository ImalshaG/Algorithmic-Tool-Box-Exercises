import java.util.Scanner;
/**
 * Created by DELL on 2/20/2019.
 */
public class MaxPairwiseProduct {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num= s.nextInt();
        int array1[]= new int[num];
        for(int count=0; count<num;count++){
            array1[count]=s.nextInt();
        }
        MaxPairwiseProduct max1=new MaxPairwiseProduct();
        System.out.println(max1.getMaxProduct(array1));

    }
    public long getMaxProduct(int arr[]){
        long maxProduct=0;
        long product;
        for (int num1=0;num1<arr.length;num1++ ){
            for (int num2=0;num2<arr.length;num2++){
                product=(long)(arr[num1])*(long)(arr[num2]);
                if (product>maxProduct && arr[num1]!=arr[num2]){
                    maxProduct=product;
                }
            }
        }
        return maxProduct;
    }
}
