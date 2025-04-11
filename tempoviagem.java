import java.util.Scanner;

public class tempoviagem
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        float t = 0;
        float d = 0;
        float v = 0; 

        System.out.println("insira distancia(Km) e velocidade(Km/h): ");
        d = in.nextFloat();
        v = in.nextFloat();

        t = v/d;

        System.out.println(t);
        in.close();

    }    
}
