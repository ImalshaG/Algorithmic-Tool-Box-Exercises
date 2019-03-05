import java.util.Scanner;

public class MoneyChange {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(getNoOfCoins(num));
    }
    public static int getNoOfCoins(int val){
        int coins[]={10,5,1};
        int noOfCoins=0;
        for (int coin: coins){
            while ((val-coin)>=0  ){
                noOfCoins+=1;
                val=val-coin;
                if (val==0){
                    return noOfCoins;
                }
            }
        }
        return noOfCoins;
    }
}
