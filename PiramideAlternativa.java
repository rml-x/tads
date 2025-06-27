public class PiramideAlternativa {
    public static void main(String[] args) {
        int tamanho = 3;
        
        for (int i = 1; i <= tamanho; i++) {
            // Espaços
            for (int j = 0; j < tamanho - i; j++) {
                System.out.print(" ");
            }
            
            // Asteriscos
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();

        }
        //parte de baixo
         for (int i = tamanho - 1; i >= 1; i--) {
            // Espaços
            for (int j = 0; j < tamanho - i; j++) {
                System.out.print(" ");
            }
            
            // Asteriscos
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}