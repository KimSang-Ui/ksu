import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        for (int i = 1; i <= 9; i++)
            if (i % 2 != 0) {
                System.out.println(dan + "*" + i + "=" + dan * i);
            }
    }
}




