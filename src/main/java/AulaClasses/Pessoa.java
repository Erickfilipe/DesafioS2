package AulaClasses;

public class Pessoa {

    private String nome = "jose";
    private int idade;

    public Pessoa(String nomedapessoa){
        this.nome = nomedapessoa;
    }

    public Pessoa(){

    }

    public void fazaniversario(){
        int novaidade = this.idade  + 1;
        this.idade = novaidade;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
