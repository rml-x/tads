import java.util.Scanner;

public class vetoresA 
{
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);

        int [] A = {1,0,5,-2,-5,7};
        int soma = 0;

        soma = A[0]+ A[1] + A[5]+  soma;
    
        System.out.println(soma);

        A[4] = 100;
        
        for (int i = 0; i < A.length; i++) {

            if (i != A.length - 1) {
                System.out.print(A[i] + ", ");
            } 
            else {
                System.out.println(A[i]);
            }
            
        }
        
    }
}
