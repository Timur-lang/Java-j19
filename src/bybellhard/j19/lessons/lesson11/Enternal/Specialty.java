package bybellhard.j19.lessons.lesson11.Enternal;

public class Specialty {

    private int id;

    private String specialty;

    public Specialty(int id, String specialty) {
        this.id = id;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
