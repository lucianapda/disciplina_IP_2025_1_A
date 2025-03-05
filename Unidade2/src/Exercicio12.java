import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor de P1(X, Y): ");
        double x1 = s.nextDouble();
        double y1 = s.nextDouble();

        System.out.println("Digite o valor de P2(X, Y): ");
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();

        double difX = x2 - x1;
        double difY = y2 - y1;
        double quadradoX = Math.pow(difX, 2);
        double quadradoY = Math.pow(difY, 2);
        double soma = quadradoX + quadradoY;
        double distancia = Math.sqrt(soma);

        System.out.println("Distância = " + distancia);

        DecimalFormat df = new DecimalFormat("#0.0000");
        System.out.println("Ditância = " + df.format(distancia));

        //int a = s.nextInt();
        //int potencia = (int) Math.pow(a, 2);

        s.close();
    }
}
