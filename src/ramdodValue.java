import javax.swing.*;
import java.util.Random;

public class ramdodValue {
    public static void main(String[] args) {
        Random random=new Random() ;

        int x = random.nextInt(22);

        JOptionPane.showMessageDialog(null,"aleatoire " + x);
        System.out.println(x);
    }
}
