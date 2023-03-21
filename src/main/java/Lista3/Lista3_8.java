package Lista3;

import java.util.Scanner;

public class Lista3_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println();

        int c = 10;

        for (int contador=1; contador <= 8
                ; contador++) {
            int Valorc = c * contador;
            int Resultado = (9 * Valorc + 160) / 5 ;
            System.out.println("celsius " + Valorc + " | " + "fahrenheit " + Resultado);
        }

        input.close();

    }
}
