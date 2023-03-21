package Lista3;

import javax.swing.*;
import java.util.Scanner;

public class Lista3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] matrizA = new int[12];
        int indexA = 0;
        while (indexA < 12) {
            System.out.print("Digite o " + (indexA+1) + "º elemento da matriz A (divisível por 2 ou 3): ");
            int elemento = input.nextInt();
            if (elemento % 2 == 0 || elemento % 3 == 0) {
                matrizA[indexA] = elemento;
                indexA++;
            } else {
                System.out.println("O elemento deve ser divisível por 2 ou 3. Tente novamente.");
            }
        }

        int[] matrizB = new int[12];
        int indexB = 0;
        while (indexB < 12) {
            System.out.print("Digite o " + (indexB+1) + "º elemento da matriz B (não múltiplo de 5): ");
            int elemento = input.nextInt();
            if (elemento % 5 != 0) {
                matrizB[indexB] = elemento;
                indexB++;
            } else {
                System.out.println("O elemento não deve ser múltiplo de 5. Tente novamente.");
            }
        }

        int[] matrizC = new int[24];
        for (int i = 0; i < 12; i++) {
            matrizC[i] = matrizA[i];
        }
        for (int i = 0; i < 12; i++) {
            matrizC[12+i] = matrizB[i];
        }

        System.out.print("Elementos da matriz C: ");
        for (int i = 0; i < 24; i++) {
            System.out.print(matrizC[i] + " ");
        }

        input.close();
    }

}
