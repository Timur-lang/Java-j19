package bybellhard.j19.lessons.HomeWork;

public class Human {
    private String name;
    private int age;


    public Human(String name, int age, String playing_) {
        this.name = name;
        this.age = age;
    }

    public void playing() {
        System.out.println(this.name + "play with nursling");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

