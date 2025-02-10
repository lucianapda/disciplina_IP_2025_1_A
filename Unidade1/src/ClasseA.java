// somente para demonstrar diagrama de classes 
public class ClasseA {
  private int teste;

  private ClasseA() {
    teste = 5;
    System.out.println("ClasseA: " + teste);
    ClasseB classeB = new ClasseB();
    classeB.imprimir();
  }

  public void imprimir() {
    System.out.println("ClasseA.imprimir: " + teste);
  }

  public static void main(String[] args) {
    new ClasseA();
  }

}
