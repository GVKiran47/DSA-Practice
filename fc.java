public class fc {
    int i=10;int fac=1;
    public void fact()
    {
        for(int i=1;i<=4;i++)
        {
            fac=fac*i;
        }
        System.out.println(fac);
    }

    public static void main(String[] args) {
        fc f= new fc();
        f.fact();

    }
}
