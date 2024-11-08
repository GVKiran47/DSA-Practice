import java.util.*;
class Palindrome1
{
    String[] array={"k","i","r","a","n"};
    public void stringReverser()
    {
        for(int i=array.length;i<=0;i--)
        {
            System.out.println(array[i]+" ");
        }
    }
}
public class Palindrome
{
    public static void main(String[] args) {
        Palindrome1 p=new Palindrome1();
        p.stringReverser();

    }
}
