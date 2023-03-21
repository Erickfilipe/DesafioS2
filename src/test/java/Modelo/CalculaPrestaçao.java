package Modelo;

import java.util.Scanner;

public class CalculaPrestaçao {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
                System.out.println("Me diga o valor a ser calculado");
                double valor = input.nextDouble();
                System.out.println("Agora a Taxa");
                double taxa = input.nextDouble();
                System.out.println("Agora o tempo");
                int tempo = input.nextInt();

                double prestaçao = valor + (valor * (taxa/100) * tempo);
                System.out.println(prestaçao);




                input.close();
    }


}
