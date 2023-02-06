package minitest.employee.manager;

import minitest.employee.employ.Employee;
import minitest.employee.employ.Fulltime;
import minitest.employee.employ.Parttime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager {
    public static int salary;
    public static ArrayList<Employee> list = new ArrayList<>();

    public static void display() {
        for (Employee p : list) {
            System.out.println(p);
        }
    }
    public static void realSalary() {
        int money1;
        int money2;
        for (Employee p : list) {
            if (p instanceof Parttime) {
                money1 = ((Parttime) p).getTimework() * 100000;
                System.out.println("Lương của " + p.getName() + " là " + money1);
            } else if (p instanceof Fulltime) {
                money2 = ((Fulltime) p).getSalary() + ((Fulltime) p).getBonus() - ((Fulltime) p).getFine();
                System.out.println("Lương của" + p.getName() + "Là" + money2);
            }
        }
    }

    public static void averageSalary() {
        int index = 0;
        int money1 = 0;
        int money2 = 0;
        for (int i = 0; i < list.size(); i++) {
            index++;
        }
        for (Employee p : list) {
            if (p instanceof Parttime) {
                money1 += ((Parttime) p).getTimework() * 100000;
            } else if (p instanceof Fulltime) {
                money2 += ((Fulltime) p).getSalary();
            }
        }
        salary = (money1 + money2) / index;
        System.out.println("Lương trung bình của nhân viên là" + salary);
    }

    public static void listEmploy() {
        for (Employee p : list) {
            if (p instanceof Fulltime) {
                if (((Fulltime) p).getSalary() < salary) {
                    System.out.println(p);
                }
            }
        }
    }
    public static void payPartTime() {
        int money = 0;
        for (Employee p : list) {
            if (p instanceof Parttime) {
                money += ((Parttime) p).getTimework() * 100000;
                System.out.println("số lương phải trả cho nhân viên "+p.getName() +"là"+ money);
            }
        }
    }
    public static ArrayList<Employee> sortFullTime() {
        ArrayList<Employee>list1=new ArrayList<>();
        for (Employee p:list) {
            if(p instanceof Fulltime){
                list1.add(p);
            }
        }
        Collections.sort(list1, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                Fulltime f1= (Fulltime) o1;
                Fulltime f2= (Fulltime) o2;
                return f1.getSalary() > f2.getSalary() ? 1 : -1;
            }
        });

        for (Employee p:list1) {
            System.out.println(p);
        }
        return list1;
    }
}

