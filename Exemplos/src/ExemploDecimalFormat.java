/*
 * Exemplo de utilização da classe DecimalFormat para 
 * formatar as saídas com casas decimais.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExemploDecimalFormat {
	public static void main(String[] args) {

		// definindo as máscaras de formatação.
		DecimalFormat df_2 = new DecimalFormat("0.00");
		DecimalFormat df_0 = new DecimalFormat("0");

		// instanciando objeto para leitura usando o teclado
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com um número com casas decimais: ");
		double numDouble = teclado.nextDouble();

		// exemplo para formatar número com 2 casas decimais
		System.out.println("Exemplo para formatar a saída com 2 casas decimais: " + df_2.format(numDouble));

		// exemplo para formatar número sem casas decimais
		System.out.println("Exemplo para formatar a saída sem casas decimais: " + df_0.format(numDouble));

		teclado.close();

		System.out.println("..FIM..");
	}
}
