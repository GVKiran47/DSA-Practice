class InversionCount1
{

    int count=0;
    int[] array={2,3,4,5,6};
    public void counter()
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    count++;
                }
            }
        }
        System.out.println("total inversions are"+" "+count);

    }
}
public class InversionCount
{
    public static void main(String[] args) {
        InversionCount1 ic= new InversionCount1();
        ic.counter();

    }
}
