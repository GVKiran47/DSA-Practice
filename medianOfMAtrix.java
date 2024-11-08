import java.util.*;
public class medianOfMAtrix {
    int[][] arr={{1,3,5},{2,6,9},{3,6,9}};
   // int x=((arr.length+1)/2);

    ArrayList<Integer> ab= new ArrayList();
    public void median()
    {
        for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr.length;j++)
          {
              ab.add(arr[i][j]);
          }

        }
        Collections.sort(ab);
        System.out.println(ab);
        //System.out.println(ab.get(x));
        System.out.println(ab.get((ab.size())/2));

    }
    public static void main(String[] args) {
        medianOfMAtrix mmx= new medianOfMAtrix();
        mmx.median();

    }
}
