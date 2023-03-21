package arrays;

import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];

        //Carrega valores no arrays A
        for (int i = 0; i < 10; i++){
            System.out.println("Informe o valor dos elementos " + (i+1));
            a[i] = input.nextInt();

        }

        //Carrega valores no arrays B (Metade do A)
        for (int i = 0; i < 10; i++){
            b[i] = a[i] / 2;

        }

        //Exibe os resusltados
        for (int i = 0; i < 10; i++){
            System.out.println("Valores dos arrays A e B,na posição: " + (i+1));
            System.out.println(a[i] + "|" + b[i]);
        }





        input.close();

    }

}
