package ListaDeExercicios3.E3Questao3;
public class Usuario {

    int algoritimo = 0;
    String nome;

    public void setalgoritimo(String nome, int vezes){
        while (algoritimo < vezes){
            algoritimo++;
            System.out.println(algoritimo+") " + nome);
        }

    }


}
