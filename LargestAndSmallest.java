import java.util.ArrayList;

class LargestAndSmallest1
{
    int[] array={-12,11,-13,-5,6,-7,5,-3,6};
    int temp;
    ArrayList<Integer> ax= new ArrayList<>();
    public void comparator()
    {
        for(int i=0;i<array.length;i++)
        {
            temp=array[i];
            for(int j=0;j<array.length;j++)
            {
                if(temp>array[j])
                {
                    continue;
                }
                else {
                    temp=array[j];
                }
            }

        }System.out.println("the greatest element here is"+" "+temp);
        for(int i=0;i< array.length;i++)
        {
            temp= array[i];
            for(int j=0;j<array.length;j++) {
                if (temp < array[j]) {
                    continue;
                } else {
                    temp = array[j];
                }
            }
        }
        System.out.println("the smallest element here is"+" "+temp);

    }

public class LargestAndSmallest {
    public static void main(String[] args) {
        LargestAndSmallest1 ls1 = new LargestAndSmallest1();
        ls1.comparator();

    }
}
}
