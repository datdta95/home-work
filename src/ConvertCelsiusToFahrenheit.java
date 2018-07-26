import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        float c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tĐỔI NHIỆT ĐỘ");
        System.out.println("Nhập vào độ C:");
        c= scanner.nextFloat();
        System.out.println("Độ F = " + ((c/5)*9+32));
    }
}
