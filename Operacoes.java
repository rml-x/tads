import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n, soma, quad, ante, div2, div3;
        n = in.nextInt();
        soma = n + n; 
        quad = n * n;
        ante = n - 1;
        div2 = n/2;
        div3 = n/3;
        
        System.out.println("soma com ele mesmo: " + soma);
        System.out.println("esse numero ao quadrado: " + quad);
        System.out.println("o antecessor dele: " + ante);
        System.out.println("ele dividido por 2: " + div2);
        System.out.println("ele dividido por 3: " + div3);
    }
}