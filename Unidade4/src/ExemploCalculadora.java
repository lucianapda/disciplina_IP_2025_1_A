
/*
Preocupação
 valores com casas decimais: double
 tratar divisão por zero: mensagem erro
 operador errado: mensagem erro

// Entradas
 numero1
 numero2
 operador

// Processo
 _ adição
  numero1 + numero2
 _ subtração
  numero1 - numero2
 _ multiplicação
  numero1 * numero2
 _ divisão
  numero1 - numero2

// Saídas
imprimir resultado
*/
import java.util.Scanner;

public class ExemploCalculadora {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println(" Entre com 1a termo: ");
    double numero1 = teclado.nextInt();

    System.out.println(" _ Entre com a opção: ");
    System.out.println(" ___ Soma          [+]");
    System.out.println(" ___ Subtração     [-]");
    System.out.println(" ___ Multiplicação [*]");
    System.out.println(" ___ Divisão       [/]");
    char operador = teclado.next().charAt(0);

    System.out.println(" Entre com 2a termo: ");
    double numero2 = teclado.nextInt();

    double resultadoValor = 0;
    boolean resultadoImprime = true;

    // _____ Calculadora usando somente If
    if (operador == '+') {
      resultadoValor = numero1 + numero2;
    }
    if (operador == '-') {
      resultadoValor = numero1 - numero2;
    }
    if (operador == '*') {
      resultadoValor = numero1 * numero2;
    }
    if (operador == '/') {
      if (numero2 != 0) {
        resultadoValor = numero1 / numero2;
      } else {
        resultadoImprime = false;
        System.out.println("Divisão por zero!!!");
      }
    }
    if (!(operador == '+' || operador == '-' || operador == '*' || operador == '/')) {
      resultadoImprime = false;
      System.out.println("Simbolos Incorreto!!!");
    }
    // Saída
    if (resultadoImprime) {
      System.out.println("Resultado: " + resultadoValor);
    }

    // _____ Calculadora usando somente IfElse
    if (operador == '+') {
      resultadoValor = numero1 + numero2;
    } else {
      if (operador == '-') {
        resultadoValor = numero1 - numero2;
      } else {
        if (operador == '*') {
          resultadoValor = numero1 * numero2;
        } else {
          if (operador == '/') {
            if (numero2 != 0) {
              resultadoValor = numero1 / numero2;
            } else {
              resultadoImprime = false;
              System.out.println("Divisão por zero!!!");
            }
          } else {
            resultadoImprime = false;
            System.out.println("Simbolos Incorreto!!!");
          }
        }
      }
    }
    // Saída
    if (resultadoImprime) {
      System.out.println("Resultado: " + resultadoValor);
    }

    // _____ Calculadora usando Switch
    switch (operador) {
      case '+':
        resultadoValor = numero1 + numero2;
        break;
      case '-':
        resultadoValor = numero1 - numero2;
        break;
      case '*':
        resultadoValor = numero1 * numero2;
        break;
      case '/':
        if (numero2 != 0) {
          resultadoValor = numero1 / numero2;
        } else {
          resultadoImprime = false;
          System.out.println("Divisão por zero!!!");
        }
        break;

      default:
      resultadoImprime = false;
      System.out.println("Simbolos Incorreto!!!");
        break;
    }
    // Saída
    if (resultadoImprime) {
      System.out.println("Resultado: " + resultadoValor);
    }

    teclado.close();
  }
}

/*
 * teste 1 _ variando o operador: + - * / $ teste 2 _ inteiro + inteiro, inteiro
 * + double, double + double teste 3 _ double / 0
 * 
 */
