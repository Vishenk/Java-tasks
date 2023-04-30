import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите коэффициенты уравнения");
        Scanner scan = new Scanner(System.in);
        int a  = scan.nextInt();
        int b  = scan.nextInt();
        int c  = scan.nextInt();
        if (b*b-4*a*c>0) {
            System.out.println("Решения уравнения: ");
            System.out.println( (-b+Math.sqrt(b*b-4*a*c))/2);
            System.out.println( (-b-Math.sqrt(b*b-4*a*c))/2);
        }
        else if (b*b-4*a*c==0) {
            System.out.println("Решение уравнения: ");
            System.out.println(-b/(2*a));
        }
        else {
            System.out.println("Уравнение не имеет действительных решений");
        }
    }
}
