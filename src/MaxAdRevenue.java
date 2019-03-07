import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxAdRevenue {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> profits=new ArrayList<Integer>();
        ArrayList<Integer> clicks=new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            profits.add(s.nextInt());
        }
        for (int i=0;i<n;i++){
            clicks.add(s.nextInt());
        }
        Collections.sort(profits);
        Collections.sort(clicks);
        System.out.println(getMaxRev(profits,clicks,n));
    }
    public static long getMaxRev(ArrayList<Integer> profitSorted,ArrayList<Integer> clicksSorted, int n){
        long Revenue=0;
        for(int i=n-1;i>=0;i--){
            Revenue+=(long)profitSorted.get(i)*(long)clicksSorted.get(i);
        }
        return Revenue;
    }
}
