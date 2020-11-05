public class WideningCasting {
        public static void main(String[] args) {
            int myInt = 9;
            double myDouble = myInt;

            double myDouble01 = 11.5;
            //int    myInt01    = myDouble01; //Teste para visualizar Erro

            System.out.println(myInt);
            System.out.println(myDouble);
            System.out.println("---------------");
            System.out.println(myDouble01);
            //System.out.println(myInt01);
        }
}
