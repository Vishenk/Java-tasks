import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int chislo = 2;
        int i = 0;
        for (chislo = 2; i < a; chislo++) {
            int koldel = 0;
            for (int k = 1; k <= chislo; k++) {
                if (chislo % k == 0) koldel++;
            }
            if (koldel == 2) {
                System.out.print(chislo);
                System.out.print(" ");
                i++;
            }
        }
    }
}
