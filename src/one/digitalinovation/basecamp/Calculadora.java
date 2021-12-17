package one.digitalinovation.basecamp;

/**
 * classe de exemplo da aula 1 de método
 */
public class Calculadora
{
    public static void sum(double number1, double number2) {
        double resultado = number1 + number2;

        System.out.println("A Soma de " + number1 + " + " + number2 +" é: " + resultado);
    }

    public static void sub(double number1, double number2) {
        double resultado = number1 - number2;

        System.out.println("A Subtração de " + number1 + " - " + number2 +" é: " + resultado);
    }

    public static void multiplication(double number1, double number2) {
        double resultado = number1 * number2;

        System.out.println("A Multiplicação de " + number1 + " * " + number2 +" é: " + resultado);
    }

    public static void division(double number1, double number2) {
        double resultado = number1 / number2;

        System.out.println("A Divisão de " + number1 + " / " + number2 +" é: " + resultado);
    }
}
