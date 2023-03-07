import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row;
        int column;
        String symbol="*";



        System.out.println("le nbre de row");
        row=s.nextInt();

        System.out.println("le nbre de col");
        column=s.nextInt();

        for (int i=0; i<row;i++)
        {
            System.out.println();
            for (int j=0; j<column;j++)
            {
                System.out.print(symbol);
            }
        }
    }
}
