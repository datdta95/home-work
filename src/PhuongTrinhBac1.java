import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tGIẢI PHƯƠNG TRÌNH BẬC NHẤT  ax + b = 0");
        System.out.println("Nhập vào hệ số a: ");
        a = scanner.nextFloat();
        System.out.println("Nhập vào hệ số b: ");
        b = scanner.nextFloat();
        if (a == 0 && b == 0) {
            System.out.println("Phương trình có vô số nghiệm");
        }else {
            System.out.println("Phương trình có nghiệm là: x = "+ (0 - b) / a);
        }
    }
}
