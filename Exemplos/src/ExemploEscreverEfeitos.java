public class ExemploEscreverEfeitos {
  public static void main(String[] args) {

    System.out.println("\033[H\033[2J"); // limpa console

    System.out.println("Exemplo de texto " + "\u001b[1;31m" + "vermelho" + "\u001b[0m" + ", e texto sem nada.");
    System.out.println();
    System.out.println("Exemplo de texto " + "\033[3m" + "itálico" + "\033[0m" + ", e texto sem nada.");
    System.out.println();
    System.out.println("Exemplo de texto " + "\033[0;1m" + "negrito" + "\033[0m" + ", e texto sem nada.");
    System.out.println();
    System.out.println("Exemplo de texto " + "\033[3m" + "\u001b[1;31m" + "vermelho/itálico" + "\u001b[0m" + ", e texto sem nada.");
    System.out.println();
    
    System.out.println("Exemplo de texto " + "\u00AC");
    System.out.println("Exemplo de texto " + "\u00AF");
    System.out.println("Exemplo de texto " + "\u00B2");
    System.out.println("Exemplo de texto " + "\u00B3");
    System.out.println("Exemplo de texto " + "\u00BA");
  }
}