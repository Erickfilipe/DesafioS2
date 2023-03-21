package Lista3;

import java.util.Scanner;

public class Lista3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe um valor: ");
        int n = input.nextInt();

        if (n < 0){

            n = n * -1;
        }
        System.out.println(n);



        input.close();
    }
}
