package Questao1;
public class Programa {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        System.out.println("Bem vindo a calculadora da vida!");
        pessoa1.dataNascimento(2,8,1995);
        pessoa1.dataAtual(4,10,2023);
        pessoa1.algoritimu("Fulano");
        System.out.println(pessoa1);



    }
}
/*
        System.out.println("Digite sua data de nascimento Exemplo: dia = 4 mês = 10 ano = 2023");
        pessoa1.valor1 = scan.nextInt();scan.nextLine();
        pessoa1.valor2 = scan.nextInt();scan.nextLine();
        pessoa1.valor3 = scan.nextInt();scan.nextLine();
        System.out.println("Digite a data atual Exemplo: dia = 4 mês = 10 ano = 2023");
        pessoa1.date1 = scan.nextInt();scan.nextLine();
        pessoa1.date2 = scan.nextInt();scan.nextLine();
        pessoa1.date3 = scan.nextInt();scan.nextLine();
        pessoa1.algoritimu();
        System.out.println(pessoa1);
 */