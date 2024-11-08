class Factorial1
{
    int age=5;
    int sum=1;
    public int factorial()
    {
        for(int i=1;i<=age;i++)
        {
            sum=sum*i;
        }
        System.out.println(sum);
        return sum;
    }
}
public class Factroial {
    public static void main(String[] args) {
        Factorial1 f1= new Factorial1();
        f1.factorial();
    }
}
