public class Bicycle {
        
    private int cadence;
    private int gear;
    private int speed;
    private int id;
    private static int numberOfBicycles = 0;
        
    public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
}

    // new method to return the ID instance variable
    public int getID() {
        return id;
    }
        public static void main(String[] args) {
		Bicycle bicycle01 = new Bicycle();

		System.out.println(bicycle01);
		
		
	}
}