
public class CaixaAreia {

  private CaixaAreia() { // construtor
    int numero = 17;              // endereço memória 105
    int vetor[] = { 10,20,30 };   // endereço memória 130

    //         17    130
    testeAula(numero,vetor);

    // numero = 17       tipos primitivos a passagem de parâmetro é por valor
    // vetor[0] = 50    tipos vetor a passagem de parâmetro é por referência

    System.out.println(vetor[0]);
  }
  
  //                          17           130
  private void testeAula(int numero, int vetor[]) {
    System.out.println(numero);
    numero = 2;           // endereço memória 456
    vetor[0] = 50;        // endereço memória 130
  }
  

  public static void main(String[] args) {
    new CaixaAreia();
  }
}