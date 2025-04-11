import java.util.Scanner;

public class eleicao 
{   
    public static void main(String[] args) 
    {
        int eleitores = 0;
        int vv = 0;
        int vb = 0;
        int vn = 0;

        float pvv = 0;
        float pvb = 0;
        float pvn = 0;


        Scanner in = new Scanner(System.in);
        System.out.println("insira o total de eleitores e quantidade de votos:");

        eleitores = in.nextInt();
        vb = in.nextInt();
        vn = in.nextInt();
        vv = in.nextInt();

        pvb = (100 * vb)/ eleitores;
        pvv = (100 * vv)/ eleitores;
        pvn = (100 * vn)/ eleitores;

        System.out.println("votos validos (%): " + pvv );
        System.out.println("votos brancos (%): " + pvb );
        System.out.println("votos nulos (%): " + pvn );
    }    
}
