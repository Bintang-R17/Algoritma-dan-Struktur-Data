public class App {

    public static void main(String[] args) {
        // Membuat larik bilangan bulat dengan panjang 5
        int[] banyak_uang = {0, 1, 1, 0, 1, 0, 0, 0, 0, 0};
        int[] uangPecahan = {500, 20000, 5000, 10000, 1000, 0, 0, 0, 0, 0};

        // Menyiapkan string untuk menampung hasil
        StringBuilder hasil = new StringBuilder("Uang kembalian terdiri dari: ");

        // Membuat hasil lembar uang dengan pecahan yang dimiliki
        for (int i = 0; i < banyak_uang.length; i++) {
            if (banyak_uang[i] > 0) {
                hasil.append("\n" + banyak_uang[i]+ " lembar " + uangPecahan[i] );
            }
        }

  

        // Menampilkan hasil sekali saja
        System.out.println(hasil.toString());
    }
}
