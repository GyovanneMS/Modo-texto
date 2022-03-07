import java.util.Scanner;

class Temperatura{
    public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);

    System.out.println( "Temperatura em Celsius (Sem o simbolo ao lado -°-)");
    int Celsius = ler.nextInt();

    double Fah = (9 * Celsius + 160)/5;

        System.out.print("A temperatura em fahrenheit é: " + Fah);

    }
}