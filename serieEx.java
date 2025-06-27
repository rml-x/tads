import java.util.Scanner;

public class serieEx 
{
    public static void main(String[] args) {
        //Cálculo de `e^x` com os 10 primeiros termos da série

        Scanner in = new Scanner(System.in);

        System.out.println("digite um valor para x: ");
        double x = in.nextInt();

         double resultado = 1.0;

         for (int i = 1; i <= 10; i++) {// percorrendo diferentes numeros entre 1 e x, se usa esse para percorrer os diferentes fatoriais
            int fatorial = 1;// primeiro numero de fatorial é 1
            for (int j = 1; j <= i ; j++) {//metodo para calcular fatorial de um numero
                fatorial = j * fatorial;
            }

           double potX = 1.0; 
           for (int p = 1; p <= i; p++) {//calculo da potencia
            potX = x * potX;
           }

           resultado = resultado + potX / fatorial;
        }    
        System.out.printf("Aproximação de e^%.2f: %.10f\n", x, resultado);
    }
}
