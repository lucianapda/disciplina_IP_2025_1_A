/*
Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. 
Assumindo uma idade para cada filho, e que não existe empate na idade.
Quem é o caçula da família?

_ Estratégia:
Usar a condição V do IF para afirmar que é o caçula
Usar a condição F do IF para "excluir" que não pode ser caçula.
*/

public class ExemploTesteTresIrmaos {
  public static void main(String[] args) {
    int idadeMarquinhos = 40;
    int idadeZezinho = 30;
    int idadeLuluzinha = 20;
            
    if (idadeMarquinhos < idadeZezinho) { //Zezinho Não é caçula
      if (idadeMarquinhos < idadeLuluzinha) {
        System.out.println("Marquinhos é caçula");
      } else { // Marquinhos é NÃO caçula
          /*Automaticamente Luluzinha é caçula, pois se idade do Marquinhos é Menor que idade Zezinho
            e idade Marquinhos é maior que idade Luluzinha*/ 
          System.out.println("Luluzinha é caçula");
      }
    } else { // Marquinhos é NÃO caçula
      if (idadeZezinho < idadeLuluzinha) {
        System.out.println("Zezinho é caçula");
      } else { // Marquinhos e Zezinho é NÃO caçula
        System.out.println("Luluzinha é caçula");
      }
    }
  }
}

/*
  Valores de teste 
  _ opção M1: Marquinhos é caçula, e Zezinho < Luluzinha
  int idadeMarquinhos = 20; 
  int idadeZezinho = 30; 
  int idadeLuluzinha = 40;

  _ opção M2: Marquinhos é caçula, e Luluzinha <Zezinho
  int idadeMarquinhos = 20; 
  int idadeZezinho = 40; 
  int idadeLuluzinha = 30;
  
  _ opção Z1: Zezinho é caçula, e Marquinhos < Luluzinha
  int idadeMarquinhos = 30; 
  int idadeZezinho = 20;
  int idadeLuluzinha = 40;

  _ opção Z2: Zezinho é caçula, e Luluzinha < Marquinhos
  int idadeMarquinhos = 40; 
  int idadeZezinho = 20;
  int idadeLuluzinha = 30;
  
  _ opção L1: Luluzinha é caçula, e Marquinho < Zezinho
  int idadeMarquinhos = 30;
  int idadeZezinho = 40;
  int idadeLuluzinha = 20;

  _ opção L2: Luluzinha é caçula, e Zezinho < Marquinho
  int idadeMarquinhos = 40;
  int idadeZezinho = 30;
  int idadeLuluzinha = 20;
 */
