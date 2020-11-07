public class ProgreResult {

    public static void main(String[] args) {
        ProgreInterface pA = new ProgreAri();
        pA.imprimeElementos(10);

        ProgreInterface pG = new ProgreGeo();
        pG.imprimeElementos(10);
    }
}
