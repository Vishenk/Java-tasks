import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0;
        for (int k = 1; k < a; k++) {
            if (a % k == 0) sum+=k;
        }
        if (sum==a)  System.out.print("Число является совершенным");
        else System.out.println("Число не является совершенным");
    }
}
