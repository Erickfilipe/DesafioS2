package Lista3;

import java.util.Scanner;

public class Lista3_7 {
    public static void main(String[] args) {
        Scanner olhosdeaguia = new Scanner(System.in);

        System.out.println("seram exibidos os valores:");

        for (int Valor = 0; Valor < 20; Valor++){
            if ((Valor % 2) != 0){
                System.out.println(Valor);
            }

        }



                olhosdeaguia.close();
    }
}
