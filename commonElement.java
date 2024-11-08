import java.util.Arrays;
import java.util.HashMap;

public class commonElement {
    int[][] a={{1,2,3},{2,8,10},{4,6,2}};
    int count;
    HashMap<Integer,Integer> hs = new HashMap<>();
    public void counter()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                hs.put(a[i][j],count);
            }
        }
        System.out.println(hs);



    }

    public static void main(String[] args) {
        commonElement cm= new commonElement();
        cm.counter();
    }
}
