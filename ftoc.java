import java.util.Scanner;

public class ftoc
{
    public static void main(String[] args) 
    {
        float c = 0;
        float f = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("insira a temperatura em Fahrenheit");
        f = in.nextFloat();

        c = 5 * (f - 32)/9;

        System.out.println(c);

    }    
}
