import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        final float PI = 3.14f;
        float r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tTÍNH DIỆN TÍCH VÀ CHU VI HÌNH TRÒN");
        System.out.println("Nhâp bán kính: ");
        r = scanner.nextFloat();
        System.out.println("Diện tích của hình tròn là: " + "\n" + r * r * PI);
        System.out.println("Chu vi của hình tròn là: " + "\n" + 2 * r * PI);



    }
}
