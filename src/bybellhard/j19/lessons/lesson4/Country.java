package bybellhard.j19.lessons.lesson4;

public class Country {
    String title;
    int zipCode = 123456;

    @Override
    public String toString() {
        return "Country{" +
                "title='" + title + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
