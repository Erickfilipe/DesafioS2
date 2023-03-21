package Exe_6;

public class Triangulo implements FormasGeometricas{

    private int AlturaT = 1;
    private int BaseT  = 1;

    private int LadosT = 2 + 3 + 2;

    public <Lados> Triangulo(int Altura, int base, int Lados){
        this.AlturaT = Altura;
        this.BaseT = base;
        this.LadosT = Lados + 3 + 2;
    }


    @Override
    public double calcularArea() {
        return AlturaT * BaseT / 2;
    }

    @Override
    public double calcularPerimetro() {
        return LadosT * 3;
    }

    @Override
    public String getNome() {
        return "Triangulo";
    }
}
