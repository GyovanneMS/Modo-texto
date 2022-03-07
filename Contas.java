import java.util.Scanner;

class Contas{
    public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
     
    System.out.println("Primeiro número: ");
    double num1 = ler.nextDouble();
    System.out.println("Segundo número: ");
    double num2 = ler.nextDouble();

    double A = num1 + num2;
    double S = num1 - num2;
    double M = num1 * num2;
    double D = num1 / num2;

    System.out.print("\nO resultado da adição é :" + A + "\nO resultado da Subtração é :" + S + "\nO resultado da multiplicação é :" + M + "\nO resultado da divisão é :" + D);


    }
}