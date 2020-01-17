package bybellhard.j19.lessons.lesson9.threads.thread;

public class Main {
    public static void main(String[] args) {

        Thread myThread01 = new MyThread("myThread01");
        Thread myThread02 = new MyThread("myThread02");

        myThread01.run();//rundom
        myThread02.run();
        // myThread01.start();
       // myThread02.start();
        System.out.println("End of MAIN Thread");

    }
}
