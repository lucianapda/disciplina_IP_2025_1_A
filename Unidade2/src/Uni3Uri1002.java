/*
__ Enunciado: 

A fórmula para calcular a área de uma circunferência é: area = π . raio2.
Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando
  por π.

Entrada: A entrada contém um valor de ponto flutuante (dupla precisão), no caso,
a variável raio.

Saída: Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme
exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla
precisão (double). Como todos os problemas, não esqueça de imprimir o fim de
linha após o resultado, caso contrário, você receberá "Presentation Error".

__ Análise: 

ok

__ Gordura: 

 Utilize variáveis de dupla precisão (double). Como todos os problemas, não
esqueça de imprimir o fim de linha após o resultado, caso contrário, você
receberá "Presentation Error".

//__ Entradas: 

ler(raio) pi = 3.14159:

//__ Processos: 

area = pi * raio * raio

//__ Saídas: 

imprimir(area)

*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1002 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_4 = new DecimalFormat("0.0000");

    // Entrada
    double pi = 3.14159; // já informado no enunciado
    double raio = teclado.nextDouble();

    // Processo
    //double area = pi * raio * raio;
    double area = pi * Math.pow(raio, 2); // usar Math

    // Saída
    System.out.println("A=" + df_4.format(area));
    teclado.close();
  }
}

/*
__ Valores de Testes: 
_ Caso 1 ___
2.00
A=12.5664

_ Caso 2 ___
100.64
A=31819.3103

_ Caso 3 ___
150.00
A=70685.7750

*/
