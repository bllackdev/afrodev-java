package singleton;

/**
 * @author Raphael Renato
 *
 * Exemplo de Design Patterns Singleton
 */
public class Singleton {
    private Singleton() {}

    private static Singleton INSTANCE;

    public synchronized static Singleton getInstance() {
        if (INSTANCE == null) {
            System.out.println("Criando objeto");
            INSTANCE = new Singleton();
        }
        System.out.println("Retornando objeto criado anteriormente");
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("Fim do programa!!!");
    }
}
