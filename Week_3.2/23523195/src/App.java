import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Jumlah_J1();
        Jumlah_J2();
        
    }

    public static void Jumlah_J1() {
        System.out.println("Penghitungan untuk mendapatkan barang gacha");
        int M = 10;
        int G = 5;
        System.out.println("Jumlah maksimal gacha ini adalah " + M);
        System.out.println("Jumlah gacha yang pernah kamu lakukan adalah " + G);

        if (M <= 5 || G < 0) {
            System.out.println("Maksimal gacha harus lebih dari 5 dan jumlah gacha yang lalu harus positif.");
        } else {
            int J = M - G;
            System.out.println("Jadi jumlah gacha yang diperlukan adalah " + J);
        }

    }
   public static void Jumlah_J2() {
        Scanner scanner = new Scanner(System.in)

        System.out.println("penghitungan untuk mendapatkan barang gacha yang kedua");
        System.out.println("input maksimal gacha");
        int M = scanner.nextInt();
        scanner.nextInt()
        System.out.println("input gacha lalu");
        int G = scanner.nextInt();
        scanner.nextInt();
        if (M >= 5 || G > 0 ) {
            inputsalah();
        } else {
            int J = M - G;
            System.out.println("Jumlah gacha yang diperlukan"+ J);
            
        }

    }
    public static void inputsalah() {
        System.out.println("Jumlah gacha tidak diizinkan");
        return;
    }
}
