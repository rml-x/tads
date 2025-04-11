import java.util.Scanner;

public class antec 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        int num;

        System.out.println("digite um numero: ");
        num = in.nextInt();

        int ant;

        ant = num - 1;
        System.out.println("o antecessor de "+ num + " é " + ant);


    }
}
