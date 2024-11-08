import java.util.Collections;

public class pairDifference {
    int[] arr={5,20,3,2,5,80};
    int diff=78;
    public void diffFinder()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]-arr[j]==diff || arr[j]-arr[i]==diff)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        pairDifference pd = new pairDifference();
        pd.diffFinder();

    }
}
