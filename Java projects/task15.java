import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение");
        String v = scan.nextLine();
        int i=0;
        for (int step=0; step<v.length();step++){
            if (v.charAt(step)==')') {
                i--;
                if (i<0) {
                    break;
                }
            }
            if (v.charAt(step)=='(') i++;
        }
        if (i==0) System.out.println("Скобки расставленны правильно");
        else System.out.println("Скобки расставленны неправильно");
    }
}
