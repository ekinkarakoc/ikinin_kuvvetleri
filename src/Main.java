import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Sinir sayisi giriniz:");
        n = scanner.nextInt();


        for (int i = 1; i < n; i *= 2) {
            System.out.println(i);
        }


    }
}