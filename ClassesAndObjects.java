//import javax.swing.JLabel;

public class ClassesAndObjects {
	public static void main(String[] args) {
		//JLabel label = new JLabel();
		
		Person bob = new Person("Bob", 18);
		//bob.name = "Bob";
		//bob.setAge (50);
		Person berry = new Person("Berry", 50);
		//berry.name = "Berry";
		//berry.setAge (18);
		
		bob.sayHelloTo(berry);
		berry.sayHelloTo(bob);
	
		System.out.println (bob.getName() + " is " + bob.getAge() + " years old");
		System.out.println (berry.getName() + " is " + berry.getAge() + " years old");

	}
}
