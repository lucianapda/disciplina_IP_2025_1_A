/*
 * Exemplo de utilização dos principais métodos da Classe Math
 */
public class ExemploMath {

    // Exibe as constantes da classe Math
    public static void exibirConstantes() {
        System.out.println("E: " + Math.E);
        System.out.println("PI:" + Math.PI);
    }

    // Valor mais alto entre os valorA e valorB
    public static int maximo_minimo(int valorA, int valorB) {
        // pode assumir double, float, int ou long
        // return Math.min(valorA, valorB);
        return Math.max(valorA, valorB);
    }

    // Raiz quadrada ou resultado da potencia de um numero
    public static double potencia_raizQuadrada(int base, int potencia) {
        // return Math.pow(base, potencia);
        return Math.sqrt(base);
    }

    // Exibe os valores absolutos e arredondados para um numero
    public static void arredondamentos_valoresAbsolutos(double numero) {
        System.out.println("Absoluto: " + Math.abs(numero) + // retorna o valor absoluto do mesmo tipo do parâmetro
                "\nArredondamento: " + Math.round(numero) + // retorna o arredondamento do número decimal passado como
                                                            // parâmetro
                "\nArredondamento para cima: " + Math.ceil(numero) // retorna o arredondamento para cima do número
                                                                   // decimal passado como parâmetro
        );
    }

    // Um numero randomico entre os limites estabelescidos
    public static double numero_randomico(int limiteInferior, int limiteSuperior) {
        int alcance = limiteSuperior - limiteInferior;
        double numeroRandomico = Math.random();
        return Math.round(limiteInferior + numeroRandomico * alcance);
    }

    // Exibe o seno, cosseno, tangente e tangente hiperbólica para um
    public static void trigonometria(double graus) {
        System.out.println("Cosseno :" + Math.cos(graus));
        System.out.println("Seno: " + Math.sin(graus));
        System.out.println("Tangente: " + Math.tan(graus));
        System.out.println("Tangente Hiperbólica: " + Math.tanh(graus));
    }

    public static void main(String[] args) {
        arredondamentos_valoresAbsolutos(-0.2);
        exibirConstantes();
        trigonometria(90);

        System.out.println("maximo entre 0 e 1: " + maximo_minimo(0, 1));
        System.out.println("número randomico entre 5 e 15: " + (numero_randomico(5, 15)));
        System.out.println("raiz 4: " + potencia_raizQuadrada(4, 2));
    }

}
