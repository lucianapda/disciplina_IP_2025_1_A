/*
 * Exemplo de utilização da Classe Scanner para leitura e 
 * System para escrita no console.
 */

import java.util.Scanner;

public class ExemploLerEscrever {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe um Inteiro: ");
		int valorInteiro = teclado.nextInt();
		System.out.println("Inteiro: " + valorInteiro);

		System.out.println("Informe um Float: ");
		float valorFloat = teclado.nextFloat();
		System.out.println("Float: " + valorFloat);

		System.out.println("Informe um Double: ");
		double valorDouble = teclado.nextDouble();
		System.out.println("Double: " + valorDouble);

		System.out.println("Informe um Char: ");
		char valorChar = teclado.next().charAt(0);
		System.out.println("Char: " + valorChar);

		System.out.println("Informe um String: ");
		String valorStr = teclado.next();
		System.out.println("String: " + valorStr);

		System.out.println("Informe um Boolean: ");
		boolean valorBoolean = teclado.nextBoolean();
		System.out.println("Boolean: " + valorBoolean);

		teclado.close();
		System.out.println("..FIM..");
	}

}
