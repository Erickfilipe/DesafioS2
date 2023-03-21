package Lista4;

import java.util.Arrays;
import java.util.Scanner;

public class Lista4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int x;
        int[] m = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe o valor " + (i + 1) + ":");
            a[i] = input.nextInt();
        }
        System.out.println("Informe o valor de X");
        x = input.nextInt();

        for (int i = 0; i < m.length; i++) {
            m[i] = a[i] * x;
        }

        System.out.println("Valor do M: " + Arrays.toString(m));

     input.close();
    }
}
