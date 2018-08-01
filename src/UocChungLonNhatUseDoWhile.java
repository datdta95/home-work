import java.util.Scanner;

public class UocChungLonNhatUseDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số b:");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("Không có UCLN");
        } else if (a == 0 && b != 0) {
            System.out.println("UCLN là: " + b);
        } else if (a != 0 && b == 0) {
            System.out.println("UCLN là: " + a);
        } else {
            do {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }
            while (a != b);
            System.out.println("UCLN là : " + a);
        }

    }
}
