package one.digitalinovation.basecamp;

public class Main
{
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.sum( 7D, 4D);
        Calculadora.sub( 9.2D, 4.7D);
        Calculadora.division( 8.7D, 9.3D);

        //Mensagem
        Mensagem.getSaudation(4);
        Mensagem.getSaudation(9);
        Mensagem.getSaudation(22);
    }
}
