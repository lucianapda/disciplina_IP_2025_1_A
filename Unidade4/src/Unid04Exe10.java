import java.util.Scanner;

public class Unid04Exe10 {

    /*
     * Entrada: idadeMarquinhos, idadeZezinho, idadeLuluzinha
     * Saída: caçula -> menorIdade
     * Processo: verificar qual dos 3 valores é menor
     * Fluxograma:
     * Testes:
     * 10 15 18 -> Marquinhos
     * 15 18 10 -> Luluzinha
     * 18 15 10 -> Luluzinha
     * 7 12 10 -> Marquinhos
     */
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a idade do Marquinhos, Zezinho e Luluzinha: ");
        int idadeMarquinhos = leitor.nextInt();
        int idadeZezinho = leitor.nextInt();
        int idadeLuluzinha = leitor.nextInt();

        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.println("Marquinhos");
        } else if (idadeZezinho < idadeLuluzinha) {
            System.out.println("Zezinho");
        } else {
            System.out.println("Luluzinha");
        }

        leitor.close();
    }
}