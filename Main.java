import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("名前を入力してください");
        String name = scanner.nextLine();

        System.out.println("日付");
        String date = scanner.nextLine();

        System.out.println("予定の時間");
        String shift = scanner.nextLine();

        System.out.println("スケジュール");
        System.out.println(name + date + shift);
    }
}