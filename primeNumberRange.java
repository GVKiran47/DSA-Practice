import java.util.ArrayList;

public class primeNumberRange {
    int n=100000;
    int count;

    public void primeFinder()
    {
        for(int i=2;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }

            }
            if(count==2)
            {
                System.out.print(i+" "+",");
                count=0;
            }
            else {
                count=0;
                continue;
            }
        }
    }
    public static void main(String[] args) {

        primeNumberRange pr = new primeNumberRange();
        pr.primeFinder();

    }

}
