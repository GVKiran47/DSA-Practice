import java.util.*;
class MinimumSwap1
{
    //int[] arr1={3,6,4,8};
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b= new ArrayList<>();


    //int[] arr2={4,6,8,3};
    int temp;
    int count;
    public void swapper()
    {
        a.add(3);
        a.add(2);
        a.add(1);
        b.add(1);
        b.add(2);
        b.add(3);
        System.out.println(a);
        System.out.println(b);
        Collections.swap(b,0,2);
        System.out.println(b);
       // System.out.println(a);
        System.out.println(a.equals(b));
    }
}

public class MinimumSwap {
    public static void main(String[] args) {
        MinimumSwap1 m=new MinimumSwap1();
        m.swapper();

    }
}
