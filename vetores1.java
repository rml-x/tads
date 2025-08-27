import java.util.Scanner;

public class vetores1 
{
    public static void main(String[] args) {

         Scanner in = new Scanner(System.in);

         int [] vetor;
         vetor = new int[10];// precisa inicializar ele com valor assim, null da erro

         int [] vetor2;
         vetor2 = new int[10];
        

         System.out.println("informe os 10 numeros");
         
         for (int posicao = 0; posicao < 10; posicao++) {
             vetor[posicao] = in.nextInt();
            
            if (posicao % 2 == 0) {
                //System.out.println("posicao par");
                vetor2[posicao] = vetor[posicao] / 2;

            } 
            else {
                //System.out.println("posição impar");
                vetor2[posicao] = vetor[posicao] * 3;
            }
         }

          for (int i = 0; i < vetor.length; i++) {
                System.out.print(" , " + vetor[i]);
            }
            
            for (int i = 0; i < vetor2.length; i++) {
                System.out.print(" , " + vetor[i]);
            }
    }    
}
