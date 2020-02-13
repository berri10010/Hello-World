public class ReferenceAndValueType {
	public static void main(String[] args) {
		// byte, short, int, long, float, double, boolean, char
		
		//int x = 5; // added 5 to int
		//AddOneTo(x); // we're passing a value type, so we pass a copy of the value of x, which is 5
		//System.out.println(x);
		
		// Bonus
		Person paris;
		paris = new Person("Paris");
		paris.setName("Paris");
		
		Person john;
		john = new Person("John Cena"); // we are creating a new person objects, and assigning john to refer to it 
		john.setAge(42);
		john.setName("Jhon Cena"); // added myself
		CelebrateBirthday(john); // we're passing that reference to a method, so the method can use that reference to manipulate the object
		
		System.out.println(john.getName() + (" well be ") + john.getAge() + (" years old on April 23!")); // added on to it
		System.out.println(john.getName() + (" well probably not be at ") + paris.getName() + (" tomorrow."));// part of bonus
		}
	
	private static void CelebrateBirthday(Person john) {
		// TODO Auto-generated method stub
		 john.setAge(john.getAge() + 1);
	}
	
	// Manipulate a copy of the value passed
	static void AddOneTo (int number) {
		number = number + 1;
	}

}
