package Questao2;

public class Aluno {
    public double media1;
    public double media2;
    public double media3;

    public void resultado1(int valor1, int valor2, int valor3){
        this.media1 = (valor1 + valor2 + valor3)/3;
        System.out.println("Media da primeira unidade " + media1);
    }
    public void resultado2(int valor1, int valor2, int valor3){
        this.media2 = (valor1 + valor2 + valor3)/3;
        System.out.println("Media da segunda unidade " + media2);
    }
    public void resultado3(){
        this.media3 = (media1 + media2)/2;
        System.out.println("Media geral " + media3);
    }
}
