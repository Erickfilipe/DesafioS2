package Lista3;

import java.util.Scanner;

public class Lista3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe o valor númerico ");
        int A = input.nextInt();

        System.out.println("informe o segundo valor ");
        int B = input.nextInt();

        System.out.println("Essa é a diferença " + (A - B));




       input.close();
    }
}
