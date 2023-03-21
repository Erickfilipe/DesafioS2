package Desafio;

public class Login {
    protected String Nome;
    protected String CPF;

    public Login(String nome, String CPF, String email, String telefone) {
        this.Nome = nome;
        this.CPF = CPF;
        this.Email = email;
        this.Telefone = telefone;
    }

    protected String Email;
    protected String Telefone;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefone() {
        return Telefone;
    }


}
