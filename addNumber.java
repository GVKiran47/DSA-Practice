import java.util.*;
class add
{
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    public int add(int a,int b)
    {
        System.out.println(a+b);
        return a+b;
    }
}
public class addNumber
{
    public static void main(String[] args) {
        add a1= new add();
        System.out.println("sum is"+a1.add(4,5));
    }
}
