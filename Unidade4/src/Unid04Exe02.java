import java.util.Scanner;

public class Unid04Exe02 {
    /*
     * Entrada: valor
     * Saída: Par ou Ímpar
     * Processo: dividir o valor por 2, se o resto for 0 é par, senão é ímpar
     * 
     */
    
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Escreva um valor inteiro maior que 0: ");
        int valor = leitor.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }

        leitor.close();
    }
}