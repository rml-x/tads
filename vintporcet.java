import java.util.Scanner;

public class vintporcet 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        int num;
    
        float num1; 

        System.out.println("insira um numero: ");
        num = in.nextInt();

        num1 = (num * 20)/100;

        System.out.println(num1);

        in.close();

    }
}
