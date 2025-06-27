import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Contadores e acumuladores
        int funcionariasConcursadas = 0;
        int totalHomens = 0;
        int maiorIdadeHomensConcursados = 0;
        int mulheres30SemConcurso = 0;
        int totalConcursados = 0;
        float somaAlturasHomensMenor40 = 0;
        int qtdeHomensMenor40 = 0;

        // Entrada
        System.out.print("Digite a matrícula (0 para sair): ");
        int matricula = in.nextInt();

        while (matricula != 0) {
            System.out.println("idade: ");
            int idade = in.nextInt();

            System.out.println("sexo(m/f): ");
            char sexo = in.next().toLowerCase().charAt(0);

            System.out.println("altura: ");
            float altura = in.nextFloat();

            System.out.println("concursado(s/n): ");
            char concursado = in.next().toLowerCase().charAt(0);

            if (sexo == 'f' && concursado == 's') { //quantidade de funcionarias concursadas
               funcionariasConcursadas++; 
            }
            if (sexo == 'm') { //quantidade de homens
               totalHomens++; 
            }
            if (sexo == 'm' && concursado == 's' && idade > maiorIdadeHomensConcursados) { //maior idade homens concursados
               maiorIdadeHomensConcursados = idade; 
            }
            if (sexo == 'f' && concursado == 'n' && idade > 30) { //quantidade de funcionarias + 30 sem concurso
               mulheres30SemConcurso++; 
            }
            if (concursado == 's') { //quantidade de concursados
               totalConcursados++; 
            }
            if (sexo == 'm' && idade < 40 ) { //media altura homens - 40
               qtdeHomensMenor40++; 
               somaAlturasHomensMenor40 = somaAlturasHomensMenor40 + altura;

               
            }

            System.out.println("para sair digite 0");
            matricula = in.nextInt();
        }
       
        

        System.out.println("\nResultados:");
        System.out.println("a) Funcionárias concursadas: " + funcionariasConcursadas);
        System.out.println("b) Total de funcionários homens: " + totalHomens);
        System.out.println("c) Maior idade dos homens concursados: " + maiorIdadeHomensConcursados);
        System.out.println("d) Mulheres com mais de 30 anos sem concurso: " + mulheres30SemConcurso);
        System.out.println("e) Total de concursados(as): " + totalConcursados);

         if (qtdeHomensMenor40 > 0) {
             float MediaAlturas = somaAlturasHomensMenor40 / qtdeHomensMenor40;
             System.out.printf("f) Média de altura dos homens < 40 anos: %.2f\n" +  MediaAlturas);
        }
        

    }
}
