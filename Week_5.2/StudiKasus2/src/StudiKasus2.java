import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Nickname untuk sign in :");
        String Nickname = scanner.nextLine();
        System.out.println("Masukkan Password untuk sign in");
        String Password = scanner.nextLine();

        System.out.println("Masukkan nickname untuk login");
        String nickname = scanner.nextLine();
        System.out.println("Masukkan password untuk login");
        String password = scanner.nextLine();

        if (Nickname.equals(nickname)) {
            System.out.println("Nickname benar");
        } else {
            System.out.println("Nickname salah");
        }

        if (Password.equals(password)) {
            System.out.println("Password benar");
        } else {
            System.out.println("Password salah");
        }
    }
}
