package bybellhard.j19.lessons.lesson11.Enternal;

public class Employee {

    private int id;

    private String name;

    private Date startDate;

    private int salary;

    private Specialty specialty;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, Date startDate, int salary) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.salary = salary;




    }
}
