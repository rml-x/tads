import java.util.Scanner;

public class senha 
{
    public static void main(String[] args) 
    {   
        String senha = "12345";
        int count = 0;
        String entrada;

        Scanner input = new Scanner(System.in);
        System.out.println("insira a senha numerica: ");  
        
        entrada = input.next();
        //System.out.println("teste " + entrada);

        if (senha.equals(entrada)) 
        {
            System.out.println("iguais");
        } 
        else
        {
        System.out.println("diferentes, tente novamente");

        while (senha.equals(entrada) == false) 
        {
            count++;
            //System.out.println("tente outra senha");
            System.out.println("numero de tentativas: "+ count);
            entrada = input.next();
        }
            System.out.println("senha correta");
        }

    }    
}
