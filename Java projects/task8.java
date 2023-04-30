import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int del = 0;
        int i = 2;
        for (i = 2; del == 0 && i < a; i++) {
            if (a % i == 0) {
                del++;
                System.out.println("Введенное число не является простым");
            }
        }
        if (i==a) System.out.println("Введенное число является простым");
    }
}
