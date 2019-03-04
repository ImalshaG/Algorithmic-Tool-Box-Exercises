import java.util.*;
public class LargestNoGreedy {
    public static int maxNum=0;
    public static ArrayList<Integer> inList=new ArrayList<Integer>();
    public static ArrayList<Integer> outList=new ArrayList<Integer>();

    public static void main(String args[]){
        inList.add(5);
        inList.add(5);
        inList.add(9);
        inList.add(4);
        int i=0;
        while (i<inList.size()){
            maxNum=getMax(inList);
            modifyList();
        }
        System.out.println(outList);
    }
    public static int getMax(ArrayList<Integer> list){
        int max=0;
        for(int element: list){
            if (max<element){
                max=element;
            }
        }
        //System.out.println(max);
        return max;
    }
    public static void modifyList(){
        int index=inList.indexOf(maxNum);
        inList.remove(index);
        outList.add(maxNum);
    }
}
