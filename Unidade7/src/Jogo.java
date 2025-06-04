
public class Jogo {

	private char[][] tabuleiro;
	
	public void iniciar(){
		tabuleiro = new char[8][8];
		//Continuar o código....
		numeroAleatorio();
	}
	
	
	private void numeroAleatorio() {
		int linha = (int) (Math.random() * 8);
		int coluna = (int) (Math.random() * 8);
		System.out.println(linha + " " + coluna);
	}
	
	//Demais métodos:
	//private .....
}
