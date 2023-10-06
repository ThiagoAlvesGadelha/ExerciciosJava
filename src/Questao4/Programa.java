package Questao4;

public class Programa {
    public static void main(String[] args) {
        Peca pecas = new Peca();
        Peca peca1 = new Peca();
        Peca peca2 = new Peca();

        pecas.algoritimo("001",1000,1,"002", 1000,1);
        System.out.println(peca1);

        peca1.algoritimu("001",1000,1);
        System.out.println(peca1);

        peca2.algoritimu("002",2000,2);
        System.out.println(peca2);
    }
}
