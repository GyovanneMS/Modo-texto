import java.util.Scanner;

class Variavel {
    public static void main(String args []) {
        Scanner ler = new Scanner(System.in);


        System.out.println("Primeiro número: ");
        int N1 = ler.nextInt();
        System.out.println("Segundo número: ");
        int N2 = ler.nextInt();

        System.out.print("O primeiro número é: " + N1 + ", e o segundo é: " + N2);

        int N3 = N1;
        N1 = N2;
        N2 = N3;

        System.out.print("Agora o primeiro número é: " + N1 + ", e o segundo é: " + N2);        
    }
}
