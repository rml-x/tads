import java.util.Scanner;

public class ex5 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        float pop1,pop2,t1,t2;
        int anos = 0;

        System.out.println("informe a população e a taxa do primeiro país: ");
        pop1 = in.nextInt();
        t1 = in.nextFloat();

        System.out.println("informe a população e a taxa do segundo país: ");
        pop2 = in.nextInt();
        t2 = in.nextFloat();

        // pais 2 n ultraṕassa se a taxa for menor q a do pais 1 
        if (t2 <= t1) {
            System.out.println("o segundo país nunca irá ultrapassar o primeiro");
        }
        

        while (pop2 < pop1) 
        {
            pop2 = pop2 * (1 + t2/100);
            pop1 = pop1 * (1 + t1/100);
            
            anos++;

            System.out.println("ano " + anos);
            System.out.println("pop1 " + pop1);
            System.out.println("pop2 " + pop2);

            
        }
        System.out.println("o segundo pais ira levar "+ anos + " para ultrapassar o primeiro");
        
    }
}
