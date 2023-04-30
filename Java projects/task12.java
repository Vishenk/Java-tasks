import java.util.Scanner;


public class task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 числа с однинаковым количеством цифр");
        String ch1 = scan.nextLine();
        String ch2 = scan.nextLine();
        int i=0;
        char rez[] = new char[ch1.length()*2];
        for (int step=0; step<ch1.length();step++){
            rez[i]= ch1.charAt(step);
            i++;
            rez[i]= ch2.charAt(step);
            i++;
        }
        System.out.println("Получившееся число:");
        System.out.println(rez);
    }
}
