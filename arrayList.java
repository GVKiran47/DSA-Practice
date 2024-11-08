import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        //add element
        list1.add(0);
        list1.add(8);
        list1.add(2);

        //add element at a specific index
        list1.add(2,45);
        int ele=list1.get(0);

        //printing arrayList
        System.out.println(ele);
        System.out.println(list1);

        // size of arraylist
        int a = list1.size();
        System.out.println(a);

        //sort
        Collections.sort(list1);
        System.out.println(list1);
    }
}
