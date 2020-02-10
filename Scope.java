public class Scope {

  // because x is declared outside of any method, it is in scope to all methods, in other words...
  // any method can access x
  static int x; // declaring the variable x

  public static void main (String[] args){
   x = 5;
   
   System.out.println(x);

   something ();

   System.out.println(x);
  }

 static void something () {
   x = 10;
  }

 static void somethinglocally() {
   // because y is declared inside of this method, it is local to this method, in other words...
   // no other method has access to y
   int y = 50; // declaring and initiallizing the variable y
  }
}
