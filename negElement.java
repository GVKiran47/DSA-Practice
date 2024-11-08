public class negElement {
    int[] arr= {-12,11,-13,-5,6,-7,5,-3,6};
    int temp;
    public void arranger()
    {
        for(int i=0;i<arr.length;i++)
        {
            temp=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(temp>arr[j])
                {
                    arr[j]=temp;
                    temp=arr[j];
                }
            }

        }


    }
    public static void main(String[] args) {
        negElement nigga= new negElement();
        nigga.arranger();

    }
}
