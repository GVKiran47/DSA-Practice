import java.util.ArrayList;
import java.util.Arrays;

public class rotatebyOne {
    int[] a={1,2,3,4,5};
    ArrayList<Integer>  b = new ArrayList<>();
    int temp;
    public void rotater()
    {
       temp=a[a.length-1];
       for(int i=a.length-1;i>0;i--)
       {
           a[i]=a[i-1];
       }
        a[0]=temp;
       for(int i=0;i<a.length;i++)
       {
           System.out.println(a[i]);
       }

    }
    public static void main(String[] args) {
        rotatebyOne r= new rotatebyOne();
        r.rotater();


    }
}
