class lexographicOrder1
{
    public void arranger(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];

            for(int j=i+1;j<arr.length;j++)
            {
               if(temp>arr[j]) ;

            }
        }
    }
}
public class lexographicOrder {
    public static void main(String[] args) {
        lexographicOrder1 l1=new lexographicOrder1();
        int arr[]={4,2,3,1,5};
        l1.arranger(arr);

    }
}
