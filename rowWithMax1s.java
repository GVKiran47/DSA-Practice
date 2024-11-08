import java.util.*;
public class rowWithMax1s {
    int[][] matrix = {{1,1,1},{0,1,0},{0,1,1}};
    int firstRowCounter;
    int secondRowCounter;
    int thirdRowCounter;
    int highestValue;
    HashMap<String,Integer> hs = new HashMap<>();
    public void onesCalci()
    {
       for(int j=0;j<matrix.length;j++)
       {
           if(matrix[0][j]==1)
           {
               firstRowCounter++;
               hs.put("first Row",firstRowCounter);
           }
       }
        for(int j=0;j<matrix.length;j++)
        {
            if(matrix[1][j]==1)
            {
                secondRowCounter++;
                hs.put("second Row", secondRowCounter);
            }
        }
        for(int j=0;j<matrix.length;j++)
        {
            if(matrix[2][j]==1)
            {
                thirdRowCounter++;
                hs.put("third Row",thirdRowCounter);
            }
        }
        System.out.println(hs);
        if(firstRowCounter>secondRowCounter && firstRowCounter>thirdRowCounter)
        {
            System.out.println("row 1 has more ones i.e"+" "+firstRowCounter+" "+"ones");
        }
        if(secondRowCounter>thirdRowCounter && secondRowCounter>firstRowCounter)
        {
            System.out.println("row 2 has more ones i.e"+" "+secondRowCounter+" "+"ones");
        }
        if(thirdRowCounter>firstRowCounter && thirdRowCounter>secondRowCounter)
        {
            System.out.println("row 3 has more ones i.e"+" "+thirdRowCounter+" "+"ones");
        }
        else if(firstRowCounter==secondRowCounter)
        {
            System.out.println("first and second row have same no.of ones i.e"+" "+firstRowCounter);
        }
        else if(secondRowCounter==thirdRowCounter)
        {
            System.out.println("third and second row have same no.of ones i.e"+" "+secondRowCounter);
        }
        else if(thirdRowCounter==firstRowCounter)
        {
            System.out.println("first and third row have same no.of ones"+" "+thirdRowCounter);
        }



    }
    public static void main(String[] args) {
        rowWithMax1s r = new rowWithMax1s();
        r.onesCalci();

    }
}
