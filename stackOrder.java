import java.util.*;
class stack1
{
    Scanner sc= new Scanner(System.in);
    Stack<Integer> s= new Stack<>();
    public void stackArrange()
    {
        System.out.println("Enter stack size");
        int stackSize=sc.nextInt();
        for(int i=0;i<stackSize;i++)
        {
            int number= sc.nextInt();
            s.add(number);
        }
        System.out.println(s);
        System.out.println("Sorting elements");
        Collections.sort(s);
    }

}
public class stackOrder
{
    public static void main(String[] args) {
       stack1 s1=new stack1();
       s1.stackArrange();

    }
}
