import java.util.Scanner;

public class compararaçãoidades 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int H1,H2,M1,M2;
        int MH,NH,MM,NM;
        int calc1 = 0;
        int calc2 = 0;

        System.out.println("introduza as idades dos homens e mulheres: ");

        H1 = in.nextInt();
        H2 = in.nextInt();
        M1 = in.nextInt();
        M2 = in.nextInt();

        if (H1 < H2) {
            MH = H2;
            NH = H1;
            System.out.println("O homem de " + H2 + " é mais velho que o de "+ H1);
        } else {
            MH = H1;
            NH = H2;
            System.out.println("O homem de " + H1 + " é mais velho que o de "+ H2);
        }
        
        if (M1 < M2) {
            MM = H2;
            NM = H1;
            System.out.println("A mulher de " + M2 + " é mais velha que a de "+ M1);
        } else {
            MM = M1;
            NM = M2;
            System.out.println("A mulher de " + M1 + " é mais velha que a de "+ M2);
        }
        System.out.println("calculando. . .");

        calc1 = MH + NM; 
        calc2 = NH * MM;

        System.out.println( " resultado: "+ calc1 + "e"+ calc2);
        System.out.println("homem mais velho: "+ MH);
        System.out.println("homem mais novo: "+ NH); 
        System.out.println("mulher mais velha: "+ MM);
        System.out.println("mulher mais nova: "+ NM);

    }    
}
