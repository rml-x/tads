import java.util.Scanner;

public class IdadesGrupo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int idade;
        int totalIdades = 0;
        int quantidade = 0;
        int menorIdade = 99;
        int maiorIdade = 1;

        System.out.println("Digite as idades (0 para encerrar):");

        while (true) {
            idade = scanner.nextInt();

            if (idade == 0) {//encerra o programa
                break;
            }

            totalIdades += idade;
            quantidade++;

            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
        }

        if (quantidade == 0) {
            System.out.println("Nenhuma idade válida foi informada.");
        } else {
            double media = (double) totalIdades / quantidade;
            System.out.println("Número de pessoas: " + quantidade);
            System.out.printf("Idade média: %.2f%n", media);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Maior idade: " + maiorIdade);
        }

        scanner.close();
    }
}
