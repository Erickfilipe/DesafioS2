package Exe_2;

import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {
        SistemaDaPorta porta = new SistemaDaPorta("laranja", 2.2, 1.0, 0.5);

        porta.pintarPorta("Amarelo");

        porta.abrirPorta();

        porta.statusdaPorta();

        porta.redimensionar();

        porta.statusdaPorta();

    }
}
