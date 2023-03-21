package Lista3;

import java.util.Scanner;

public class Lista3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] temperatura = new double[21];
        double soma = 1;


        for (int i=1; i < temperatura.length; i++){
            System.out.println("Digite as temperaturas " + (i) + ":");
            temperatura[i] = input.nextDouble();
            soma = temperatura[i];
        }

                double menortemperatura = Integer.MAX_VALUE;
                for (int i = 1; i < temperatura.length; i++) {
                    if (temperatura[i] < menortemperatura)
                        menortemperatura = temperatura[i];




                }


                    double maiortemperatura = Integer.MIN_VALUE;
                    for (int i = 1; i < temperatura.length; i++) {
                        if (temperatura[i] > maiortemperatura) {
                        maiortemperatura = temperatura[i];
                    }
                }

                    double mediadastemperatura = soma / 20;

                      System.out.println("A maior temperatura foi: " + maiortemperatura);
                      System.out.println("A menor temperatura foi: " + menortemperatura);
                      System.out.println("A média temperatura foi: " + mediadastemperatura);

                        input.close();

    }
}
