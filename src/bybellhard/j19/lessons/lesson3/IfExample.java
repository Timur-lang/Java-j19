package bybellhard.j19.lessons.lesson3;


public class IfExample {
    public static void main(String[] args) {
        int a = 15;
        int b = 9;

        if (a < 10) {
            System.out.println("Jacket");
        } else if (a < 18) {
            System.out.println("Sweater");
        } else if (a < 25) {
            System.out.println("Pants");
        } else {

            System.out.println("nothing");

        }
        System.out.println(a);
    }
}