import java.util.Scanner;

public class medias 
{
    public static void main(String[] args) 
    {
        float a = 0;
        float b = 0;
        float c = 0;
        String aluno;

        float med = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("insira o nome do aluno: ");
        aluno = in.next();

        System.out.println("insira as notas: ");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();

        med = (a + b + c )/3;

        System.out.println(med);
    }
}
