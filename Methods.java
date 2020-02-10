public class Methods {
  public static void main (String[] args) {
    sayHelloWorld(); // Hello World!
    sayHelloTo("Bob"); // Hello Bob
    sayHelloTo("Berry"); // Hello Berry

    int a1 = returnten(); // a1 is now returnten and says 10
    int d1 = square(5); // d1 is now the squareroot of 5

    System.out.println(a1); // 10
    System.out.println(d1); // 25
  }

  // f(x) = x * x
  // this method both returns a value and takes in data
  static int square(int x) {
    return x * x;
  }

  // this method return an int type with the value 5
  static int returnten() {
    return 10;
  }

  // this method will say hello to whatever name it is called
  static void sayHelloTo(String name) {
    System.out.println("Hello " + name); // Hello + the text you add in ("")
  }

  // this method simply says "Hello Workd!"
  static void sayHelloWorld() { 
    System.out.println("Hello World!"); // Hello World!
  }

}
