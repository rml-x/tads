import java.util.Scanner;

public class matrizdpri 
{
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);

        int matriz [][];
        matriz = new int[5][5];

        System.out.println("inisira os numeros");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {//printando a matriz
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {//transpondo a matriz
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {// transformando em matriz imagem
            for (int j = 0; j < 5; j++) {
                if (matriz[i] == matriz[j]) {
                    matriz[i][j] = 1;
                }
                if (matriz[i] != matriz[j]) {
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println();

         for (int i = 0; i < 5; i++) {//printando a matriz
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
