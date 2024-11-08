import javax.lang.model.element.Element;
import java.util.*;
public class zeroesAndOnes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        ArrayList<Integer> a0 = new ArrayList<>();
        ArrayList<Integer> a1= new ArrayList<>();
        System.out.println("Enter 7 zeroes and ones randomly");
        for(int i=0;i<7;i++) {
            int a=sc.nextInt();
            if(a==0)
                a0.add(a);
            else
            a1.add(a);
        }
        System.out.println(a0);
        System.out.println(a1);
        System.out.println(a0.addAll(a1));
        System.out.println(a0);

    }
}
