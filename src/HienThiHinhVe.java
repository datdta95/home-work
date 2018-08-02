import java.util.Scanner;

public class HienThiHinhVe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tHIỂN THỊ HÌNH VẼ");
        System.out.println("Menu");
        System.out.println("1. Vẽ hình chữ nhật");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");

        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Hình chữ nhật");
                    System.out.println("Nhập vào chiều dài: ");
                    int width = scanner.nextInt();
                    System.out.println("Nhập vào chiều rộng: ");
                    int height = scanner.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Tam giác vuông");
                    System.out.println("Nhập vào cạnh góc vuông thứ nhất");
                    width = scanner.nextInt();
                    System.out.println("Nhập vào cạnh góc vuông thứ hai");
                    height = scanner.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("NO CHOICE!");
            }
        }
    }
}
