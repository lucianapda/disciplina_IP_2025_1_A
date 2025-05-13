public class ExemploMetodos {

  private ExemploMetodos() { // Construtor
    int numero = 10;            // passagem de parâmeto por valor
    int vetor[] = new int[2];   // passagem de parâmeto por referência
    vetor[0] = 20;
    vetor[1] = 30;
    System.out.println(numero);
    System.out.println(vetor[0]);
    System.out.println(vetor[1]);
    metodo(numero,vetor);
    System.out.println(numero);     // 10
    System.out.println(vetor[0]);   // 200
    System.out.println(vetor[1]);   // 300
  }
  
  private void metodo(int numero, int vetor[]) {
    System.out.println(numero);
    System.out.println(vetor[0]);
    System.out.println(vetor[1]);
    numero = 100;
    vetor[0] = 200;
    vetor[1] = 300;
    System.out.println(numero);
    System.out.println(vetor[0]);
    System.out.println(vetor[1]);
  }

  public static void main(String[] args) {
    new ExemploMetodos();
  }

}
