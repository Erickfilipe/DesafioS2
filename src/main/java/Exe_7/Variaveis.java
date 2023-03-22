package Exe_7;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Variaveis {

    Scanner input = new Scanner(System.in);
    private double A;
    private double B;
    private double C;

    private double delta;


    public void ColetaDeDados(){
        System.out.println("informe o valor de A: ");
        A = input.nextDouble();

        System.out.println("informe o valor de B: ");
        B = input.nextDouble();

        System.out.println("informe o valor de C: ");
         C = input.nextDouble();
    }

    public void CalcularDelta(){
        double delta = (B * B - (4 * A * C));
        this.delta = delta;
        System.out.println("O delta é: " + this.delta);
    }

    public double getDelta() {
        return delta;
    }

    public void CalculodoX1EX2(){
        double X1 = (-B + Math.sqrt(delta)) / ((2 * A));
        System.out.println("X1 é: " + X1);
        double X2 = (-B - Math.sqrt(delta)) / ((2 * A));
        System.out.println("X2 é: " + X2);
    }

}
