import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack s2=new Stack();
        s2.add(4);
        s2.add(5);
        s2.add(60);
        System.out.println(s2);
        try {
            for (int i = 0; i < s2.capacity(); i++) {
                System.out.println(s2.pop());
            }
        }catch (EmptyStackException e)
        {
            System.out.println("empty stack error");
        }
        if(!s2.isEmpty())
        {
            System.out.println(s2);
        } else if (s2.isEmpty()) {
            System.out.println("no element found");
        }
    }
}
