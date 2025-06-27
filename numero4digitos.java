import java.util.Scanner;

public class numero4digitos 
{// pesquisar números de 4 dígitos com propriedade específica (tipo 3025)
    // 30 + 25 == 55 e 55^2 == 3025
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("numeros entre 1000 e 9999 com a mesma propiedade de 3032");
       

        for (int i = 1000; i < 9999; i++) {

        int resto = i / 100; //primeira parte
        int resto1 = i % 100; //segunda parte
        int soma = resto + resto1;
        int quadrado = soma * soma;

        if (quadrado == i) {
            System.out.println("o numero " + i + " compartilha da mesma propriedade que 3025");
        }
        
        }
        
    
        //System.out.println(resto);
        //System.out.println(resto1);
    }    
}
