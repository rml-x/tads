import java.util.Scanner;

public class populaçao 
{
    public static void main(String[] args) //Simulação de crescimento populacional, quanto tempo para A superar B
    {// sendo popA < popB
        //Simulação de crescimento populacional
        Scanner in = new Scanner(System.in);
        float popA = 100;
        float popB = 300;
        double taxaA = 0.03;
        double taxaB = 0.015;
        int anos = 0;

        while (popA < popB) 
        {
          popA = (float) (popA * (1 + taxaA));
          popB = (float) (popB * (1 + taxaB));

          anos ++;

        }
        System.out.println("levou " + anos + " anos");
        System.out.printf("população final de A: %.2f\n", popA);
        System.out.printf("população final de B: %.2f\n", popB);

    }

  
}
