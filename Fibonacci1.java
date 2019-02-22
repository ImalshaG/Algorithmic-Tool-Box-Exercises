/**
 * Created by DELL on 2/22/2019.
 */
public class Fibonacci1 {
    public static void main(String args[]){
        Fibonacci1 fib1=new Fibonacci1();
        System.out.println(fib1.getFib(10));

    }
    public int getFib(int num){
        if (num<=1){
            return 1;
        }else {
            return (getFib(num-1)+getFib(num-2));
        }
    }
}
