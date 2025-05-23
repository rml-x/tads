import java.util.Scanner;

public class mediapareseimpares 
{
    public static void main(String[] args) 
    {   
        int num = 0;
        int media_par;
        int media_impar;

        int soma_par = 0;
        int soma_impar = 0;

        int maior_par = 0; 
        int maior_impar = 0 ;


        Scanner input = new Scanner(System.in);
        System.out.println("insira os valores, lembrando que para encerrar é necessario digita rum numero negativo.");
        
        num = input.nextInt();

        while (num > 0) 
        {
           if (num % 2 == 0) 
           {
            System.out.println("é par");
            
            if (num > maior_par) 
            {
                maior_par = num;
                System.out.println("maior numero par atual: " + maior_par);
            }

            soma_par = num + soma_par;
            System.out.println("soma atual pares "+ soma_par);
            num = input.nextInt();

            
           }
           else
           {
            System.out.println("não é par");

            if (num > maior_impar) 
            {
                maior_impar = num;
                System.out.println("maior numero impar atual: " + maior_impar);
            }

            soma_impar = num + soma_impar;
            System.out.println("soma atual impares "+ soma_impar);
            num = input.nextInt();

            
           } 

        }

       
    }    
}
