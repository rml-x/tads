import java.util.Scanner;

public class SerieEuler 
{
    public static void main(String[] args) {
        // Série de E até o valor de `n`

        Scanner in = new Scanner(System.in);
        System.out.println("insira um valor para n: ");
        int n = in.nextInt();
        double E = 1.0;

        for (int i = 1; i <= n; i++) {// percorrendo diferentes numeros entre 1 e n, se usa esse para percorrer os diferentes fatoriais
            int fatorial = 1;// primeiro numero de fatorial é 1
            for (int j = 1; j <= i ; j++) {//metodo para calcular fatorial de um numero
                fatorial = j * fatorial;
            }
           E = E + 1.0 / fatorial; 
           
        }
        System.out.println(E);
    }    
}
