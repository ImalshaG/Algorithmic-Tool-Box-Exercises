import java.util.Scanner;
public class PolyMultiplicationNaive {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=3;
        int poly1[]=new int[num];
        int poly2[]=new int[num];
        for (int i=0;i<num;i++){
            poly1[i]=s.nextInt();
        }
        for (int i=0;i<num;i++){
            poly2[i]=s.nextInt();
        }
        getProduct(poly1,poly2,num);
    }
    public static int[] getProduct(int[] a, int[] b, int n){
        int product[]=new int[2*n-1];
        for (int i=0;i<2*n-1;i++){
            product[i]=0;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                product[i+j]=product[i+j]+a[i]*a[j];
            }
        }
        for (int i=0; i<2*n-1;i++){
            System.out.print(product[i]+" ");
        }
        return product;
    }
}
