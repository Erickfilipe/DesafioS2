package Lista4;

import java.util.Scanner;

public class Lista4_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[]Q = new int[10];
        int maior = 0;
        int posicao = 0;
        int validacao = 0;

        for (int i = 0; i < Q.length;) {
            System.out.println("Informe o valor a ser adicionado na lista(lembrando que somente poderão ser adicionados números pares):");
            validacao = input.nextInt();

            if ((validacao % 2) == 0){
                Q[i] = validacao;
                System.out.println("Valor valido");
                 i++;
            }
            else {
                System.out.println("Valor infalido");
            }
            
        }

        for (int i = 0; i < 10; i++) {
            if (Q[i] > maior) {
                maior = Q[i];
                posicao = i;
            }
        }




        System.out.println("O maior elemento de Q é " + maior + ", que está na posição " + (posicao + 1) );
        
     input.close();
    }
}
