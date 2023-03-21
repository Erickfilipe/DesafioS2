package Funcoes;

import java.util.Scanner;

public class Aula4 {

    public static final double PI = 3.1416;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valo do RAIO:");
        double raio = input.nextDouble();


        double areaDoCirculo = calculaAreaDoCirculo(raio);
        System.out.println("Valor da Área do Circulo: " + areaDoCirculo);


        double novaArea = calculaAreaDoCirculo(2);
        System.out.println("Nova Área: " + novaArea);


        input.close();
    }

    private static double calculaAreaDoCirculo(double raio) {

        return PI * (raio * raio);
    }

}

