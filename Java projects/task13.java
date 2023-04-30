import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int pr=1;
        while(a!=0) {
            if (a%2==0) pr*=a;
            a = scan.nextInt();
        }
        System.out.println("Произведение четнх чисел последовательности");
        System.out.println(pr);
    }
}
