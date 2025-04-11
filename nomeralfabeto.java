import java.util.Scanner;

public class nomeralfabeto 
{
    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
      String nome1, nome2;
      
      System.out.println("insira dois nomes:  ");
      nome1 = in.next();
      nome2 = in.next();

      if (nome1.compareTo(nome2) < 0) {
        System.out.println(nome1 + " vem antes de "+ nome2);
      } else {
        System.out.println(nome2 + " vem antes de "+ nome1);
      }
    }
}
