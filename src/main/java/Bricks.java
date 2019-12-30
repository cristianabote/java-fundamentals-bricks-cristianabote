public class Bricks {
    public static void main(String[] args)
    {
        int i,n=30;
        System.out.println("Numarul de caramizi n=" + n);
        // cin>>n;
        for(i=1;n-3*i>0;i++)
            n=n-3*i;
        if(n-i<=0)
            System.out.println("Patlu wins");
        else
            System.out.println("Motu wins");

    }
}
