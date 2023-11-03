package Questao6;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {

        int numero = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO");
        numero = scan.nextInt();
        scan.nextLine();

        if (numero == 0) {
            System.out.println("Reinicie o programa e digite um numero acima de 0");
        } else if (numero >= 0) {
            numero++;
            System.out.println("Sucessor: " + numero);
            numero--;
            numero--;
            System.out.println("Antecessor: " + numero);
        }
    }
}

