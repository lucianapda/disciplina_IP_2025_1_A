import java.util.Scanner;

public class Unid5Exe02 {
	/*
	 * Uni6Exe02.java - Descreva um algoritmo que leia 12 valores reais e os coloque
	 * em um vetor de 12 posições do tipo real. Imprima quais valores desses
	 * informados são maiores que a média dos valores. Faça um método para ler os
	 * valores, outro para calcular a média e outro para informar os valores maiores
	 * que a média.
	 */
	
	public Unid5Exe02() {
		Scanner s = new Scanner(System.in);
		double[] valores = new double[12];
		ler(s, valores);
		double resultado = media(valores);
		System.out.println(valores[0]);
		System.out.println("Média = " + resultado);		
		
		imprimirMaiorQueMedia(valores, resultado);
		s.close();
	}
	
	private void imprimirMaiorQueMedia(double valores[], double media) {
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > media) {
				System.out.println(valores[i]);
			}
		}
		
		//Para percorrer listas na ordem início-fim
		for (Double v: valores) {
			System.out.println(v);
		}
	}
	
	private double media(double valores[]) {
		double soma = 0;
		for (int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}
	    double media = soma / valores.length;
	    return media;
	}
	
	private void ler(Scanner leitor, double[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Valor[" + i + "]: ");
			vetor[i] = leitor.nextDouble();
		}
	}
	
	public static void main(String[] args) {
		new Unid5Exe02();
	}
}
