

public class App {
	public App() {
		int vetor[] = {6, 2, 1, 4, 3, 5, 1};
		bolha1(vetor);
		imprimir(vetor);
		
		int vetor2[] = {6, 2, 1, 4, 3, 5, 1};
		bolha2(vetor2);
		imprimir(vetor2);
		
		int v[] = new int[5];
		int quantidadeElementos = 0;
		imprimirSomenteInseridos(v, quantidadeElementos);
		quantidadeElementos = inserir(v, quantidadeElementos);
		quantidadeElementos = inserir(v, quantidadeElementos);
		imprimirSomenteInseridos(v, quantidadeElementos);
		imprimir(v);
		
		int soma = 10;
		somar(4, 5, soma);
		System.out.println(soma);
		
		
		int[] resultado = new int[1];
		resultado[0] = 10;
		somar2(4, 5, resultado);
		System.out.println(resultado[0]);
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
	}
	
	
	private void somar2(int n1, int n2, int resultado[]) {
		resultado[0] = n1 + n2;
		System.out.println(resultado[0]);
	}
	
	private void somar(int n1, int n2, int soma) {
		soma = n1 + n2;
		System.out.println(soma);
	}
	private void imprimirSomenteInseridos(int[] vetor, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}
	
	private int inserir(int vetor[], int posicao) {
		vetor[posicao] = 5;
		posicao++;
		return posicao;
	}
	
	private void bolha1(int[] v) {
		for (int i = 0; i < v.length-1; i++) {
			for (int j = 0; j < v.length-1-i; j++) {
				if (v[j] > v[j+1]) {
					int aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
	}
	
	private void bolha2(int[] v) {
		boolean trocou = true;
		while (trocou) {
			trocou = false;
			for (int i = 0; i < v.length - 1; i++) {
				if (v[i] > v[i+1]) {
					int aux = v[i];
					v[i] = v[i+1];
					v[i+1] = aux;
					trocou = true;
				}
			}
		}
	}
	
	private void imprimir(int[] v) {
		for (Integer elementoVetor: v) {
			System.out.print(elementoVetor + " ");
		}
		System.out.println();
	}
	
    public static void main(String[] args) {
    	new App();
    } 
    
    
}