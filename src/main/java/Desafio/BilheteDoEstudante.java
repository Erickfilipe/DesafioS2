package Desafio;

import java.util.Random;
public class BilheteDoEstudante extends BilheteUnicoPadrao{
    public BilheteDoEstudante(Login usuario) {
        super(usuario);
    }
    int cota = 48;
    public void pagarPassagem(){
        cota = cota - 1;
    }
    public void recargaBilhete(){
        cota = cota + 48;
    }

    public String toString(){
        String dados = "";
        dados += "Nome do Usuário: " + usuario.getNome() + " | ";
        dados += "Código do Bilhete " + getCodigo() + " | ";
        dados += "Número do Cpf: " + usuario.getCPF() + " | ";
        dados += "Número de Telefone: " + usuario.getTelefone() + " | ";
        dados += "Seu E-mail: " + usuario.getEmail() + " | ";
        dados += "Suas cotas: " + this.cota + " | ";

        return dados;
    }


}
