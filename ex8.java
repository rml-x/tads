import java.util.Scanner;

public class ex8 
{
// Leitura de números até um valor maior que o dobro do anterior
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.println("digita um numero: ");
        int num = in.nextInt();

        int num_ant = num;

        while(num < num_ant * 2)
        {
            System.out.println("voce digitou: " + num + " , digite outro");
            num = in.nextInt();
        }
        System.out.println("esse numero " + num + " é o dobro do anteior " + num_ant);
    }
    
}
