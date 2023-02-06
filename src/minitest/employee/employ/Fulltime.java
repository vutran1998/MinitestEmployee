package minitest.employee.employ;

public class Fulltime extends Employee {
    public int bonus;
    public int fine;
    public int salary;

    public Fulltime(int id, String name, int age, int phone, String email, int bonus, int fine, int salary) {
        super(id, name, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public Fulltime(int bonus, int fine, int salary) {
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Fulltime{" +
                "bonus=" + bonus +
                ", fine=" + fine +
                ", salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
