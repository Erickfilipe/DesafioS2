package Lista4;

import java.util.Scanner;

public class Lista4_14 {
    static double base = 1;
    static double altura = 1;

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite a base do RETÂNGULO:");
        base = imput.nextDouble();

        System.out.println("Digite a altura do RETÂNGULO:");
        altura = imput.nextDouble();

        retangulo();
    }

    public static void retangulo(){

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("v");
            }
            System.out.println();
        }

    }

}
