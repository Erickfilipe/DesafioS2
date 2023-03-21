package Desafio;

import java.util.Scanner;

public class BilheteUnico extends BilheteUnicoPadrao{

    public BilheteUnico(Login usuario) {
        super(usuario);
    }

    @Override
    public void pagarPassagem(double desconto) {
        saldo = saldo - desconto;
    }

    @Override
    public void recargaBilhete(double adicao) {
        saldo = saldo + adicao;
    }

}
