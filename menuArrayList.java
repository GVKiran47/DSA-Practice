import java.util.*;
public class menuArrayList
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a= new ArrayList<>();
      a.add(5);
      a.add(4);
      a.add(3);
      a.add(2);
      a.add(1);

        System.out.println("enter your choice among 1,2,3,4");
        int choice= sc.nextInt();
        System.out.println("enter an element");
        int ele=sc.nextInt();
        if(choice==1)
        {
            System.out.println("adding teh element");
            a.add(ele);
            System.out.println(a);
        }
        else if (choice==2)
        {
            if(!a.contains(ele))
                System.out.println("element can't be remkooed");
            else
                a.remove(ele);
            {
                System.out.println(a);
            }

        } else if (choice==3) {
            System.out.println(ele);

        }
        else
        {
            System.out.println("byee");
            System.out.println(a);
        }


    }
}
