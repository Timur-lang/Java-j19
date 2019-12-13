package bybellhard.j19.lessons.lesson3;

public class ForExample {

    public static void main(String[] args) {

       /* for (int i = 0, q = 1; i < 5 & q > 10; i++,q--){

        }*/

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(i*j);
                i++;
            }
            System.out.println();
        }
    }
}
