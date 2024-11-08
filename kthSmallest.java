import java.util.Arrays;

public class kthSmallest {
    int[] array={1,2,3,4,5,67,8,9};
    int k=2;
    public void kthSmallest2()
    {
        Arrays.sort(array);
        for(int i=1;i<=array.length;i++)
        {
            if(i==k)
            {
                System.out.println(array[k-1]);
            }
        }
    }
    public static void main(String[] args) {
        kthSmallest k= new kthSmallest();
        k.kthSmallest2();

    }
}
