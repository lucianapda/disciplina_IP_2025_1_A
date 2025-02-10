import java.util.Locale;
import java.util.Scanner;

public class ExemploLocale {
	public static void main(String[] args) {


		// instanciando objeto para leitura usando o teclado
		Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Entre com um número com casas decimais: ");
		double numDouble = teclado.nextDouble();

		System.out.println("Número: " + numDouble);

		// // ou no lugar do ".useLocale(Locale.US);"
		// // força a saída com virgula no lugar do ponto que separa casas decimais
		// // para ter efeito no teclado deve ser declarado o Locate antes.
		// Locale.setDefault(new Locale("pt", "BR"));

		teclado.close();

		System.out.println("..FIM..");
	}
}
