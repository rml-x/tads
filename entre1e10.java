import java.util.Scanner;

public class entre1e10 
{
    public static void main(String[] args) 
    {
        int num = 0; 
        int multiplicacao = 1;
        int i;
        int soma = 0;

        Scanner input = new Scanner(System.in);
        
        System.out.println("insira um numero qualquer: ");

        num = input.nextInt();

        for(i = 1; i <= 10 ; i++)
        {
           
            if (num >= 0 && num <= 10) {
            System.out.println(num + " esta entre 1 e 10 ");
            multiplicacao = num * multiplicacao;
            num = input.nextInt();

            }
            else
            {
                System.out.println(num + " não esta entre 1 e 10 ");
                soma = num + soma;
                num = input.nextInt();
                
    
            } 
            
        }
                System.out.println(multiplicacao);
                System.out.println(soma); 
    }    
}
