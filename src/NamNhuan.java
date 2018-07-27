import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t KIỂM TRA NĂM NHUẬN");
        System.out.println("Nhập vào năm cần kiểm tra:");
        year = scanner.nextInt();
        boolean chiaHetCho4 = year % 4 == 0;
        boolean chiaHetCho100 = year % 100 == 0;
        boolean chiaHetCho400 = year % 400 == 0;
        if (chiaHetCho4) {
            if (chiaHetCho100) {
                if (chiaHetCho400) {
                    System.out.println("Năm nhuận");
                } else {
                    System.out.println("Không phải năm nhuận");
                }
            } else {
                System.out.println("Năm nhuận");
            }
        }
    }
}
