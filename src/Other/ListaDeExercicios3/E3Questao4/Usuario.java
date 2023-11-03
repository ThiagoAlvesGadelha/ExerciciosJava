package ListaDeExercicios3.E3Questao4;

public class Usuario {

    String nome;
    int algoritimo = 0;

    public void setAlgoritimo(String nome, int vezes){
        while (algoritimo < vezes){
            algoritimo++;
            System.out.println(algoritimo+") "+ nome);
        }
    }
}
