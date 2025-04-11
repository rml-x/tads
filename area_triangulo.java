import java.util.Scanner;

public class area_triangulo 
{
    public static void main(String[] args) 
    {
        float base = 0;
        float h = 0;
        float area = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("insira as variaveis do triangulo");

        base = in.nextInt();
        h = in.nextInt();

        area = (base * h)/2;

        System.out.println(area);


    }
}
