import java.util.Scanner;

public class Unid6Exe05 {

	public Unid6Exe05() {
		Scanner s = new Scanner(System.in);

		String[] respostasRapaz = new String[5];
		String respostasMoca[] = new String[5];

		lerRespostas(respostasRapaz, s, "Rapaz");
		lerRespostas(respostasMoca, s, "Moça");
		
		int indiceAfinidade = calcularIndiceAfinidade(respostasMoca, respostasRapaz);
		
		if (indiceAfinidade == 15) {
			System.out.println("Casem");
		} else if (indiceAfinidade >= 10 && indiceAfinidade <= 14) {
			System.out.println("“Vocês têm muita coisa em comum!”");
		} else if (indiceAfinidade >= 5 && indiceAfinidade <= 9) {
			System.out.println("Talvez não dê certo :(");
		} else if (indiceAfinidade >= 0 && indiceAfinidade <= 4) {
			System.out.println("Vale um encontro");
		} else if (indiceAfinidade >= -1 && indiceAfinidade <= -9) {
			System.out.println("Melhor não perder tempo");
		} else {
			System.out.println("Vocês se odeiam!");
		}
		
		
		s.close();
	}

	private int calcularIndiceAfinidade(String[] respostasMoca, String[] respostasRapaz) {
		int indiceAfinidade = 0;
		for (int i = 0; i < respostasMoca.length; i++) {
			if (respostasRapaz[i].equalsIgnoreCase(respostasMoca[i])) {
				indiceAfinidade += 3;
			} else if (!respostasRapaz[i].equalsIgnoreCase(respostasMoca[i])) {
				indiceAfinidade -= 2;
			} else {
				indiceAfinidade += 1;
			}
		}
		return indiceAfinidade;
	}
	
	private void lerRespostas(String[] respostas, Scanner s, String titulo) {
		String perguntas[] = { "Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?",
				"Gosta de redes sociais?", "Gosta da Oktoberfest?" };
		
		System.out.println(titulo + " - responda SIM, NÃO, IND: ");
		for (int i = 0; i < perguntas.length; i++) {
			do {
				System.out.print(perguntas[i] + " ");
				respostas[i] = s.next();
				
				
				/*if (!respostas[i].equalsIgnoreCase("sim") &&
					!respostas[i].equalsIgnoreCase("nao")&&
					!respostas[i].equalsIgnoreCase("ind")) {
					System.out.println("Valor incorreto, digite SIM, NÃO, IND");
				}
				*/
			} while (!respostas[i].equalsIgnoreCase("sim") &&
					!respostas[i].equalsIgnoreCase("nao")&&
					!respostas[i].equalsIgnoreCase("ind"));
		}
	}

	public static void main(String[] args) {
		new Unid6Exe05();
	}
	

}
