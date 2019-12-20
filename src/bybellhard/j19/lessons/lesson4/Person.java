package bybellhard.j19.lessons.lesson4;

public class Person {

    String name;
    int age;
    Country country;
    Sex sex;


    public Person(String name, int age, Country country, Sex sex) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
    }


    /*
     *Person(String name, int age, Country country, Sex sex)
     *
     * Person Person = new Person();
     * person.name = name;
     * person.age = age;
     *
     *
     */


    void walk() {
        //    System.out.println(name + " is walking ");
        walk(10);
    }

    void walk(int minutes) {
        System.out.println(name + "is walking for " + minutes + "minutes");
    }


    void eat(String dish) {
        System.out.println(name + " is eating " + dish + " Om-non-nom! ");
    }

    int growOld() {
        return ++age; }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                ", sex=" + sex +
                '}';
    }
}
