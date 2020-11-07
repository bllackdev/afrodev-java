public class ProgreGeo implements ProgreInterface {

    @Override
    public void imprimeElementos(int razao) {
        System.out.println("Progressão Geométrica: ");
        for (int i=1; i<=razao; i++) {
            System.out.print(i*razao + " ");
        }
        System.out.println(" ");
        System.out.println("--------------------");
    }
}
