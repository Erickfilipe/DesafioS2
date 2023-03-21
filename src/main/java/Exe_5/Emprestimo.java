package Exe_5;

public class Emprestimo {

    public static void main(String[] args) {


        Livros l1 = new Livros("Como eu era antes de você", "Jojo Moyes");
        Pessoa p1 = new Pessoa("Marcos", "324.544.657-24");

        System.out.println("O livro: " + l1);
        System.out.println("Foi emprestado para: " + p1);
    }
}
