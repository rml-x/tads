import java.util.Scanner;

public class asc 
{
 public static void main(String[] args) 
 {
    int num = 0;
    
    int i;
    int linhas;
    int j;

   

    Scanner in = new Scanner(System.in);

    System.out.println("insira o numero de linhas: ");
    num = in.nextInt();

    for(i = 0; i < num; i++) {
        linhas = 2 * (num - i)-1;

    for(j = 0; j < linhas ; j++){
        System.out.print("*");
    }
        System.out.println();
    } 

    


 }   
}
