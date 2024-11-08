public class majorityElement {
    int[] arr={5,5,5,5,4,4,2,2,2,2,2,2,2,2,2};
    int count;
    int maxCount;
    int n=arr.length;
    int index;

    public void majorityFinder()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>maxCount)
            {
                maxCount=count;
                count=0;
                index=i;
            }
            else {
                count=0;
                continue;

            }

        }
        System.out.println(arr[index]+" "+"has repeated for"+" "+maxCount+" "+"times");


    }
    public static void main(String[] args) {
        majorityElement me = new majorityElement();
        me.majorityFinder();

    }
}
