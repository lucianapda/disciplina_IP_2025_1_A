// somente para demonstrar diagrama de classes 
public class ClasseB {
  int teste = 10;

  public ClasseB() {
    System.out.println("ClasseB: " + teste);
    teste += 5;
  }

  public void imprimir() {
    System.out.println("ClasseB.imprimir: " + teste);
  }
}
