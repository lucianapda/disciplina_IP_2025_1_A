import java.util.Scanner;

public class Exercicio01 {
    //Análise do problema: o nome não é utilizado
    //Entradas: n1, n2, n3, nome
    //Saída: media
    //Processo: media = (n1 + n2 + n3) / 3
    //Testes:
    //n1    | 9 | 9 | 8
    //n2    | 9 | 4 | 9
    //n3    | 9 | 5 | 7
    //media | 9 | 6 |8 

    public static void main(String[] args) {
        System.out.print("Bom dia");
        System.out.println("Mensagem 2");
        System.out.println("Mensagem 3");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite nota 1: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite nota 2: ");
        float n2 = teclado.nextFloat();
        System.out.print("Digite nota 3: ");
        float n3 = teclado.nextFloat();
        System.out.print("Digite o nome: ");
        String nome = teclado.next();

        float media = (n1 + n2 + n3) / 3;

        System.out.println(nome);
        System.out.println(media);
        System.out.println("O(A) aluno(a) " + nome + " tirou média " + media);
        
    }
}
