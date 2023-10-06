package Questao5;
import java.text.DecimalFormat;
public class Usuario {

    public double salario;
    public double salarioMinimo = 788.00;
    public double result;

    public void algoritimo(double valor){
        this.salario = valor;
        this.result = salarioMinimo / salario;
        if (result <= 0.01) {
            System.out.println("Seu salario corresponde há: 0.");
        }else if (result >= 0.01){
            System.out.printf("Seu salario corresponde há :%.2f" ,result);
            System.out.printf(" de um salario.\n");
        }
    }
}
