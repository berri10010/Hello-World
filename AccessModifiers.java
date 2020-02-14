public class AccessModifiers {
	
	// Private is the most restrictive
	// Default 
	// protected
	// public

	private int x;
	public int y;
	int x2;
	protected int y2;
	
	public static void main(String[] args) {

	}
	
	// public visibility means that this method can be accessed in the program as long as you have an instance of this class to call it from
	public void DoSomethingPublic() {
		
	}
	
	// private visibility means that this method can't be accessed anywhere other than inside this class
	private void DoSomethingPrivate() {
		
	}

	// protected visibility means that this method can only be accessed inside of the package, and from subclasses from this class
	protected void DoSomethingProtected() {
		
	}
	// default visibility means that this method can only be accessed inside of this package
	void DoSomething() {
		
	}

}
