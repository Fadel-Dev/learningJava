public class Switch {
    public static void main(String[] args) {
        String day="tuesday";
        switch (day)
        {
            case "monday":
                System.out.println("the first day in th month");
                break;
            case "tuesday":
                System.out.println("the second day in th month");
                break;
            case "wednesday":
                System.out.println("the third day in th month");
                break;
            default:
                System.out.println("may be 4e , 5e , 6e or 7e day");

        }
    }
}
