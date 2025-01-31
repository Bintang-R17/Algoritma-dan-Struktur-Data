public class App {

    public static void main(String[] args) {
        String kataKata = "Bintang Rizqi Anugrah 23523195";
        // Isilah kataKata dengan NIM dan nama lengkap Anda

        char hasil_charAt;
        int hasil_length;
        String hasil_subString_1;
        String hasil_subString_2;
        boolean hasil_contains;
        String hasil_join;

        hasil_charAt = kataKata.charAt(5);
        kataKata = "Bintang Rizqi Anugrah 23523195"; // Ubah posisi string agar sesuai dengan operasi yang diinginkan
        hasil_length = kataKata.length();
        hasil_subString_1 = kataKata.substring(5);
        hasil_subString_2 = kataKata.substring(5, 10);
        hasil_contains = kataKata.contains("tidak ada");
        hasil_join = String.join (kataKata, "dan", "tambahan");

        System.out.println("Yang ini " + hasil_subString_2 + hasil_contains + hasil_subString_1);
    }
}
