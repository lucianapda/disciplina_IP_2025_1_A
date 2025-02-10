public class ExemploCast {
    public static void main(String[] args) throws Exception {
        // Com problema ... na conversão de tipo "cast"
        int qtd = 80, qtd1 = 10, qtd2 = 20, qtd3 = 30, qtd4 = 40;
        double um = qtd * (qtd1 / 100);
        double dois = qtd * (qtd2 / 100);
        double tres = qtd * (qtd3 / 100);
        double quatro = qtd * (qtd4 / 100);
        System.out.println(um);
        System.out.println(dois);
        System.out.println(tres);
        System.out.println(quatro);
        System.out.println("--------------------");
        
        // Uma forma, ter variavéis do mesmo tipo
        double qtdA = 80, qtd1A = 10, qtd2A = 20, qtd3A = 30, qtd4A = 40;
        double umA = qtdA * (qtd1A / 100);
        double doisA = qtdA * (qtd2A / 100);
        double tresA = qtdA * (qtd3A / 100);
        double quatroA = qtdA * (qtd4A / 100);
        System.out.println(umA);
        System.out.println(doisA);
        System.out.println(tresA);
        System.out.println(quatroA);
        System.out.println("--------------------");

        // Outra forma, usando "cast" .. gosto mais desta forma.
        int qtdB = 80, qtd1B = 10, qtd2B = 20, qtd3B = 30, qtd4B = 40;
        double umB = qtdB * ((double) qtd1B / 100);
        double doisB = qtdB * ((double) qtd2B / 100);
        double tresB = qtdB * ((double) qtd3B / 100);
        double quatroB = qtdB * ((double) qtd4B / 100);
        System.out.println(umB);
        System.out.println(doisB);
        System.out.println(tresB);
        System.out.println(quatroB);
        System.out.println("--------------------");

    }
}
