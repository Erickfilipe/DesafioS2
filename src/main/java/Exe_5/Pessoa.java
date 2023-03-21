package Exe_5;

public class Pessoa {

    private String NomeDaPessoa;

    private String PCpf;

    public Pessoa(String NomeP, String Cpf){
        this.NomeDaPessoa = NomeP;
        this.PCpf = Cpf;
    }



    @Override
    public String toString() {
        return NomeDaPessoa + " | " + PCpf;
    }
}
