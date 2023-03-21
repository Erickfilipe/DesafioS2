package Exe_6;

public class Retangulo implements FormasGeometricas{

    private final int Lados1;
    private final int Lados2;

    private int AlturaR = 1;
    private int BaseR  = 1;

    public Retangulo(int LadosA, int LadosB, int base, int altura){
        this.AlturaR = altura;
        this.BaseR = base;
        this.Lados1 = LadosA;
        this.Lados2 = LadosB;
    }


    @Override
    public double calcularArea() {
        return Lados1 + Lados2 * 2;
    }

    @Override
    public double calcularPerimetro() {
        return AlturaR * BaseR;
    }

    @Override
    public String getNome() {
        return "Retangulo";
    }
}
