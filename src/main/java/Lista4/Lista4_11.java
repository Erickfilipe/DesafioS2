package Lista4;

import java.util.Scanner;

public class Lista4_11 {
    public static void main(String[] args) {

        String palavra = "Otto";
        String reverse = "";

        for (int i = (palavra.length() - 1); i >= 0; i--) {
           reverse += palavra.charAt(i);
        }
        if (reverse.toLowerCase().equals(palavra.toLowerCase())){
            System.out.println("É um palidromo");
        } else {
            System.out.println("Não é um palidromo");
        }
    }
}
