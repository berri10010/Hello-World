import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {

  public static void main (String[] args) {
    int number = 8 ;

    // create our window
    JFrame window = new JFrame(); // window variable that holds JFrame objects, and we're creating a new JFrame to assign to our variable
    window.setTitle ("Hello World"); // we're calling methods on our JFrame objects to configure it
    window.setSize (800, 600);
    window.setVisible(true);

    // This has created a label
    JLabel label = new JLabel(); // label variable holds JLabel objects, and we're creating a new JLabel to assign to our variable
    label.setText("My Label"); // we're calling the setText method on our JLabel objects to set its text property

    window.add(label); // we're calling the odd method of our JFrame object to add our label to the window

    String a1 = "hi";
  }

}
