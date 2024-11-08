public class duplicateNumber {
    int[] arr={3,1,3,4,2};
    int count=0;
    public void duplicateFinder()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                else {
                    continue;
                }
            }
            System.out.println(arr[i]+" "+"has repeated"+" "+count+" "+"times");
            count=0;

        }
    }
    public static void main(String[] args) {
        duplicateNumber dn= new duplicateNumber();
        dn.duplicateFinder();

    }
}
