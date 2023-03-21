package Lista3;

import java.util.Scanner;

public class Lista3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Informe a Temperatura em graus celsios, será convertido em Fahrenheit: ");
        double C = input.nextDouble();

        double F = (9 * C + 160) / 5;
        System.out.println(F);






        input.close();
    }
}
