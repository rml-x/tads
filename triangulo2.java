import java.util.Scanner;

public class triangulo2 
{
 
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("insira col e lin: ");
    
        int lin = in.nextInt();


        for (int i = 0; i <= lin; i++) {//qual linha estamos
            
            for (int j = 0; j <= i; j++) {//quantos simbolos vão na linha
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

    
