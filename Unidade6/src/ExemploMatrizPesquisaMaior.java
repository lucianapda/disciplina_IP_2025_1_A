public class ExemploMatrizPesquisaMaior {

  private ExemploMatrizPesquisaMaior() {
    final int matLin = 3, matCol = 5;
    int mat[][] = new int[matLin][matCol];

    matrizPreencherLinhaColuna(mat);
    matrizEscrever(mat);

    matrizPreencherColunaLinha(mat);
    matrizEscrever(mat);

    int vetAchou[] = matrizPesquisar(mat);
    if (vetAchou[0] != -1) {
      System.out.println("Achou na posição[" + vetAchou[0] + "," + vetAchou[1] + "].");
    }
  }

  private void matrizPreencherLinhaColuna(int mat[][]) {
    int valor = 1;
    for (int l = 0; l < mat.length; l++) { // linhas
      for (int c = 0; c < mat[0].length; c++) { // colunas
        mat[l][c] = valor;
        valor++;
      }
    }
  }

  private void matrizPreencherColunaLinha(int mat[][]) {
    int valor = 1;
    for (int c = 0; c < mat[0].length; c++) { // colunas
      for (int l = 0; l < mat.length; l++) { // linhas
        mat[l][c] = valor;
        valor++;
      }
    }
  }

  private void matrizEscrever(int mat[][]) {
    System.out.print(" ");
    System.out.println();
    for (int l = 0; l < mat.length; l++) {
      for (int c = 0; c < mat[0].length; c++) {
        if (mat[l][c] < 10) { // 1 digito
          System.out.print("|  " + mat[l][c] + " ");
        } else { // 2 digitos
          System.out.print("| " + mat[l][c] + " ");
        }
      }
      System.out.println("|");
    }
    System.out.println();
  }

  private int[] matrizPesquisar(int mat[][]) {
    int valorPesquisar = 14;
    int vetAchou[] = { -1, -1 };

    for (int l = 0; l < mat.length; l++) { // linhas
      for (int c = 0; c < mat[0].length; c++) { // colunas
        if (valorPesquisar == mat[l][c]) {
          vetAchou[0] = l;
          vetAchou[1] = c;
          break;
        }
      }
    }
    return vetAchou;
  }

  public static void main(String[] args) {
    new ExemploMatrizPesquisaMaior();
  }

}
