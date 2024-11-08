import java.util.ArrayList;

public class unionIntersection {
    int[] a= {3};
    int[] b={1,2,3};
    ArrayList<Integer> bb= new ArrayList<>();
    ArrayList<Integer> cc= new ArrayList<>();
    ArrayList<Integer> union = new ArrayList<>();
    ArrayList<Integer> intersection= new ArrayList<>();
    public void union1()
    {
        for(int i=0;i<a.length;i++)
        {
            bb.add(a[i]);
        }
        for(int j=0;j<b.length;j++)
        {
            cc.add(b[j]);
        }
        for(int i=0;i<bb.size();i++)
        {
            if(!union.contains(bb.get(i)))
            {
                union.add(bb.get(i));
            }

        }
        for(int j=0;j<cc.size();j++)
        {
            if(!union.contains(cc.get(j)))
            {
                union.add(cc.get(j));
            }
        }
        System.out.println("union"+" "+"is"+" "+union);
    }
    public void intersection1()
    {
        for(int i=0;i<bb.size();i++)
        {
            for(int j=0;j<cc.size();j++)
            {
                if(a[i]==b[j])
                {
                    intersection.add(bb.get(i));
                }
            }
        }
        System.out.println("intersection is"+" "+intersection);

    }

    public static void main(String[] args) {
        unionIntersection u = new unionIntersection();
        u.union1();
        u.intersection1();

    }
}
