import java.util.Scanner;

public class mediasmaiores 
{
    public static void main(String[] args) 
    {

        float nota1, nota2, nota3, media;
        float soma = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("insira as 3 notas: ");
        nota1 = input.nextInt();
        nota2 = input.nextInt();
        nota3 = input.nextInt();
        

        if (nota3 < nota1 && nota3 < nota2 ) 
        {
            System.out.println(nota3 + " é a menor nota");
            soma = nota1 + nota2;   
        }
        else if (nota2 < nota1 && nota2 < nota3 )
        {
            System.out.println(nota2 + " é a menor nota");
            soma = nota1 + nota3;
        }
        else if (nota1 < nota2 && nota1 < nota3 )
        {
            System.out.println(nota1 + " é a menor nota");
            soma = nota2 + nota3;
        }
        media = soma/2;
        System.out.println("media final " + media);
        input.close();
    }    
}
