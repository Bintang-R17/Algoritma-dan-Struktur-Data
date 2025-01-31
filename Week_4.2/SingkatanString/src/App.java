import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        String[] kataKata = kalimat.split(" ");
        StringBuilder singkatan = new StringBuilder();

        for (String kata : kataKata) {
            if (!kata.isEmpty()) {
                singkatan.append(kata.charAt(0));
            }
        }

        System.out.println("Singkatan: " + singkatan);
    }
}
