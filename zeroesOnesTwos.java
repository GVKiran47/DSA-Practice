import java.util.Arrays;

public class zeroesOnesTwos {


    static int zeroesCounter,onesCounter,twosCounter;

    public static void sort012(int[] a,int N)
    {
        for(int i=0;i<N;i++)
        {
            if(a[i]==1)
            {
                onesCounter++;
            } else if (a[i]==0) {
                zeroesCounter++;
            }
            else {
                twosCounter++;
            }
        }
        int tracker=0;
        for(int i=0;i<zeroesCounter;i++)
        {
            a[tracker++]=0;
        }
        for(int i=0;i<=onesCounter;i++)
        {
            a[tracker++]=1;
        }
        for(int i=onesCounter;i<twosCounter;i++)
        {
            a[tracker++]=2;
        }


    }
    public static void main(String[] args) {
        zeroesOnesTwos z1= new zeroesOnesTwos();
         int[] a={0 ,2 ,1 ,2 ,0};
         int N=a.length;
         sort012(a,N);
         for (int i=0;i<N;i++)
         {
             System.out.println(a[i]+" ");
         }


    }
}
