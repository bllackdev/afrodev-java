package abstrata;

public class Subtracao extends Calculadora {

    @Override
    protected double calcular(double num01, double num02) {
        System.out.println("Subtracao = " + (num01-num02));
        return (num01-num02);
    }
}


