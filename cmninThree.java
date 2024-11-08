import java.util.*;
public class cmninThree {
    int[] arr1={1,2,3,4};
    int[] arr2={2,6,7,8};
    //int[] arr3={99,36,2,40};
    int count=1;
    HashMap<Integer,Integer> hs = new HashMap<>();
    public void Finder()
    {
        for(int i:arr1)
        {
            hs.put(arr1[i],count);
            if(hs.get(arr1[i]).equals(arr1[i]))
            {
                hs.put(hs.get(arr1[i]),1);
            }
        }
        for(int j:arr2)
        {
            hs.put(arr2[j],count);
            if(hs.get(arr2[j]).equals(arr2[j]))
            {
                hs.put(hs.get(arr2[j]),2);
            }
            if(hs.containsValue(2))
            {
                System.out.println(hs.containsKey(arr2[j]));
            }
        }

    }
    public static void main(String[] args) {
        cmninThree cm= new cmninThree();
        cm.Finder();

    }
}
