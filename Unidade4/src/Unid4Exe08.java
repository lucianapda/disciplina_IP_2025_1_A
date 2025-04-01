import java.util.Scanner;

public class Unid4Exe08 {
    /*
     * Entrada: letra
     * Saída: se é ou não vogal
     * Processo: se a letra é a ou e ou i ou o ou u é vogal, senão não é vogal
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a letra: ");
        char letra = s.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        }

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("É vogal");
                break;
            default:
                System.out.println("Não é vogal");
        }

        s.close();
    }
}
