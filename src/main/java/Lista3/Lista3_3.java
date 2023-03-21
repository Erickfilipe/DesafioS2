package Lista3;

import java.util.Scanner;

public class Lista3_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("informe o valor númerico ");
        int nv = input.nextInt();

        double ns = (nv + 1);
        System.out.println("Esse e o valor sucessor " + ns);

        double na = (nv - 1);
        System.out.println("valor antecessor " + na);


        input.close();
    }
}
