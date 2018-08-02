import java.util.Scanner;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        for (int i = 2; i < 100; i++) {
            boolean check = true;
            for (int count = 2; count <= Math.sqrt(i); count++) {
                if (i % count == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}
