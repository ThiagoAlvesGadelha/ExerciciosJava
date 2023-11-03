package Other.ListaDeExercicios3.E3Questao6;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Usuario novo = new Usuario();
        Scanner scan = new Scanner(System.in);

        String nome1;
        String nome2;
        int idade1;
        int idade2;

        System.out.println("Digite o nome");
        nome1 = scan.nextLine();
        System.out.println("Digite a idade");
        idade1 = scan.nextInt();scan.nextLine();
        System.out.println("Digite o nome");
        nome2 = scan.nextLine();
        System.out.println("Digite a idade");
        idade2 = scan.nextInt();scan.nextLine();
    }
}
