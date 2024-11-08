import java.util.ArrayList;
import java.util.Arrays;

public class missingAndRepeating {
    int n=3;
    int[] array={4,5,6,8,8};
    int len=array.length;
   int count;
   int temp;
    ArrayList<Integer> a= new ArrayList<>();
   public void repeater() {
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                count++;
            }
        }
       System.out.println(n+" "+"has repeated"+" "+count+" "+"times");


    }
    public void missing()
    {
        for(int i=0;i<array.length;i++)
        {
            a.add(array[i]);
        }
        System.out.println(a);
        for(int i = array[0];i<array[len-1];i++)
        {
            if(!a.contains(i))
            {
                System.out.println(i+" "+"is the missing number");
            }
        }


    }

    public static void main(String[] args) {
        missingAndRepeating mr= new missingAndRepeating();
        mr.repeater();
        mr.missing();


    }
}
