import java.util.Scanner;

public class fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c;
        int lim = 0;
        int cont = 1;

        System.out.println("sequencia de fibonacci, introduza um numero: ");
        lim = in.nextInt();

        while ( cont <= lim) 
        {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;

        cont ++;    
        }
    }    
}
