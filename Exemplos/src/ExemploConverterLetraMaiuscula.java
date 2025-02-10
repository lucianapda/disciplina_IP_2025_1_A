/*
 * Exemplo de utilização da classe Character com método toUpperCase para
 * converter a letra para maiúsculo.
 */

public class ExemploConverterLetraMaiuscula {
	public static void main(String[] args) {
		char letra = 'a';

		// converter a letra para maiúsculo
		System.out.println("_ A letra minúscula: " + letra);
		letra = Character.toUpperCase(letra);
		System.out.println("_ A letra maiúscula: " + letra);

		System.out.println("..FIM..");
	}
}
