package Lista4;

import java.util.Scanner;

public class Lista4_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerop;
        int divisores = 0;

        System.out.print("Informe um número:");
        numerop = input.nextInt();

        for (int i = 1; i <= numerop; i++) {
            if (divisores % i == 0){
                divisores++;
            }
        }

        if (divisores == 2){
            System.out.println("O número é PRIMO");
        }else{
            System.out.println("O número não é PRIMO");
        }

     input.close();
    }
}
