public class Constants {
	
	public static final int WIDTH = 1920;
	public static final int HIEGHT = 1080;
	public static final Person P1 = new Person("");
	public static final int NUM_ENEMIES = 21;
	
	public static void main(String[] args) {
		
		// Constants never change once a value is assigned
		// usually static
		// by conviction, constants are upper case
		// declare constants by using the "final" modifier
		// constants can be public because there's no harm in accessing variables directly if you can't alter it
		
		System.out.println(WIDTH);
		System.out.println(HIEGHT);

		System.out.println(NUM_ENEMIES);
		
		System.out.println(Math.PI);
		
	}
}
