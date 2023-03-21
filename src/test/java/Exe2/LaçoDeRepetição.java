package Exe2;

import java.util.Scanner;

public class LaçoDeRepetição {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Qual número da tabuada que você deseja calcular?");
        int NumeroDaTabuada = imput.nextInt();

        for (int contador=1; contador <= 20
                ; contador++){
             int ValorResultado = NumeroDaTabuada * contador;
             System.out.println(NumeroDaTabuada + " X " + contador + " = " + ValorResultado);


        }
        imput.close();
    }
}
