public class pattern1 {
    public static void main(String[] args) {
        for(int i =0;i<5;i++)
            for(int j=0;j<=i;j++)
                if (j>=i)
                {
                    System.out.println(" ");
                }
        else
                    System.out.print("*"+ " ");
    }
}