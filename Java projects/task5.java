import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i=1; i<=a; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
