package bybellhard.j19.lessons.lesson4;

public class Main {
    public static void main(String[] args) {

        Country brazil = new Country();
        brazil.title = "Brazil";
        brazil.zipCode = 123456;

        Person Alfredo = new Person("Alfredo",21,brazil,Sex.MALE);

        Alfredo.name = "Alfredo";
        Alfredo.age = 21;
        Alfredo.country = brazil;
        Alfredo.sex = Sex.MALE;

        Person Tereza = new Person("Tereza",25,brazil,Sex.FEMALE);
        Tereza.name = "Tereza";
        Tereza.age = 25;
        Tereza.country = brazil;
        Tereza.sex = Sex.FEMALE;

        Alfredo.walk();
        Alfredo.eat("fish");
        Alfredo.growOld();
        System.out.println(Alfredo.age);


        int newAge = Alfredo.growOld();
        System.out.println(newAge);
        System.out.println(Alfredo.growOld());

        System.out.println(Alfredo.toString());
        System.out.println(Tereza);



    }
}
