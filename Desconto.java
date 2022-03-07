import java.util.Scanner;

class Desconto{
    public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Valor da compra ");
    int Compra = ler.nextInt();
    System.out.println("Valor do desconto ");
    int Desc = ler.nextInt();

    double Dcompra = Compra / Desc;
    double Vfinal = Compra - Dcompra;

    System.out.print("O valor final da compra com desconto é: " + Vfinal);

    }
}