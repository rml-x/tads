import java.util.Scanner;

public class mediaslimit 
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in)) {
            float nota = 0;
            float soma = 0;
            int i; 
            float media;

            System.out.println("insira as 5 notas:");

            for(i = 0; i < 5 ; i++){     
            nota = input.nextFloat();
            soma = nota + soma;
            
            }

            media = soma / 5;

            System.out.println(soma);
            System.out.println(media);
            input.close();
        }
    }   
     
}
