import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        int inputs[] = new int[in];
        for (int i = 0; i < in; i++) {
            inputs[i] = s.nextInt();
        }
        int toFind=s.nextInt();
        int toFindNum[]=new int[toFind];
        for (int i=0;i<toFind;i++){
            toFindNum[i]=s.nextInt();
        }
        for (int i=0;i<toFind;i++){
            System.out.print(BinarySearch(inputs,0,in-1,toFindNum[i])+" ");

        }
    }
    public static int BinarySearch(int list[],int low ,int high ,int key){
        if (high<low){
            return -1;
        }
        int mid=(int)(low+(high-low)/2);

        if (list[mid]==key){
            return mid;
        }else if(list[mid]<key){
            return BinarySearch(list,mid+1,high,key);
        }else{
            return BinarySearch(list,low,mid-1,key);
        }
    }
}
