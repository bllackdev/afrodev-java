package abstrata;

public abstract class Calculadora {

    protected abstract double calcular(double num01, double num02);

    public void valoresCalculados(double num01, double num02) {
        inicioOper();
        calcular(30, 15);
        fimOper();
    }

    protected  void inicioOper() {
        System.out.println("Inicio da operação...");
    }

    protected void fimOper() {
        System.out.println("Fim da operação...");
        System.out.println("----------------------");
    }
}
