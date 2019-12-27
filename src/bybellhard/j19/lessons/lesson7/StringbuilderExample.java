package bybellhard.j19.lessons.lesson7;

public class StringbuilderExample {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder(0);
        for (int i = 0; i < 10; i++)
            s.append(i);
        System.out.println(s.reverse());
    }
}
