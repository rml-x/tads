import java.util.Scanner;

public class somaposicoes 
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] vetor;
        vetor = new int[8];

        System.out.println("preencher vetor");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
        }
        
        System.out.println("agora escolha duas posições x e y");
        int x = in.nextInt();
        int y = in.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (x == i) {
                //System.out.println(x + " igual a posicao " + i + " nela esta " + vetor[i]);
            }

            if (y == i) {
                //System.out.println(y + " igual a posicao " + i + " nela esta " + vetor[i]);
            }
        }
        System.out.println("soma de x e y");
        int soma = vetor[x] + vetor[y];
        System.out.println(soma);
    }
}
