import java.util.Scanner;

public class Exercicio02 {
    //Leia 2 valores inteiros e imprima sua multiplicação.
    
    //Análise: Tudo certo.
    //Entradas: v1, v2
    //Saídas: multiplicacao
    //Processo: multiplicacao = v1 * v2

    //Fluxograma: draw.io

    //Testes:
    //v1            | 5  | 0 | -4 | -4 
    //v2            | 5  | 7 | -3 |  3
    //multiplicacao | 25 | 0 | 12 | -12
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor 1: ");
        int valor1 = teclado.nextInt();
        System.out.print("Valor 2: ");
        int valor2 = teclado.nextInt();

        int multilplicacao = valor1 * valor2;

        System.out.println(multilplicacao);

        teclado.close();
    }
}
