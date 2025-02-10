public class ExemploSortear {

  private ExemploSortear() {
    int sorteio;

    // sortear valor entre [0..2]
    sorteio = sortear(0, 3);
    System.out.println(sorteio);

    int qtdOcorre0 = 0;
    int qtdOcorre1 = 0;
    int qtdOcorre2 = 0;

    for (int i = 0; i < 10000; i++) {
      sorteio = sortear(0, 3);
      switch (sorteio) {
        case 0:
          qtdOcorre0++;
          break;
        case 1:
          qtdOcorre1++;
          break;
        case 2:
          qtdOcorre2++;
          break;
        default:
          System.out.println("Sorteou valor errado: " + sorteio);
          break;
      }
    }
    System.out.println("[0]: " + qtdOcorre0 + " [1]: " + qtdOcorre1 + " [2]: " + qtdOcorre2);
  }

  private int sortear(int inicio, int fim) {
    return (int) ((Math.random() * fim) - inicio);
  }

  public static void main(String[] args) {
    new ExemploSortear();

  }

}
