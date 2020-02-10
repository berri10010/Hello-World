public class TypesAndVariables {
  public static void main (String[] args) {

    int a1; // declaring a variable called a1 that stores the type int, or integers
    a1 = 8; // initializing myVariable to the value 8
    int a2 = 2; //  declaring and initializing in a single step
    double b1 = 0.5;
    String c1 = "Hello ";
    String c2 = "World!";

    System.out.println(a1); // 8
    System.out.println(a2); // 2

    a1 = 16;
    
    System.out.println(a1); //16

    a1 = a1 + 8;

    System.out.println(a1); // 24
    System.out.println(a1 + a2); // 26
    System.out.println(a1 + a2 + b1); // 26.5

    System.out.println(c1); // Hello
    System.out.print(c1 + c2); // Hello World!

  }
}
