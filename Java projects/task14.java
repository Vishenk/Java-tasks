import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int f[];
        f = new int[a+2];
        f[0]=1;
        f[1]=1;
        int sum=1;
        for (int k = 2; k <= a; k++) f[k]=f[k-2]+f[k-1];
        System.out.println(f[a]);
    }
}
