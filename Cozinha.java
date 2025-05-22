import java.util.Scanner;
public class Cozinha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float altura, largura, comprimento, areaParedeA, areaParedeB, areaPiso, areaTotal;

        System.out.println("Informe a altura, comprimento e largura, area total ");

        altura = in.nextFloat();
        comprimento = in.nextFloat();
        largura = in.nextFloat();

        areaParedeA = altura * largura;
        areaParedeB = altura * comprimento;
        areaPiso = comprimento * largura;
        areaTotal = 2 * areaParedeA + 2 * areaParedeB + areaPiso;

        System.out.println("Parede A = " + areaParedeA);
        System.out.println("Parede B = " + areaParedeB);
        System.out.println("Piso = " + areaPiso);
        System.out.println(" \nTotal = " + areaTotal);

        float m2Caixa;
        int totalCaixas;
        System.out.println("Quantos m2 vem em cada caixa?");
        m2Caixa = in.nextFloat();

        totalCaixas = (int) (areaTotal/m2Caixa);
        System.out.println("Total de caixas = " + totalCaixas);
        

    }
}