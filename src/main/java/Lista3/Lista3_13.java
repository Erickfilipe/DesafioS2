package Lista3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lista3_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer[] numeros = new Integer[12];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento:");
            numeros[i] = input.nextInt();
        }

        int troca;
        for (int l = 0; l < numeros.length; l++) {
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] < numeros[i + 1]){
                    troca = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = troca;
                }
            }
            
        }

        System.out.print("Elementos ordenados em ordem decrescente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ",");
        }

     input.close();
    }
}
