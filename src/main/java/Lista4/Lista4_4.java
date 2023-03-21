package Lista4;

import java.util.Scanner;

public class Lista4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        String busca;

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe os nomes " + (i + 1) + ":");
            nomes[i] = input.nextLine();
        }

        System.out.println("Digite o nome a ser pesquisado");
         busca = input.nextLine();


         boolean achei = false;

        for (String nome:nomes) {
            if (busca.equals(nome)){
                achei = true;
            }
        }

        if (achei == true){
            System.out.println("Achei");

        }
        else{
            System.out.println("Não achei");
        }


     input.close();
    }
}
