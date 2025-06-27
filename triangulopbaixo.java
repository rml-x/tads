import java.util.Scanner;

public class triangulopbaixo 
{
    public static void main(String[] args) //Impressão de triângulo virado pra baixo com asteriscos 
    {
       Scanner in = new Scanner(System.in); 
       int num = 0;

       System.out.println("digita um numero: ");
       num = in.nextInt();
       
       for (int i = num ; i >= 1; i--) // calculo da linha 
       {
           int estrelas = 2 * i - 1; // calculo de * por linha   

            for (int j = 1; j <= estrelas ; j++) // responsavel pela impressão das * de fato
            {
             System.out.print("*"); 
            }

            System.out.println(" ");// imprimiu todas as * da linha, nova linha
       }

    }    
}
