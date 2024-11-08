import java.util.EventListener;

public class SticklerTheif {
    int[] a={6,1,6,2,6};
    int n=a.length;
    int oddSum;
    int evenSum;
    public void FindMaxSum()
    {
        for(int i=0;i<n;i++)
        {
           if(i%2!=0)
           {
               oddSum=oddSum+a[i];
           }
           else {
               evenSum=evenSum+a[i];
           }
        }
        if(evenSum>oddSum)
            System.out.println(evenSum);
        else
            System.out.println(oddSum);
    }
    public static void main(String[] args) {
        SticklerTheif stt= new SticklerTheif();
        stt.FindMaxSum();

    }
}
