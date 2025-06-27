import java.util.Scanner;

public class numperf {
    // Números perfeitos entre 1 e 1000
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Números perfeitos entre 1 e 1000:");

        int n = 1;

       while (n < 1000) 
       {
        int soma_div = 0;
        int contador = 1;

        while (contador < n ) 
        {
            if (n % contador == 0) 
            {
                soma_div = soma_div + contador;
            }
            contador ++;
        }
        
        if (soma_div == n) 
            {
                System.out.println("parabens " + n + " é perfeito");
            }
            n ++;
       }
    }
}