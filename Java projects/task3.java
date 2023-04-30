import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите четырехзначное число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a/1000+a%1000/100 == a%10+a%100/10)    System.out.println("Число является счастливым билетом");
        else    System.out.println("Число не является счастливым билетом");
    }
}
