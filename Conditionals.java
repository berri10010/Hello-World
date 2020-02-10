public class Conditionals {

  public static void main (String[] args){
    // if (some expression that evaluate to true)
    //      do something

    boolean SayHello = true;
    boolean SayHey = false;
   //boolean SayGoodbye = false;

    // only the first statement to evaluate to tree gets executed
    if (SayHello) {
      System.out.println("Hello");
    } else if (SayHey) {
      System.out.println("Hey");
    } else {
      System.out.println("Goodbye");
    }

    //if (SayGoodbye) {
      //System.out.println("Goodbye");
    //}

    // >, <, >=, <=, !=, == relational operators, can also use boolean variables

    // if (x = 5) assign 5 to x
    // if ( == 5) test whether x has the value 5 (it will either be true or false)

    // && AND, || OR (shift + backslash)

    int PlayerX = 80;


    if (true && false) {
      System.out.println("AND  executed");
    }

    // if our player is past the left side of the screen or if the player is past the right side of the screen
    if (PlayerX < 0 || PlayerX > 500) {
      // some code that reverses our player's direction
      System.out.println("OR executed");
    }

  }

}
