import java.util.Scanner;

public class QuickSortAdvanced {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int array[]=new int[n];
        for (int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        RandomQuick(array,0,array.length-1);
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void RandomQuick(int A[],int l, int r){
        //Random rand=new Random();
        if (l>=r){
            return;
        }

        int partitioned[]=partition(A,l,r);
        RandomQuick(A,l,partitioned[0]-1);
        RandomQuick(A,partitioned[1]+1,r);

    }
    private static int[] partition(int arr[], int left, int right){
        int x=arr[left];
        int m1=left;
        int m2=m1;
        int swap;
        for (int i=left+1;i<=right;i++){
            if (arr[i]<x){
                m1+=1;
                m2+=1;
                swap=arr[i];
                arr[i]=arr[m1];
                arr[m1]=swap;
            }else if(arr[i]==x){
                m2+=1;
                swap=arr[i];
                arr[i]=arr[m2];
                arr[m2]=swap;
            }
        }
        swap=arr[left];
        arr[left]=arr[m1];
        arr[m1]=swap;
        int out[]=new int[2];
        out[0]=m1;
        out[1]=m2;
        return out;
    }
}
