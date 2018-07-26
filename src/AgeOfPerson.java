import java.util.Scanner;

public class AgeOfPerson {
    public static void main(String[] args) {
        System.out.println("TÍNH TUỔI");
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm sinh của bạn: ");
        age = scanner.nextInt();
        System.out.println("Số tuổi của bạn hiện nay là: " + (2018 - age) + " tuổi");

    }
}
