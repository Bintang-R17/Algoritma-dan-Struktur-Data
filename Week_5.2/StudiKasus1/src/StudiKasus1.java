import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("Masukkan banyaknya angka yang akan di-scan:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan angka ke-" + (i+1) + ":");
            int num = scanner.nextInt();

            if (num % 5 == 0) {
                count++;
            }
        }
        System.out.println("Jumlah angka yang dapat dibagi oleh 5 adalah: " + count);
    }
}
