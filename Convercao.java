import java.util.Scanner;

class Convercao{
    public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Valor do Dolar");
    int Dolar = ler.nextInt();
    System.out.println("Valor a ser convertido");
    int VConv = ler.nextInt();

    double Convertido = VConv * Dolar;

    System.out.print("O valor convertido é" + Convertido);


    }
}

