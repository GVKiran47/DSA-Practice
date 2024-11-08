public class hollowSquaare
{
    public static void main(String[] args) {
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<4;col++)
            {
                if(row==1&&col==1 || row==1&&col==2)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }System.out.println();
        }




        }
    }
