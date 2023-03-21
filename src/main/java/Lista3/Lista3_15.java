package Lista3;

public class Lista3_15 {
    public static void main(String[] args) {
        double valorAtual = 1;
        double valoranterior;
        System.out.println("Quantida de trigo que se pode colocar em tabuleiro: ");
        double soma = 0;

        for (double i = 1; i < 65; i++) {
            System.out.println(valorAtual);
            valoranterior = valorAtual;
            valorAtual = valoranterior * 2;
            soma = soma + valoranterior;
        }
        System.out.println(soma);


    }
}
