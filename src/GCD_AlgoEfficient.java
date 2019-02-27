/**
 * Created by DELL on 2/27/2019.
 */
public class GCD_AlgoEfficient {

    public static void main(String args[]){
        GCD_AlgoEfficient test2= new GCD_AlgoEfficient();
        System.out.println(test2.euclidGCD(22134,357567));
    }
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

