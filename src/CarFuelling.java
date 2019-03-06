import java.util.Scanner;

public class CarFuelling {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int distanceAB=s.nextInt();
        int fullTank=s.nextInt();
        int noOfStops=s.nextInt();
        int stops[]=new int[noOfStops+2];
        stops[0]=0;
        for(int i=1; i<=noOfStops;i++){
            stops[i]=s.nextInt();
        }

        stops[noOfStops+1]=distanceAB;
        System.out.println(getMinStops(stops,noOfStops,fullTank));
    }
    public static int getMinStops(int stops[],int n, int maxDis){
        int numRefill=0;
        int currentRefill=0;
        int lastRefill;
        while (currentRefill<=n ){
            lastRefill=currentRefill;
            while (currentRefill<=n && (stops[currentRefill+1]-stops[lastRefill])<=maxDis){
                currentRefill+=1;
            }
            if (currentRefill==lastRefill){
                return -1;

            }
            if (currentRefill<=n){
                numRefill+=1;
            }
        }
        return numRefill;

    }
}
