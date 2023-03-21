package Lista3;

import java.util.Scanner;

public class Lista3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Me diga o seu salario");
        double sm = input.nextDouble();
        System.out.println("Agora o reaguste");
        double pr = input.nextDouble();

        double ms = (sm + pr);
        System.out.println("seu novo salario " + ms);





        input.close();
    }
}
