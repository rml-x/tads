import java.util.Scanner;

public class vetoresquadrados 
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int [] vetorquadrado;
        vetorquadrado = new int[10];

        int [] vetor; 
        vetor = new int[10] ;

        System.out.println("insira os 10 numeros");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
        }
        for (int i = 0; i < vetorquadrado.length; i++) {
            vetorquadrado[i] = vetor[i] * vetor[i];
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " , ");
        }
        System.out.println();
        for (int i = 0; i < vetorquadrado.length; i++) {
            System.err.print(vetorquadrado[i] + " , ");
        }

    }
}
