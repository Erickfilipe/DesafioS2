package Exe_6;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    public static void main(String[] args) {

        System.out.println("Formas e Dados");
        List<FormasGeometricas> MinhasFormas = new ArrayList<>();

        Quadrado q1 = new Quadrado(3);
        MinhasFormas.add(q1);
        Triangulo t1 = new Triangulo(2, 4,2);
        MinhasFormas.add(t1);
        Retangulo r1 = new Retangulo(6, 4,3,6);
        MinhasFormas.add(r1);
        Circulo c1 = new Circulo(11);
        MinhasFormas.add(c1);

        MinhasFormas.forEach (formas ->{

            System.out.println("       ");
            System.out.println("Forma: " + formas.getNome());
            System.out.println("Area: " + formas.calcularArea());
            System.out.println("Perimetro: " + formas.calcularPerimetro());

        });

    }
}
