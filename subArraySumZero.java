import java.util.Arrays;import java.util.*;

public class subArraySumZero {
    int arr[]={6,-1,-3,4,-2,2,4,6,-12,-7};
    ArrayList<Integer> ab = new ArrayList<>();
    int result;
    int sum;

    int sum2;
    public void sumZeroFinder()
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                result = result + arr[i];
                System.out.println(result);
            }
        }
       for(int i=0;i<arr.length;i++)
       {
           int key=arr[i];
           for(int j=i+1;j<=arr.length-1;j++)
           {
               sum=key+arr[j];
               if(sum<key)
               {
                   ab.add(arr[j]);
                   ab.add(key);

                   continue;
               }
               else if(sum>key)
               {
                   sum=sum-arr[j];
                   continue;
               }
           }
       }
        System.out.println(ab);
       for(int i=0;i<ab.size();i++)
       {
           sum2=sum2+ab.get(i);
       }
       for(int j=0;j<arr.length;j++)
       {
           if(sum2+arr[j]==0)
           {
               ab.add(arr[j]);
           }
       }
        System.out.println(ab);


    }
    public static void main(String[] args) {
        subArraySumZero s1=new subArraySumZero();
        s1.sumZeroFinder();

    }
}
