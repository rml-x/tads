import java.util.Scanner;

public class umedez 
{
    public static void main(String[] args) 
    {
        int numero = 0;
        boolean loop = false;
        Scanner input = new Scanner(System.in);

        System.out.println("insira um numero entre 1 e 10: ");
        numero = input.nextInt(); 

        if (numero > 1 && numero < 10) 
        {
            System.out.println("esse numero está entre 1 e 10");
            
        } 
        else
        {
           loop = true;
        }

        while (loop) {
            System.out.println("erro. insira outro numero: ");
            numero = input.nextInt();

            if (numero > 1 && numero < 10) 
        {
            System.out.println("esse numero está entre 1 e 10");
            loop = false;
            
        } 
        }

    }    
}
