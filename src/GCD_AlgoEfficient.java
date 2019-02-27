/**
 * Created by DELL on 2/27/2019.
 */
public class GCD_AlgoEfficient {

    public int euclidGCD(int a,int b){
        int aRemainder;
        if (b==0){
            return a;
        }else{
            aRemainder=a%b;
            return euclidGCD(b,aRemainder);

            }
        }
    }

