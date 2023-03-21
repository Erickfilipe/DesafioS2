package Lista4;

import java.util.Arrays;
import java.util.Scanner;

public class Lista4_1 {

    public static void main(String[] args) {

        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * i * i;
        }
        System.out.println("Calculo ao cubo: " + Arrays.toString(numeros));




    }
}
