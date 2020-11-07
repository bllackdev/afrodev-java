public class ProgreAri implements ProgreInterface{

    @Override
    public void imprimeElementos(int razao) {
        System.out.println("Progressão Aritmética: ");
        for (int i=1; i<=razao; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("--------------------");
    }
}
