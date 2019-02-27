/**
 * Created by DELL on 2/27/2019.
 */
public class GCD_Algo1 {
    public int getGCDalgo1(int num1, int num2){
        int numMin=Math.min(num1,num2);
        int maxGCD=1;
        for (int div=numMin;div>=2;div--){
            if(num1%div==0 && num2%div==0){
                maxGCD=div;
                break;
            }
        }
        return maxGCD;
    }
}
