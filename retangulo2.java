import java.util.Scanner;

public class retangulo2 
{
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("insira col e lin: ");
        int col = in.nextInt();
        int lin = in.nextInt();


        for (int i = 0; i < lin; i++) {
            int estrelas = col;
            for (int j = 0; j < col; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
