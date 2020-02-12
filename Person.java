public class Person {
	String name; // instance variable
	int age;
// ^ adding static their makes both people 18 years old because it was the last age set

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sayHelloTo(Person berry) {
		// TODO Auto-generated method stub
		System.out.println(getName() + " said hello to " + getName());
		
	}
}
