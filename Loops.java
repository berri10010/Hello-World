public class Loops {

  public static void main(String[] args) {
    WhileLoop();
    DoWhileLoop();
    ForLoop();
  }

  static void WhileLoop() {
    int counter = 0;
    while (counter < 10) {
      counter = counter + 1;
      System.out.println(counter); // it will start at 1 not 0 and go to 10
    }
  }

  static void DoWhileLoop(){
    int counter = 10;
    do {
        counter = counter + 1;
        System.out.println(counter); // this will output 11 because it prints out the integer before it checks it
    } while(counter < 10);
  }

  static void ForLoop() {
    // for (initialize counter; condition to see if we should run the loop; change counter variable)
    for (int counter = 0; counter < 10; counter = counter + 1) {
      System.out.println(counter); // this will output 0 to 9 and not 1 to 10
    }
  }
}
