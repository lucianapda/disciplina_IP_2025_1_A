
/*  Uni6Exe01.java - Descreva um algoritmo que leia 10 números inteiros e
 *  os coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem
 *  inversa em que foram lidos. Faça um método para ler e outro para escrever.*/

import java.util.Scanner;

public class Unid6Exe01 {

	public Unid6Exe01() {
		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[3];
		ler(teclado, numeros);		
		escrever(numeros);
		System.out.println("NORMAL");
		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.println(numeros[indice]);
		}
		teclado.close();
	}

	
	private void ler(Scanner teclado, int[] vetor) {
		for (int indice = 0; indice < vetor.length; indice++) {
			System.out.print("Digite o número[" + indice + "]: ");
			vetor[indice] = teclado.nextInt();
		}
	}
	
	public void escrever(int[] numeros) {
		System.out.println("INVERSO: ");
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}
	
	public static void main(String[] args) {
		new Unid6Exe01();
	}
	
}
