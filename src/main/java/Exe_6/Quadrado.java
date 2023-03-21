package Exe_6;

public class Quadrado implements FormasGeometricas{

    private final int LadoQ;

    public Quadrado(int TamanhoDoLado){
        this.LadoQ = TamanhoDoLado;
    }
    @Override
    public double calcularArea() {
       return this.LadoQ * this.LadoQ;
    }

    @Override
    public double calcularPerimetro() {
        return LadoQ * 4;
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }
}
