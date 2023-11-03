package Other.ListaDeExercicios3.E3Questao6;

import java.util.Scanner;

public class Usuario {
    String nome;
    int idade;
    int soma;

    public void Algoritimo(){
        Usuario novo = new Usuario();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nome = scan.nextLine();
        System.out.println("Digite a idade: ");
        idade = scan.nextInt();scan.nextLine();
        System.out.println(novo);
    }
}
