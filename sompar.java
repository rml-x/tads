import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class sompar 
{
    public static void main(String[] args) 
    {
        int numero = 0 ;
        int counter = 2;

        Scanner input = new Scanner(System.in);
        System.out.println("insira um numero inteiro qualquer: ");

        numero = input.nextInt();

        /*while (counter <= numero) 
        {
            System.out.println(counter);
            counter = counter + 2;    
        }*/
        for(counter = 2 ; counter <= numero; counter = counter+ 2 ) 
        System.out.println(counter);
    
    }
}
