import java.util.*;
class splitBinary1
{
    String[] a={"1","0","0","1","0","1"};
    int onesCounter;
    int zeroesCounter;
    int totalSetCounter;
    public void equalStringCounter()
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=="0")
            {
                zeroesCounter++;
            } else if (a[i]=="1") {
                onesCounter++;
            }
            if(zeroesCounter==onesCounter)
            {
                totalSetCounter++;
            }
            else
            {
                continue;
            }

        }System.out.println(totalSetCounter);
        }

    }
public class splitBinary {
    public static void main(String[] args) {
        splitBinary1 s1=new splitBinary1();
        s1.equalStringCounter();

    }
}
