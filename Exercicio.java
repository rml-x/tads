import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite quantas crianças tem: ");
        int criancas, balas, div1, resto;

        criancas = in.nextInt();
        
        System.out.println("Digite quantas balas tem: ");

        balas = in.nextInt();

        div1 = criancas/balas;
        
        System.out.println("Cada crianca recebe: " + div1);

        
        resto = balas % criancas;


        System.out.println("Sobra: " + resto);

        
        
    }
}