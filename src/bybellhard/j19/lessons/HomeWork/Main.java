package bybellhard.j19.lessons.HomeWork;

public class Main {
    public static void main(String[] args) {

        Country Belarus = new Country();
        Belarus.title = "Belarus";
        Belarus.zipCode = 666;

        House Davidova45A = new House("Davidova45A", 5, Belarus);


        Davidova45A.country = Belarus;
        Davidova45A.name = "Davidova45A";
        Davidova45A.age = 5;


    }
}
