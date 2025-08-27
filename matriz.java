import java.util.Scanner;

public class matriz 
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int[][] matriz;           // apenas declaração
        matriz = new int[4][4];   // cria matriz 4 linhas x 4 colunas
        int maiorQueDez = 0;
        

        System.out.println("preencher matriz");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz [i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
                System.out.println();
        }
        

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                if (matriz[i][j] > 10) {
                    maiorQueDez++;
                }
            }
        }
        System.out.println(maiorQueDez);
    }    

}
