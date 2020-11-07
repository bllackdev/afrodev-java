package abstrata;

public class ResultadoCalc {

    public static void main(String[] args) {

        Calculadora soma = new Soma();
        soma.valoresCalculados(10,10);

        Calculadora subtracao = new Subtracao();
        subtracao.valoresCalculados(30,15);
    }
}
