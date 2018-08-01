import java.util.Scanner;

public class SoNguyenToUseDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số:");
        int soNguyenTo = scanner.nextInt();
        if (soNguyenTo < 2) {
            System.out.println(soNguyenTo + " KHÔNG là số nguyên tố");
        } else {
            int count = 2;
            boolean check = true;
            do {
                if (soNguyenTo % count == 0) {
                    check = false;
                    break;
                }
                count++;
            } while (count <= Math.sqrt(soNguyenTo));
            if (check) {
                System.out.println(soNguyenTo + " LÀ số nguyên tố");
            }else System.out.println(soNguyenTo+" KHÔNG LÀ số nguyên tố");
        }
    }
}
