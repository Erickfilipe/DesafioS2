package Lista3;

import java.util.Scanner;

public class DesafioVinicin{
    public static void main(String[] args) {
        int valorAtual = 0, valoranterior = 1;
        System.out.println("Séra exebido os primeiros 15 números de Fibonacci:");

        for (int i = 0; i < 15; i++) {
            System.out.println(valoranterior);
            int soma = valorAtual + valoranterior;
            valorAtual = valoranterior;
            valoranterior = soma;
        }

    }
}




