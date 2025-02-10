/*
 * Exemplo de utilização da classe Math com método floor para verificar se um
 * núnmero tem casas decimais.
 */

public class ExemploTemCasasDecimais {
	public static void main(String[] args) {
		double numero;

		// número sem casas decimais
		numero = 10;
		System.out.print("_ O número " + numero + ": ");
		if (numero - (int) numero != 0.0) { // 1a opção
			System.out.println("tem casas decimais.");
		} else {
			System.out.println("não tem casas decimais.");
		}

		// número com casas decimais
		numero = 10.5;
		System.out.print("_ O número " + numero + ": ");
		if (numero - Math.floor(numero) != 0.0) { // 2a opção, faz a mesma coisa da 1a opção
			System.out.println("tem casas decimais.");
		} else {
			System.out.println("não tem casas decimais.");
		}

		System.out.println("..FIM..");
	}
}
