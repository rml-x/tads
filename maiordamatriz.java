import java.util.Scanner;

public class maiordamatriz 
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

       int [][] matriz;
       matriz = new int[4][4];
       int maior = Integer.MIN_VALUE;
       int posicaocol = 0, posicaolinha = 0;
       

       System.out.println("insira os numeros da matriz");

       for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            matriz[i][j] = in.nextInt();
        }
       }
       System.out.println();

       for (int i = 0; i < 4; i++) {//printando a matriz
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
       }
       System.out.println();

       for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

            if (matriz[i][j] > maior) {
                maior = matriz[i][j];
                posicaolinha = i;
                posicaocol = j;
            }
        }
       }
       System.out.println(maior + " na posição " + posicaolinha + " , " + posicaocol);
    }
}
