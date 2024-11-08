public class arrayCompare {
    int[] arr={10,40,300,55,25,69};
    public void arrayComparator()
    {
        int maxValue=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(maxValue>arr[i])
            {
                continue;
            }
            else {
               maxValue=arr[i];
            }
        }
        System.out.println("greatest value is"+" "+maxValue);

        int minValue=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>minValue)
            {
                continue;
            }
            else {
                minValue=arr[i];
            }
        }
        System.out.println("smallest number is "+" "+minValue);
    }
    public static void main(String[] args) {
        arrayCompare ac= new arrayCompare();
        ac.arrayComparator();

    }
}
