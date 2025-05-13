public class ExemploMatriz {
  private ExemploMatriz() {
    final int matLin = 3, matCol = 4;
    int mat[][] = new int[matLin][matCol];
    int valor = 1;

    for (int l = 0; l < matLin; l++) { // linhas
      for (int c = 0; c < matCol; c++) { // colunas
        mat[l][c] = valor;
        valor++;
      }
    }

    matrizEscrever(mat);
  }

  private void matrizEscrever(int mat[][]) {
    System.out.println();
    for (int l = 0; l < mat.length; l++) {
      for (int c = 0; c < mat[0].length; c++) {
        if (mat[l][c] < 10) { // _1
          System.out.print("|  " + mat[l][c] + " ");
        } else { // 10
          System.out.print("| " + mat[l][c] + " ");
        }
      }
      System.out.println("|");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    new ExemploMatriz();
  }
}
