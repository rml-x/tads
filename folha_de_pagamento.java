import java.util.Scanner;

public class folha_de_pagamento 
{
    public static void main(String[] args) 
    {
        String nome = "";
        double horas = 0;
        double valor = 0;
        double pagamento = 0;
        int total_funcionarios = 0;
        double horasExtra = 0;
        double bonus = 0;

        int i;

        Scanner input = new Scanner(System.in);

        System.out.println("insira o total de funcionarios, após, insira cada um funcionario, horas trabalhadas e valor da hora para obter o pagamento bruto.");

        total_funcionarios = input.nextInt();
        input.nextLine();
        System.out.println("temos "+ total_funcionarios + " funcionarios essa semana");
        System.out.println("agora as informações, de o nome, horas trabalhadas e o valor da hora...");

        for(i = 0 ; i < total_funcionarios ; i++)
        {
            nome = input.nextLine();
            horas = input.nextDouble();
            valor = input.nextDouble();
            input.nextLine();
            
            pagamento = horas * valor;

            if (horas > 40) 
            {
                horasExtra = horas - 40;
                System.out.println("total de horas extras: "+ horasExtra);

                bonus = valor * 0.5;

                double pagamento_com_bonus = (bonus * horasExtra) + horas * valor;

                System.out.println("pagamento: " + pagamento_com_bonus);
                System.out.println("insira o proximo funcionario e suas informações: ");
            }
            
        }

        

    }
}
