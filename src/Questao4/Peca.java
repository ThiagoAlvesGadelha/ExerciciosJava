package Questao4;

public class Peca {
    public int quantidade1;
    public int codigoPeca1;
    public double valorDaPeca1;
    public int quantidade2;
    public int codigoPeca2;
    public double valorDaPeca2;
    public double retorno1;
    public double retorno;
    public double ipi = 0.25;
    public double valorDaPeca;
    public int quantidadeDaPeca;
    public String codigoDaPeca;
    public double retornoCombinado;
    public double retorno2;



public void capturarValor(double valorPeca1, int quantidadePeca1, double valorPeca2, int quantidadePeca2){
    this.valorDaPeca1 = valorPeca1;
    this.quantidade1 = quantidadePeca1;
    this.valorDaPeca2 = valorPeca2;
    this.quantidade2 = quantidadePeca2;
    System.out.println("Dados recebidos");
}
    public void algoritimo(String codigoDaPeca1, double valorPeca1, int quantidadePeca1,String codigoDaPeca2, double valorPeca2, int quantidadePeca2){
        this.valorDaPeca1 = valorPeca1;                    //FORMA 1
        this.quantidade1 = quantidadePeca1;
        this.valorDaPeca2 = valorPeca2;
        this.quantidade2 = quantidadePeca2;
        this.codigoPeca1 = Integer.parseInt(codigoDaPeca1);
        this.codigoPeca2 = Integer.parseInt(codigoDaPeca2);
        System.out.println("Dados recebidos");
        this.retornoCombinado = (valorDaPeca1 * quantidade1) + (valorDaPeca2+quantidade2)*(ipi/100+1);
        this.retorno1 = (valorDaPeca1 * quantidade1) * (ipi/100+1);
        this.retorno2 = (valorDaPeca2 * quantidade2) * (ipi/100+1);
        System.out.println("O resultado da formula das 2 peças somadas é de = " + retornoCombinado);
        System.out.println("Peça1: " + codigoDaPeca1 +" Valor = " + retorno1);
        System.out.println("Peça2: " + codigoDaPeca2 +" Valor = " + retorno2);
        System.out.println("--------------------------------");
    }
    public void algoritimu(String codigoDaPeca, double valorDaPeca, int quantidadeDaPeca){
        this.codigoDaPeca = codigoDaPeca;                   //FORMA 2
        this.valorDaPeca = valorDaPeca;
        this.quantidadeDaPeca = quantidadeDaPeca;
        System.out.println("Dados recebidos");
        this.retorno = (valorDaPeca * quantidadeDaPeca)*(ipi/100+1);
        System.out.println("Peça: " + codigoDaPeca +" Valor = " + retorno);
        System.out.println("--------------------------------");
    }

}
