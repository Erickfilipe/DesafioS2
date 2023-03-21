package Exe_7;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Variaveis V1 = new Variaveis();
        Scanner Verifique = new Scanner(System.in);

        V1.ColetaDeDados();

        V1.CalcularDelta();

        System.out.println(V1.getDelta());

        V1.CalculodoX1EX2();



    }
}
