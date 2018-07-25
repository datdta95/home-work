import java.util.Scanner;

public class OperatorHomeWork {
    public static void main(String[] args) {
        float chieudai;
        float chieurong;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tTÍNH DIỆN TÍCH HÌNH CHỮ NHẬT");
        System.out.println("Nhập vào chiều dài:");
        chieudai = scanner.nextFloat();
        System.out.println("Nhập vào chiều rộng:");
        chieurong=scanner.nextFloat();
        System.out.println("Diện tích hình chữ nhật là: "+chieudai*chieurong);
    }
}
