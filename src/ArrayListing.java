import java.util.ArrayList;
public class ArrayListing {
    public static void main(String[] args) {
    ArrayList<String> food = new ArrayList<String>();
        food.add("yassa");
        food.add("mafe");
        food.add("soupou kandia");

        int nbr= food.size();

        for (int a = 0 ; a < nbr; a++)
        {
            System.out.println(food.get(a));
        }
//        System.out.println(nbr);

    }
}
