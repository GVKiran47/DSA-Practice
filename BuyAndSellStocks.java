import java.util.ArrayList;
import java.util.Collections;

class BuyAndSellStocks1
{
    int stocks[]={5,2,7,3,6,1,2,4};
    ArrayList<Integer> a= new ArrayList<>();
    public void stockMaximizer()
    {
        for(int i=0;i<stocks.length;i++)
        {
            int mark=stocks[i];
            {
                for(int j=1;j<stocks.length;j++)
                {
                    if(mark<stocks[j])
                    {
                        int difference=stocks[j]-mark;
                        a.add(difference);

                    }

                }
            }
        }
        Collections.sort(a);
        System.out.println(a);

    }
}
public class BuyAndSellStocks {
    public static void main(String[] args) {
        BuyAndSellStocks1 bs = new BuyAndSellStocks1();
        bs.stockMaximizer();

    }
}
