package bybellhard.j19.lessons.lesson3;

public class Primer {
    public static void main(String[] args) {

        String inputData = "Eje";
        switch (inputData) {
            case "mon":
                System.out.println("fucking hell");
                break;
            case "wed":
                System.out.println("so bad");
                break;
            case "tue":
                System.out.println("cool be batter than wed");
                break;
            case "thu":
                System.out.println("OMG");
                break;
            case "fri":
                System.out.println("at last");
                break;
            case "sat":
            case "sun":
                System.out.println("!YOOOOHOO!");
                break;
                default:
                    System.out.println("invalid input");
        }
    }
}