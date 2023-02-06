package minitest.employee.veiw;

import minitest.employee.employ.Fulltime;
import minitest.employee.employ.Parttime;
import minitest.employee.manager.Manager;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public static void addTest() {
        Manager.list.add(new Parttime(1, "Vũ", 25, 123456, "coca270921@gmial.com", 40));
        Manager.list.add(new Parttime(2, "Nam", 24, 123457, "milo270921@gmial.com", 70));
        Manager.list.add(new Parttime(3, "Dũng", 23, 123458, "pepsi 270921@gmial.com", 57));
        Manager.list.add(new Fulltime(4, "Kiên", 20, 6889, "kien123@gmail.com", 500000, 100000, 7000000));
        Manager.list.add(new Fulltime(5, "Long", 21, 9789, "Long123@gmail.com", 300000, 50000, 4000000));
        Manager.list.add(new Fulltime(6, "Minh", 22, 6781, "Minh123@gmail.com", 800000, 200000, 6500000));
    }
    public static void main(String[] args) {
        Menu.addTest();
        int choice;
        do {
            System.out.println("Mời bạn nhập lựa chọn");
            System.out.println("1.Hiển thị tất cả sản phẩm ");
            System.out.println("2.Tính lương thực lĩnh của các nhân viên Full và Part time ");
            System.out.println("3.Tính trung bình lương của cả công ty");
            System.out.println("4.Danh sách nhân viên Fulltime lương thấp hơn mức trung bình");
            System.out.println("5.Số lương phải trả cho toàn bộ nhân viên bán thời gian");
            System.out.println("6.Sắp xếp nhân viên Full Time theo mức lương tăng dần");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Manager.display();
                    break;
                case 2:
                    Manager.realSalary();
                    break;
                case 3:
                    Manager.averageSalary();
                    break;
                case 4:
                    Manager.listEmploy();
                    break;
                case 5:
                    Manager.payPartTime();
                    break;
                case 6:
                    System.out.println("danh sách lương tăng dần là");
                    Manager.sortFullTime();

                    break;
            }
        }while (choice!=7);
    }
}
