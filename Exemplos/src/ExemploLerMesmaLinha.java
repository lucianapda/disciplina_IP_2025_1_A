import java.util.Scanner;
public class ExemploLerMesmaLinha {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double pedagioCusto;
    double pedagioDistancia;

    // Entrada numa linha
    System.out.println("-------------------");
    System.out.print("Pedágio: "); 
    pedagioCusto = teclado.nextDouble();
    System.out.print("Distância: ");
    pedagioDistancia = teclado.nextDouble();

    // Entrada numa linha
    System.out.println(" Pedágio Distância ");
    System.out.println("-------------------");
    System.out.print("   ");
    pedagioCusto = teclado.nextDouble();
    pedagioDistancia = teclado.nextDouble();
    
    // Processo
    
    // Saída
    System.out.println(pedagioCusto);
    System.out.println(pedagioDistancia);

    teclado.close();
  }
}
