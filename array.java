class define
{
    int[] arr={4,6,3,5,8,2};
    int targetAmount=8;
    public void sumChecker()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(arr[i]+arr[j]==targetAmount)
                {
                    System.out.println(arr[i]+" "+"+"+arr[j]+"give us the target");
                }
                else
                {
                    continue;
                }
            }

        }
    }

}
class array
{
    public static void main(String[] args) {
        define df= new define();
        df.sumChecker();
    }
}
