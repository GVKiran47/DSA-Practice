import java.util.jar.JarOutputStream;

public class swap {
    public void swapper()
    {
        int a=44;
        int b=55;
        int temp;
       temp=b;
       b=a;
       a=temp;
        System.out.println("a is now"+" "+ a);
        System.out.println("b is now"+" "+b);
    }
    public static void main(String[] args) {
        swap ss= new swap();
        ss.swapper();

    }
}
