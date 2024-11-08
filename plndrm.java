public class plndrm {
    String word = "mumma";
    String rev="";
    public void plndrmChecker()
    {
        for(int i=word.length()-1;i>=0;i--)
        {
            rev=rev+word.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(word))
        {
            System.out.println("pldrm");
        }
        else {
            System.out.println("not pldrm");
        }



    }
    public static void main(String[] args) {
        plndrm p = new plndrm();
        p.plndrmChecker();

    }
}
