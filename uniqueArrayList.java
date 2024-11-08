import java.util.*;
public class uniqueArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Enter 5 integers");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++) {
            int temp = sc.nextInt();
            if(!a.contains(temp))
                a.add(temp);
        }
        Collections.sort(a);
        System.out.println(a);

    }
}
