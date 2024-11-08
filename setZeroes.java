import java.util.*;
 class setZero {
    public void setZeroes1(int[][] matrix)
    {
        int rows=matrix.length;
        int cols= matrix.length;
        Set<Integer> rowSet= new HashSet<>();
        Set<Integer> colSet= new HashSet<>();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]==0)
                {
                    rowSet.add(i);
                    colSet.add(j);
                }

            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(rowSet.contains(i) || colSet.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
class setZeroes
{
    public static void main(String[] args) {
        setZero s1=new setZero();
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        s1.setZeroes1(matrix);
        System.out.println(matrix[0][0]);

    }
}
