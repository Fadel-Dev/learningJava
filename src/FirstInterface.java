import  javax.swing.JOptionPane;
public class FirstInterface {
    public static void main(String[] args) {

//        String name=JOptionPane.showInputDialog("enter your name");
//        JOptionPane.showMessageDialog(null,"hello" + name);

        int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your age")) ;
        JOptionPane.showMessageDialog(null,"your age is "+ age);


    }
}
