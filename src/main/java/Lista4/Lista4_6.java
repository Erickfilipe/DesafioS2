package Lista4;

import java.util.Scanner;

public class Lista4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] temperaturas = new double[7];
        double maior = Integer.MIN_VALUE,menor = Integer.MAX_VALUE;
        double soma = 0;
        double media = 0;
        int quantidadeDedias = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Informe as temperaturas:");
            temperaturas[i] = input.nextDouble();
        }

        for (double temperatura : temperaturas) {

            if (temperatura > maior){
                maior = temperatura;
            }

            if (temperatura < menor){
                menor = temperatura;
            }

            soma = soma + temperatura;
        }

        media = soma / temperaturas.length;

        for (double temperatura : temperaturas) {

            if (temperatura < media){
                quantidadeDedias = quantidadeDedias + 1;
            }

        }

        System.out.println("Maior tempura da semana:" + maior);
        System.out.println("Menor tempura da semana:" + menor);
        System.out.println("Média da semana:" + media);
        System.out.println("Quantida de dias que a temperaturas foi abaixo da média: " + quantidadeDedias);

        input.close();
    }
}
