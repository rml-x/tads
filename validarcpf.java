import java.util.Scanner;

public class validarcpf 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("insira seu cpf, confia ;)");
        String cpf = in.next();
        int soma = 0;
        int peso = 10;
        int peso2 = 11;
        int soma2 = 0;

        if (cpf.length() > 11) {
            System.out.println("cpf não tem mais q 11 caracteres, digita dnv");
            cpf = in.next();
        } else {
            
         for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            //System.out.println(digito);
            soma = soma + (peso * digito);
            peso--;
        }
        //System.out.println(soma);
        int resto = soma % 11;
        int passo4 = 11 - resto;

        int verificadorCalculado;

        if (passo4 < 10) {
            verificadorCalculado = passo4;
        } else {
            verificadorCalculado = 0;
        }

        int verificadordoCPF = Character.getNumericValue(cpf.charAt(9));
        if (verificadorCalculado != verificadordoCPF) {
             System.out.println("CPF inválido: 1º dígito verificador incorreto.");
        } 

        for (int i = 0; i < 10; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
             soma2 = soma2 + (peso2 * digito);
            peso2--;
        }
        int resto2 = soma2 % 11;
        int passo9 = 11 - resto2;

        int verificadorCalculado2;

        if (passo9 < 10) {
            verificadorCalculado2 = passo9;
        } else {
            verificadorCalculado2 = 0;
        }
         int verificadordoCPF2 = Character.getNumericValue(cpf.charAt(10));
        if (verificadorCalculado2 != verificadordoCPF2) {
             System.out.println("CPF inválido: 2º dígito verificador incorreto.");
        } else {
            System.out.println("cpf válido");
        }

        }
       

    }    
}
