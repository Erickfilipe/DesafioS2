package Lista3;

import java.util.Scanner;

public class Lista3_6 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);


      System.out.println("informe o valor de A: ");
      double A = input.nextDouble();

        System.out.println("informe o valor de B: ");
        double B = input.nextDouble();

        System.out.println("informe o valor de C: ");
        double C = input.nextDouble();


        double delta = (B * B - (4 * A * C));

        double X1 = (-B + Math.sqrt(delta)) / ((2 * A));
        double X2 = (-B - Math.sqrt(delta)) / ((2 * A));

        if (delta < 0){
            System.out.println("Não há solução nos números reais");
        }
        if (delta == 0){
            System.out.println(X1);
        }
        if (delta > 0){
            System.out.println("esse será o valor: " + X1 + " | " + X2);
        }


        input.close();
      }
}
