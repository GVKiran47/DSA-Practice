public class sumPairs {
    int[] a={1,5,7,1};
    int count;
    int target=6;
    public void targetChecker()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==target)
                {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        sumPairs sm= new sumPairs();
        sm.targetChecker();

    }
}
