import java.util.Scanner;

public class Unid4Exe06 {
    /* Entrada: letra
     * Saída: Masculino ou Feminino ou Não Informado ou Entrada Incorreta
     * Processo:
     * ler a letra, converter para maiúsculo,
     * se a letra for M, imprimir Masculino
     * se a letra for F, imprimir Feminino
     * se a letra for I, imprimir Não Informado
     * senão imprimir Entrada Incorreta
     * 
     * 
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();

        if (A > B && A > C)
        {
            if (B > C)
            {
                System.out.println(C);
                System.out.println(B); 
                System.out.println(A);
                System.out.println();
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);
            }
            else
            {
               System.out.println(B);
               System.out.println(C);
               System.out.println(A);
               System.out.println();
                System.out.println();
                System.out.println(A);
                System.out.println(C);
                System.out.println(B);
                
                
            }
        }
        else if (B > C && B > A)
        {
            if (A > C)
            {
               System.out.println(C);
               System.out.println(A);
               System.out.println(B);
               System.out.println();
               System.out.println(B);
               System.out.println(A);
               System.out.println(C);

            }
            else
            {
                System.out.println(A);
                System.out.println(C);
                System.out.println(B);
                System.out.println();
                System.out.println(B);
               System.out.println(C);
               System.out.println(A);
                
            }
        }
        else
        {
            if (A > B)
            {
                
                System.out.println(B);
                System.out.println(A);
                System.out.println(C);
                System.out.println();
                System.out.println(C);
               System.out.println(A);
               System.out.println(B);
                
            }
            else
            {
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);
                System.out.println();
                System.out.println(C);
               System.out.println(B);
               System.out.println(A);

               
            }
        }


    }

}
