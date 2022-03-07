import java.util.Scanner;

class Operacoesta{
    public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Primeiro número: ");
    int N1 = ler.nextInt();
    System.out.println("Segundo número: ");
    int N2 = ler.nextInt();

    double P1 = Math.pow(N1,5);
    double P2 = Math.pow(N2,5);
    double D  = N1 / N2 ;
    double Re = N1 % N2 ;
    double R1 = Math.sqrt(N1);
    double R2 = Math.sqrt(N2);

    System.out.print("A primeira exponenciação é " +  P1 + ".\n A segunda exponenciação é " + P2 + ".\n O resultado da divisão é " + D + " e o resto é " + Re + ".\n A primeira raiz é igual a " + R1 + ".\n A segunda raiz é " + R2 + ".");
    }
}