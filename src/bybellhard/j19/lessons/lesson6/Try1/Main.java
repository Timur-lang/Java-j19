package bybellhard.j19.lessons.lesson6.Try1;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Worker("Vasyan", 18, "pick-axe");
        employee.doWork();
        System.out.println(employee.toString());
        //      worker.smoke();

        doWork(new Janitor("jn1", 10));


    }
}

