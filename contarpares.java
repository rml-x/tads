import java.util.Scanner;

public class contarpares 
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int [] vetor;
        vetor = new int[10];

        int contadorDePares = 0;

        System.out.println("insira os 10 numeros");

        for (int i = 0; i < vetor.length; i++) {
         vetor[i] = in.nextInt();
    
         }

        for (int j = 0; j < vetor.length; j++) {
            
            if (vetor[j] % 2 == 0) {// se true ent é par
                contadorDePares++;
                System.out.print(vetor[j] + " é par ");
        }

         }
         
        System.out.println("o vetor tem " + contadorDePares + " numeros pares");
    }    
}
