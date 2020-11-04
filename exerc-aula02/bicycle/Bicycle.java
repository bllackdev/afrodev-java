public class Bicycle {
        
    private int cadence;
    private int gear;
    private int speed;
    private int id;
    private static int numberOfBicycles = 0;
        
    public Bicycle(){
        // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
    }

    // new method to return the ID instance variable
    public int getID() {
        return id;
    }
        public static void main(String[] args) {
		Bicycle bicycle01 = new Bicycle();
		Bicycle bicycle02 = new Bicycle();
		
		System.out.println(bicycle01.getID());
		System.out.println(numberOfBicycles);
		
	}
}