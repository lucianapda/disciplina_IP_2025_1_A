import java.util.Scanner;

public class ExemploCondicionalMultipla {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Opção: ");
		int opcao = teclado.nextInt();

		switch (opcao) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default:
				System.out.println("0");
				break;
		}
		teclado.close();
	}
}
