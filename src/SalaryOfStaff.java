import java.util.Scanner;

public class SalaryOfStaff {
    public static void main(String[] args) {
        int yearOfWork;
        float indexOfSalary;
        float salary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tTÍNH LƯƠNG NHÂN VIÊN");
        System.out.println("Nhập vào số năm làm việc: ");
        yearOfWork = scanner.nextInt();
        System.out.println("Nhập vào hệ số lương: ");
        indexOfSalary = scanner.nextInt();
        if (indexOfSalary > 1 && indexOfSalary < 5) {
            salary = (indexOfSalary * 4000000) + (yearOfWork * 500000);
            System.out.println("Tiền lương là: " + salary);
        } else {
            System.out.println("Hệ số lương không hợp lệ. Mời nhập lại( 1 <= Hệ số <=5 ): ");
            indexOfSalary = scanner.nextInt();
            salary = indexOfSalary * 4000000 + yearOfWork * 500000;
            System.out.println("Tiền lương là: " + salary);
        }
    }
}
