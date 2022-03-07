import java.util.Scanner;

class Desconto{
    public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Valor da compra ");
    double Compra = ler.nextDouble();
    System.out.println("Valor do desconto ");
    double Desc = ler.nextDouble();

    double Dcompra = Compra / Desc;
    double Vfinal = Compra - Dcompra;

    System.out.print("O valor final da compra com desconto é: " + Vfinal);

    }
}