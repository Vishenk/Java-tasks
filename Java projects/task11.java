import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int fact=1;
        for (int k = 1; k <= a; k++) fact*=k;
        System.out.println(fact);
    }
}
