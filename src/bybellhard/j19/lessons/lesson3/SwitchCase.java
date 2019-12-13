package bybellhard.j19.lessons.lesson3;

public class SwitchCase {
    public static void main(String[] args) {

        int i = 2;
        switch (i){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("no input");
                break;
        }
    }
}
