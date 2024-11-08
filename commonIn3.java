import java.util.*;

public class commonIn3 {
    int arr[]={1,5,10,20,40,80};
    int brr[]={6,7,20,80,100};
    int crr[]={3,4,15,20,30,70,80,120};
    int count=1;
    HashMap<Integer,Integer> hs = new HashMap<>();
    public void commoninThree()
    {
        for(int i=0;i<arr.length;i++)
        {
            hs.put(arr[i],count);
        }
        for(int i=0;i<brr.length;i++)
        {
            if(hs.containsKey(brr[i]))
            {
               count=2;
                hs.put(brr[i],count);
            }
        }
        for(int i=0;i<crr.length;i++)
        {
            if(hs.containsKey(crr[i]))
            {
                count=3;
                hs.put(crr[i],count);
            }
        }
        for(Map.Entry<Integer,Integer> entry : hs.entrySet())
        {
            if(entry.getValue()==3)
            {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        commonIn3 cm = new commonIn3();
        cm.commoninThree();

    }
}
