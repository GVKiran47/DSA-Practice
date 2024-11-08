import java.util.*;
class bullshit2
{
    int n=1234568;
    int count;
    int temp;

    public void lengthFinder()
    {

        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
public class bullshitNumber {
    public static void main(String[] args) {
        bullshit2 b2 = new bullshit2();
        b2.lengthFinder();
    }
}
