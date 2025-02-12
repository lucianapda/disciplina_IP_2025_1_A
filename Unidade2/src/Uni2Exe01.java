
import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        // Entrada
        System.out.print("Valor1: ");
        int valor1 = teclado.nextInt();
        System.out.print("Valor2: ");
        int valor2 = teclado.nextInt();

        // Processo
        int soma = valor1 + valor2;

        // Saída
        System.out.println("Soma: " + soma);

        teclado.close();
    }
}
