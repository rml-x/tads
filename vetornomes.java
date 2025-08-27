import java.util.Scanner;

public class vetornomes 
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String [] nomes;
        nomes = new String[10];
       
        boolean achou = false;

        System.out.println("insira os 10 nomes");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = in.next();
        }

    

        while (true) {

        System.out.println("digite um nome para ver se esta na lista para sair digite, fim");
        String nome = in.next();
        
        if (nome.equalsIgnoreCase("fim")) { 
            break;
        }
        
        for (int i = 0; i < nomes.length; i++) {

            if (nome.equalsIgnoreCase(nomes[i])) {

                achou = true;

            }
        
        }  
            if (achou) {
                System.out.println("achei");
                break;
            }
            else {
                System.out.println("não achei");
                break;
            }
        }
    
    
        
    }    
}
