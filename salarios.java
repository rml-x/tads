import java.util.Scanner;

public class salarios 
{
// Salários por sexo, média e máximos feminino e masculino   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        double MediaSalarioFem = 0; double MediaSalarioMasc = 0; 
        double AcumuladorFem = 0;   double AcumuladorMasc = 0;
        double MaiorSalarioFem = 0; double MaiorSalarioMasc = 0;
        int totalFem = 0;           int totalMasc = 0;

        System.out.println("digite o numero de funcionarios");
        int totalFuncionarios = in.nextInt();

        for (int i = 0; i < totalFuncionarios; i++) {

            System.out.println("nome: ");
            String nome = in.next().toLowerCase();

            System.out.println("sexo(m/f): ");
            char sexo = in.next().toLowerCase().charAt(0);

            System.out.println("salario: ");
            double salario = in.nextDouble();

            if (sexo == 'f') { // salarios femininos e maior salario fem

                AcumuladorFem = AcumuladorFem + salario;
                totalFem ++;

                if (salario > MaiorSalarioFem) {
                    MaiorSalarioFem = salario;
                }
            }

            if (sexo == 'm') { // salarios masculinos e maior salario masc

                AcumuladorMasc = AcumuladorMasc + salario;
                totalMasc ++;

                if (salario > MaiorSalarioMasc) {
                    MaiorSalarioMasc = salario;
                }
                
            }

        }//fim do laço, abaixo resultados!!!

        System.out.println("Resultados: ");
            System.out.println("maior salario fem :" + MaiorSalarioFem);
            System.out.println("maior salario masc :" + MaiorSalarioMasc);
            
            if (totalFem > 0) 
            {
               MediaSalarioFem = AcumuladorFem / totalFem; 
            }

            if (totalMasc > 0) 
            {
               MediaSalarioMasc = AcumuladorMasc / totalMasc; 
            }

            System.out.println("media salario fem: "+ MediaSalarioFem);
            System.out.println("media salario masc: "+ MediaSalarioMasc);
        
    }
}
