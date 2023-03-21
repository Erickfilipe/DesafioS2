package Exe_5;

public class Livros {
    private String NomeDoLivro;

    private String NomeDoAutor;

    public Livros(String NLivro, String NAutor){
        this.NomeDoLivro = NLivro;
        this.NomeDoAutor = NAutor;
    }

    @Override
    public String toString() {
        return NomeDoLivro + " | " +  NomeDoAutor;
    }
}
