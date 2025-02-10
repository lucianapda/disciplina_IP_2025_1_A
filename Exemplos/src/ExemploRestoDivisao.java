/*
 * Exemplo de utilização do operador do resto da divisão.
 */

public class ExemploRestoDivisao {
	public static void main(String[] args) {
		double resposta;
		double numerador;
		double denominador;

		// conta sem resto na divisão
		System.out.println("_ Conta sem resto na divisão ___");
		numerador = 10;
		denominador = 2;
		resposta = numerador / denominador;
		System.out.println("Resultado da divisão: " + resposta);
		resposta = numerador % denominador;
		System.out.println("Resultado do resto da divisão: " + resposta);

		System.out.println(); // linha em branco

		// conta com resto na divisão
		System.out.println("_ Conta com resto na divisão ___");
		numerador = 10;
		denominador = 3;
		resposta = numerador / denominador;
		System.out.println("Resultado da divisão: " + resposta);
		resposta = numerador % denominador;
		System.out.println("Resultado do resto da divisão: " + resposta);
		
		// Operador binário
		int numero;
		boolean teste;
		numero = 20; teste = (numero & 0x01) == 0;
		teste = (numero % 2) == 0;
		numero = 21; teste = (numero & 0x01) == 0;
		teste = (numero % 2) == 0;
		System.out.println("Resultado: " + teste);
		
		System.out.println("..FIM..");
	}
}
