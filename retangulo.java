import java.util.Scanner;

public class retangulo 
{
    public static void main(String[] args) // desenhar um retangulo 
    {
       Scanner in = new Scanner(System.in);
       int lin = 0;
       int col =0;

       System.out.println("digita lin e col: "); 
       lin = in.nextInt();
       col = in.nextInt(); 
    
       for (int i = 0 ; i < lin ; i++) 
       {
        if (i == 0 || i == lin - 1) 
        {
            for (int j = 0; j < col ; j++) 
            {
                 System.out.print("-");
            }
          
        } 
        
        else {
            System.out.print("|");

        for (int j = 0; j < col - 2 ; j++) 
        {
            System.out.print(" ");
        }  
            System.out.print("|"); 
        }
       
         System.out.println();
       }
      
    }    
}
