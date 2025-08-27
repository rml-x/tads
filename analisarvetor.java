import java.util.Scanner;

public class analisarvetor 
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int [] vetor;
        vetor = new int[10];

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int posicaomaior = 0;
        int posicaomenor = 0;

        System.out.println("insira os valores");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > maior) {
                maior =  vetor[i];
                posicaomaior = i;
            }

            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaomenor = i;
            }
        }
        System.out.println(maior + " na posição " + posicaomaior );
        System.err.println(menor + " na posição " + posicaomenor );
    }
}
