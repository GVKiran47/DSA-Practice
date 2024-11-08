import java.util.ArrayList;
import java.util.*;

public class firstAndLastOccurence {
    int[] a={1,3,5,5,5,5,7,123,125};
    int search=7;
    ArrayList<Integer> b= new ArrayList<>();
    public void placefinder()
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==search)
            {
                b.add(i);
            }
        }
        Collections.sort(b);
        System.out.println(search+" "+" first occured at"+" "+b.get(0));
        System.out.println((search+" "+" last occured at"+" "+b.get(b.size()-1)));


    }
    public static void main(String[] args) {
        firstAndLastOccurence f= new firstAndLastOccurence();
        f.placefinder();

    }
}
