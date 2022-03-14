import java.util.Scanner;

class Convercao{
    public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Valor do Dolar");
    double Dolar = ler.nextDouble();
    System.out.println("Valor a ser convertido");
    double VConv = ler.nextDouble();

    double Convertido = Dolar / VConv   ;
                
    System.out.print("O valor convertido é " + Convertido);


    }
}

                                                                                                                                        
