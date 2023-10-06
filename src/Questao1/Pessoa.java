package Questao1;

public class Pessoa {
    public String nome = "Fulano";
    public int date1;
    public int date2;
    public int date3;
    public int resultadoEmMes;
    public int resultadoEmDias;
    public int resultadoEmAno;
    public int valor1;
    public int valor2;
    public int valor3;
    public int dias;

    public void dataNascimento(int date1, int date2, int date3){
        this.date1 = date1;
        this.date2 = date2;
        this.date3 = date3;
        System.out.println("Sua data de nascimento >-> " +date1 + "/" + date2 + "/" + date3);
    }
    public void dataAtual(int valor1, int valor2, int valor3){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
        System.out.println("Data de hoje >-> " + valor1 + "/" + valor2 + "/" + valor3);
    }
    public void algoritimu(String nome){
        resultadoEmDias = this.valor1 -= date1;
        resultadoEmMes = this.valor2 -= date2;
        resultadoEmAno = this.valor3 -= date3;
        dias = resultadoEmDias + (resultadoEmMes * 30) +(resultadoEmAno * 365);
        this.nome = nome;
        System.out.println(nome + " tem " + resultadoEmAno + " Anos, " + resultadoEmMes + " Meses e " + resultadoEmDias +" Dias" + " = " + dias + " dias");
    }



/*
    public void algoritimo(String nome,int ano){
        resultadoEmMes = this.qtdmes *= ano;
        resultadoEmDias = qtddia *= ano;
        System.out.println(nome + " tem " + ano + " Anos, " + resultadoEmMes + " Meses e " + resultadoEmDias + " Dias");
    }
*/
}


