public class ExemploMatrizPesquisa {

  private ExemploMatrizPesquisa() {
    final int qtdLinha = 3; // linha
    final int qtdColuna = 5; // coluna
    int matriz[][] = new int[qtdLinha][qtdColuna];

    matrizZeros(matriz);

    int valor = 20;
    matriz[1][3] = valor;
    if (!matrizPesquisa(matriz, valor)) {
      System.out.println("não achou");
    }
  }

  private void matrizZeros(int matriz[][]) {
    for (int l = 0; l < matriz.length; l++) { // linhas
      for (int c = 0; c < matriz[0].length; c++) { // colunas
        matriz[l][c] = 0;
      }
    }
  }

  private boolean matrizPesquisa(int matriz[][], int valorPesquisa) {
    for (int l = 0; l < matriz.length; l++) { // linhas
      for (int c = 0; c < matriz[0].length; c++) { // colunas
        if (matriz[l][c] == valorPesquisa) {
          System.out.println("[" + l + "][" + c + "]");
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    new ExemploMatrizPesquisa(); // chamar método construtor.
  }
}
