package Lista4;

public class Lista4_8 {

    public static void main(String[] args) {

        System.out.println(somadetodos(5,6,4));
        System.out.println(media(5,6,4));
    }

    private static double somadetodos (double n1, double n2, double n3){
        return (n1 + n2 + n3);
    }

    private static double media (double n1, double n2, double n3){
        return somadetodos(n1, n2, n3) / 3;
    }
}

