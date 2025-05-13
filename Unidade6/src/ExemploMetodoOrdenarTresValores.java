public class ExemploMetodoOrdenarTresValores {

  private ExemploMetodoOrdenarTresValores() {
    double vetorTeste[][] = { { 1, 2, 3 }, { 2, 1, 3 }, { 1, 3, 2 }, { 3, 2, 1 }, { 2, 3, 1 }, { 3, 1, 2 } };
    System.out.println(" . inicio");
    for (int i = 0; i < vetorTeste.length; i++) {
      ordenar(vetorTeste[i][0], vetorTeste[i][1], vetorTeste[i][2]);
    }
    System.out.println(" . fim");
  }

  private void testeOrdenar(double valor1, double valor2, double valor3) {
    if (!(valor1 == 1 && valor2 == 2 && valor3 == 3)) {
      System.out.println(".. ERRO de ordenação!");
    }
  }

  private void ordenar(double valor1, double valor2, double valor3) {
    if (valor1 > valor3) {
      double notaProvisoria = valor3;
      valor3 = valor1;
      valor1 = notaProvisoria;
    }
    if (valor2 > valor3) {
      double notaProvisoria = valor3;
      valor3 = valor2;
      valor2 = notaProvisoria;
    }
    if (valor1 > valor2) {
      double notaProvisoria = valor2;
      valor2 = valor1;
      valor1 = notaProvisoria;
    }
    testeOrdenar(valor1, valor2, valor3);
  }

  public static void main(String[] args) {
    new ExemploMetodoOrdenarTresValores();
  }

}
