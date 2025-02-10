import java.util.Scanner;

public class ExemploString {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String vazioStr = "";
		String textoStr = "texto";
		char textoChar = textoStr.charAt(0);
		System.out.println("Primeiro caracter: " + textoChar);
		int textoTamanho = textoStr.length();
		System.out.println("Quantidade de caracteres: " + textoTamanho);

		System.out.println("Informe 1a String: ");
		String valorStr1 = teclado.next();
		System.out.println("Informe 2a String: ");
		String valorStr2 = teclado.next();

		// Verifica se uma String está vazia
		if (vazioStr.equals("")) {
			System.out.println("String vazia");
		}

		if (valorStr1.equals(valorStr2)) {
			System.out.println("Duas strings são iguais: " + valorStr1);
		} else {
			System.out.println("Duas strings são diferentes: " + valorStr1 + " - " + valorStr2);
		}

		System.out.println("Informe 1a número inteiro: ");
		int valorInt1 = teclado.nextInt();
		System.out.println("Informe 2a número inteiro: ");
		int valorInt2 = teclado.nextInt();

		String stringInteiro = valorStr1 + valorInt1;
		System.out.println(" String com número: " + stringInteiro);
		String strNumeros = valorInt1 + "" + valorInt2;
		System.out.println(" Número com número numa string: " + strNumeros);

		teclado.close();
	}

}
