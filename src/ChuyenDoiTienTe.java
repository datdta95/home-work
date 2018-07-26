import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        final float USD = 23000f;
        float VND;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tCHUYỂN ĐỔI TIỀN TỆ");
        System.out.println("Số tiền VND: ");
        VND = scanner.nextFloat();
        System.out.println(" Số tiền sau khi chuyển là: " + (VND / USD) + " USD");


    }
}
