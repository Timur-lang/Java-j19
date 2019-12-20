package bybellhard.j19.lessons.lesson5;

public class lesson5 {
    public static void main(String[] args) {
        Player player = new Player();
        player.printInfo();
        player.move(- 3, - 4);
        player.printInfo();
        player.move(- 3, - 4);
        player.printInfo();

        System.out.println(player.toString());


    }
}