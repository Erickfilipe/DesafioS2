package Exe_2;

import java.util.Scanner;

public class SistemaDaPorta {


    private boolean porta = true;

    private String cor;

    private double dimensaoX = 2.10;
    private double dimensaoY = 1.2;
    private double dimensaoZ = 0.5;

    public SistemaDaPorta(String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }


    public boolean isPorta() {
        return porta;
    }

    public void setPorta(boolean porta) {
        this.porta = porta;
    }

    public String getCor() {

        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }


    public void abrirPorta() {
        if (porta) {
            System.out.println("A porta está aberta");
            System.out.println("                   ");
        }
    }

    public void fecharPorta() {
        if (this.porta) {
            this.porta = false;
            System.out.println("A porta está fechada");
            System.out.println("                   ");
        }
    }

    public void pintarPorta(String novacor) {
        this.cor = novacor;
        novacor = this.cor;
        System.out.println("Essa é a nova cor: " + novacor);
        System.out.println("                   ");

    }

    public void statusdaPorta() {

        System.out.println("----- Status da Porta -----");

        if (this.porta == true) {
            System.out.println("A porta está aberta");
        } else {
            System.out.println("A porta está fechada");
        }
        System.out.println("Está pintada de: " + this.cor);
        System.out.println("A altura é de: " + dimensaoX + " M");
        System.out.println("A largura é de: " + dimensaoY + " M");
        System.out.println("A espessura é de: " + dimensaoZ + " cm");
        System.out.println("                   ");

    }

    public void redimensionar() {
        Scanner imput = new Scanner(System.in);
        System.out.println("Informe a Altura:");
        double valoraltura = imput.nextDouble();
        this.dimensaoX = valoraltura;

        System.out.println("Informe o Largura: ");
        double valorlargura = imput.nextDouble();
        this.dimensaoY = valorlargura;

        System.out.println("Informe a Espessura");
        double valorespessura = imput.nextDouble();
        this.dimensaoZ = valorespessura;

        System.out.println("Essas são as novas dimensões");
        System.out.println("Altura: " + valoraltura);
        System.out.println("Largura: " + valorlargura);
        System.out.println("Espessura: " + valorespessura);
        System.out.println("                   ");
    }

    public void statusSimplesdaPorta() {

        System.out.println("----- Status da Porta -----");

        if (this.porta == true) {
            System.out.println("A porta está aberta");
            System.out.println("                   ");
        } else {
            System.out.println("A porta está fechada");
            System.out.println("                   ");
        }

        System.out.println("Está pintada de: " + this.cor);


    }

    public boolean Aportaestaaberta(){
        return this.porta;
    }

}