import java.util.Scanner;

public class quadrado 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        int num = 0;
        int square;

        System.out.print("informe o numero: ");

        num = in.nextInt();

        square = num * num;

        System.out.println(square);
    }
}
