package Lista4;

import java.util.Scanner;

public class Lista4_9 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Informe um número: ");
            int numeros = input.nextInt();
            char resultado = verificaNumero(numeros);
            System.out.println("O número informe é: " + resultado);
        }

        public static char verificaNumero(int numeros) {
            if (numeros > 0) {
                return 'P';
            }
            else {
                return 'N';
            }
        }
    }


