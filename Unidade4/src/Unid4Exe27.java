import java.util.Scanner;

/*
 * Entrada: hrChegada minChegada hrSaida minSaida
 * Saída: precoPagar hrsPermanencia
 * Processo:
 * hrsPermanencia = hrSaida - hrChegada
 * Calcular conforme a hrPermanencia o valor a pagar, seguindo a tabela de pagto
 * 
 * 
 */
public class Unid4Exe27 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite hora e minuto de entrada (hh mm): ");
        int hrChegada = s.nextInt();
        int minChegada = s.nextInt();

        System.out.print("Digite hora e minuto de saída (hh mm): ");
        int hrSaida = s.nextInt();
        int minSaida = s.nextInt();

        if (hrSaida >= hrChegada) {
            if (hrChegada >= 0 && hrChegada < 24 && hrSaida >= 0 && hrSaida < 24) {
                if (minChegada < 60 && minChegada >= 0 && minSaida < 60 && minSaida >= 0) {
                    int hrPermanencia = hrSaida - hrChegada;
                    int minPermanencia = minSaida - minChegada;

                    if (minPermanencia > 30 || hrPermanencia < 0) {
                        hrPermanencia++;
                        // hrPermanencia = hrPermanencia + 1;
                        // hrPermanencia += 1;
                    }

                    float valorPagar = 0;
                    switch (hrPermanencia) {
                        case 0:
                        case 1:
                            valorPagar = 5;
                            break;
                        case 2:
                            valorPagar = 10;
                            break;
                        case 3:
                            valorPagar = 17.5f;
                            break;
                        case 4:
                            valorPagar = 25;
                            break;
                        default: //5 horas ou mais
                            valorPagar = 25 + ((hrPermanencia - 4) * 10);
                            break;
                    }

                    System.out.println("Total a pagar R$ " + valorPagar);
                    System.out.println("Total de permanência: " + hrPermanencia + " hora(s)");
                } else {
                    System.out.println("Minuto Saída e Minuto Chegada devem ser entre  0 e 59");
                }
            } else {
                System.out.println("Hora Saída e Hora Chegada devem ser entre  0 e 23");
            }
        } else {
            System.out.println("Hora saída deve ser maior que hora chegada");
        }

        s.close();
    }
}
