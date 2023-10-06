package Questao3;
public class Conta {
    public double saldo;
    public double reajuste;
    public void algoritimo(double saldo){
        this.saldo = saldo * 0.01;
        reajuste = this.saldo + saldo;
        System.out.println("Seu saldo é: " + saldo);
        System.out.println("Saldo com reajuste de 1%: " + reajuste);
    }

}
