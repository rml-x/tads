import java.util.Scanner;

public class senado 
{
    public static void main(String[] args) 
    {
        String voto = "";

        int a = 0;
        int b = 0;
        int c = 0;

        int branco = 0;
        int nulo = 0;
        int eleitores = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("insira seu voto, candidato 1 , 2 , 3 , branco ou nulo.");

        voto = input.nextLine();

        while (!voto.equals("-1")) 
        {
            if (voto.equals("branco")) 
            {
            branco = branco + 1; 
            eleitores = eleitores + 1;
            System.out.println("votos brancos: "+ branco);

            System.out.println("proximo voto: ");
            voto = input.nextLine();

            }
            else if (voto.equals("nulo")) 
            {
            nulo = nulo + 1; 
            eleitores = eleitores + 1;
            System.out.println("votos nulos: "+ nulo);

            System.out.println("proximo voto: ");
            voto = input.nextLine();

            }
            else if (voto.equals("1")) 
            {
            a = a + 1;
            eleitores = eleitores + 1; 
            System.out.println("votos no candidato 1: "+ a);

            System.out.println("proximo voto: ");
            voto = input.nextLine();

            }
            else if (voto.equals("2")) 
            {
            b = b + 1;
            eleitores = eleitores + 1; 
            System.out.println("votos no candidato 2: "+ b);

            System.out.println("proximo voto: ");
            voto = input.nextLine();

            }
            else if (voto.equals("3")) 
            {
            c = c + 1;
            eleitores = eleitores + 1; 
            System.out.println("votos no candidato 3: "+ c);

            System.out.println("proximo voto: ");
            voto = input.nextLine();

            }
            
        }
        System.out.println("votação encerrada");
        System.out.println("total de eleitores: " + eleitores);
        System.out.println("total candidato 1: " + a);
        System.out.println("total candidato 2: " + b);
        System.out.println("total candidato 3: " + c);
        System.out.println("total votos brancos: " + branco);
        System.out.println("total votos nulos: " + nulo);


        


    }    
}
