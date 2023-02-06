package minitest.employee.employ;

import minitest.employee.employ.Employee;

public class Parttime extends Employee {
    public int timework;

    public Parttime(int id, String name, int age, int phone, String email, int timework) {
        super(id, name, age, phone, email);
        this.timework = timework;
    }

    public Parttime(int timework) {
        this.timework = timework;
    }

    public int getTimework() {
        return timework;
    }

    public void setTimework(int timework) {
        this.timework = timework;
    }

    @Override
    public String toString() {
        return "Parttime{" +
                "timework=" + timework +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
