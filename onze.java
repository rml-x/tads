import java.util.Scanner;

public class onze 
{
    public static void main(String[] args) 
    {
        int num1 = 0;
        int num2 = 0;
        int div = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("insira dois numeros para dividir: ");

        num1 = input.nextInt();
        num2 = input.nextInt();

        
          

            while (num2 == 0) 
            {
                System.out.println("zero não é valido!!!! insira outro número: ");
                num2 = input.nextInt();
                
            }   
         
        
        
           div = num1/num2;
           System.out.println(div); 
        

    }    
}
