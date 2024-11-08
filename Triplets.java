public class Triplets {
    public static void main(String[] args) {
        int[] arr1={1,1,0,-1,-2};
        int[] arr2={};
        int[] arr3={};
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=1;j<arr1.length;j++)
            {
                for(int k=2;k<arr1.length;k++)
                {
                    if(arr1[i]+arr1[j]+arr1[k]==0)
                    {
                        System.out.println(arr1[i]+"," + arr1[j]+","+arr1[k]+" "+"gives sum zero");

                    }
                }
            }
        }
    }
}
