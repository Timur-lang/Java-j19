package bybellhard.j19.lessons.HomeWork;

public class House {

    String name;
    int age;
    Country country;


    public House(String name, int age, Country country) {

        this.age = age;
        this.name = name;
        this.country = country;
    }
        int growOld(){
            return ++age; }

}
