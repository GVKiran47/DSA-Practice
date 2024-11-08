import java.util.*;
public class factorialDigits {
    int n=5;
    int factorial=1;
    ArrayList<Integer> a= new ArrayList<>();
    public void factorialDigitFinder()
    {
        for(int i=1;i<=5;i++)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);
        while(factorial>0)
        {
           factorial=factorial%10;
           factorial=factorial/10;
           a.add(factorial);
        }
        System.out.println(a);

    }
    public static void main(String[] args) {
        factorialDigits fs= new factorialDigits();
        fs.factorialDigitFinder();

    }
}
