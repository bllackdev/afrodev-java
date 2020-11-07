package abstrata;

public class Soma extends Calculadora {

    @Override
    protected double calcular(double num01, double num02) {

        System.out.println("Soma = " + (num01+num02));
        return (num01+num02);
    }
}
