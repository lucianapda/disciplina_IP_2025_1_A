import java.util.Scanner;

public class ExemploMetodoOrdenarTresValores {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Entre com o 1a valor: ");
		double valor1 = teclado.nextDouble();
		System.out.print("Entre com o 2a valor: ");
		double valor2 = teclado.nextDouble();
		System.out.print("Entre com o 3a valor: ");
		double valor3 = teclado.nextDouble();

		double valorMenor = 0, valorMedio = 0, valorMaior = 0;

		if ((valor1 <= valor2) && (valor1 <= valor3)) {
			valorMenor = valor1;
			if (valor2 <= valor3) {
				valorMedio = valor2;
				valorMaior = valor3;
			} else {
				valorMedio = valor3;
				valorMedio = valor2;
			}
		} else {
			if ((valor2 <= valor1) && (valor2 <= valor3)) {
				valorMenor = valor2;
				if (valor1 <= valor3) {
					valorMedio = valor1;
					valorMaior = valor3;
				} else {
					valorMedio = valor3;
					valorMaior = valor1;
				}
			} else {
				valorMenor = valor3;
				if (valor1 <= valor2) {
					valorMedio = valor1;
					valorMaior = valor2;
				} else {
					valorMedio = valor2;
					valorMaior = valor1;
				}
			}
		}
		System.out.println("menor: " + valorMenor + " - medio: " + valorMedio + " - maior: " + valorMaior);
		teclado.close();
	}
}
