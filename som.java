import java.util.Scanner;

public class som 
{
public static void main(String[] args) 
{
    int numero = 0 ;
    int counter = 1;

    Scanner input = new Scanner(System.in);
    System.out.println("insira um numero inteiro qualquer: ");

    numero = input.nextInt();
    
    System.out.println("agora iremos contar de 1 até " + numero);
     
    /*for(counter = 1; counter <= numero ; counter++)
    System.out.println(counter);*/

    while (counter <= numero) {
        System.out.println(counter);
        counter++;
    }

    




}    
}
