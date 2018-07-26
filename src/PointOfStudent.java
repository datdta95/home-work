import java.util.Scanner;

public class PointOfStudent {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tTÍNH ĐIỂM HỌC SINH");
        System.out.println("Nhập điểm môn Vật Lý: ");
        a=scanner.nextFloat();
        System.out.println("Nhập điểm môn Hóa Học: ");
        b= scanner.nextFloat();
        System.out.println("Nhập điểm môn Sinh Học: ");
        c=scanner.nextFloat();

        System.out.println("Điểm trung bình của sinh viên là: " + "\n" + (a+b+c)/3);
        System.out.println("Tổng điểm của sinh viên là: " + "\n" + (a+b+c));
    }

}
