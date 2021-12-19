package lacos.arrays;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int idade;

        while (true) {
            System.out.println("digite o nome:");
            name = scan.next();
            if (name.equals("0")) break;
            System.out.println("Olá "+name+" digite a idade:");
            idade = scan.nextInt();
        }

        System.out.println("ok paramos aqui");
    }
}
