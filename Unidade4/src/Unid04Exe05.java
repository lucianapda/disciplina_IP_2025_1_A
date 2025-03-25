import java.util.Scanner;

public class Unid04Exe05 {
    /* Entrada: resposta
     * Saída: se a cor é azul ou não
     * Processo: se resposta for true, é azul, senão não é azul
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("A cor é azul?");
        boolean resposta = s.nextBoolean();

        if (resposta) { //== true
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        s.close();
    }

}
