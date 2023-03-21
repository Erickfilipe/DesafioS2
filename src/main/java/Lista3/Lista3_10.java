package Lista3;

import java.util.Scanner;

public class Lista3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i=0;i < nomes.length; i++){
            System.out.println("Digite os nomes " + (i+1) + ":");
            nomes[i] = input.nextLine();
        }

        System.out.println("Os nomes:");
        for (int i=0;i < nomes.length; i++){
            System.out.println("Nomes " + (i+1) + ":" + nomes[i]);
        }


        input.close();
    }


}
