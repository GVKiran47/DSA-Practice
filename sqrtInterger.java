import java.util.ArrayList;
import java.util.Map;
import java.util.*;

public class sqrtInterger {
    int N=9;

    public void sqrtFinder()
    {
        for(int i=1;i<N;i++)
        {
            if((int)Math.pow(i,0.5)==Math.sqrt(i))
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        sqrtInterger sq = new sqrtInterger();
        sq.sqrtFinder();




    }
}
