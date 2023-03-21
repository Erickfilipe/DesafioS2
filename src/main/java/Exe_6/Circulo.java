package Exe_6;

public class Circulo implements FormasGeometricas{

    private double Raio = 3;

    public Circulo(double RAio){
        this.Raio = RAio;
    }


    @Override
    public double calcularArea() {

        double cal = Raio * 3.14;
        double Raio = cal * cal;
        return Raio;

    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.14 * Raio;
    }

    @Override
    public String getNome() {
        return "Circulo";
    }
}
