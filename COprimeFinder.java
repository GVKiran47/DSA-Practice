class COPrimeFinder{
    int count;
    boolean False;
    public void phi(int n)
    {
        if(isPrime(n) == true)
        {
            int possibleCofactors=n-1;
            System.out.println("number of coprimes are"+" "+possibleCofactors);
        }

    }
    public boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }

        }
        if(count>2)
        {
            boolean True;
            System.out.println(n+" "+"is prime");

        }
        return false;
    }
    public static void main(String[] args) {

        COPrimeFinder cp = new COPrimeFinder();
        int n=45;
        cp.isPrime(n);
        cp.phi(n);


    }
}


/* 1) n is prime
   2) n is multiple of two prime numbers
   3) n is a multiple  of two composite or one prime and one composite

   ans: for 1) phi(n)=n-1
        for 2) phi(n)= (p-1)*(q-1) {p,q are prime number}
        for 3) phi(n)= n*(1-(1/p1)*1-(1/p2)...)
               {p1 and p2 are  prime factors of given n}
            */