import java.util.Scanner;

public class primo 
{
    public static void main(String[] args) 
    {
        int numero = 0;
        int counter = 2;
        boolean eprimo = true;

        Scanner input = new Scanner(System.in);
        System.out.println("insira um numero para descobrir se ele é primo: ");

        numero = input.nextInt();

        while (counter * counter <= numero) 
        {
          if (numero % counter == 0) {
            eprimo = false;
            
          } 
          counter++;
            

        }

        if (numero < 2) {
            System.out.println("não é primo");
        } 
        else if (eprimo == true) {
            System.out.println("é primo");
        }
        else{
            System.out.println("não é primo");
        }


    }
}
