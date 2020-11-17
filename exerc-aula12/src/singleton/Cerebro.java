package singleton;

/**
 * @author Raphael Renato
 *
 * Exercicio de Design Patterns - Singleton
 */
public class Cerebro {
    private static Cerebro instancia;

    private Cerebro() {

    }
    // synchronized: para que duas ou mais threads
    // não acesse o metodo ao mesmo tempo
    public synchronized static Cerebro getInstance() {
        if (instancia == null) {
            instancia = new Cerebro();
        }
        return instancia;
    }
}
