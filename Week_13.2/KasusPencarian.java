package kasuspencarian;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class KasusPencarian {

    public static void main(String[] args) throws ParseException {
        BufferedReader br;
        String line;
        List<barangToko> listBarang = new ArrayList<>();
        Scanner bacaNamaF = new Scanner(System.in);
        System.out.print("Masukkan nama file barang (csv) = ");
        String namaF = bacaNamaF.next();

        try {
            br = new BufferedReader(new FileReader(namaF));
            while ((line = br.readLine()) != null) {

                String[] barangArray = line.split(";");

                barangToko barang = new barangToko();

                barang.setId(Integer.parseInt(barangArray[0]));
                barang.setNamaPelanggan(barangArray[1]);
                barang.setIdProduk(barangArray[2]);
                barang.setNamaProduk(barangArray[3]);
                barang.setBanyak(Integer.parseInt(barangArray[4]));

                listBarang.add(barang);
            }


            Collections.sort(listBarang, Comparator.comparingInt(barangToko::getId));

            br.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Scanner bacaInput = new Scanner(System.in);
        Scanner bacaLagi = new Scanner(System.in);

        boolean lagi = true;
        while (lagi) {
            System.out.print("Masukkan id pelanggan yang dicari: ");
            int X = bacaInput.nextInt();
            System.out.println("===================================");

            // Pencarian biner
            int posisi = binarySearch(listBarang, X);

            // Menampilkan data jika ditemukan
            if (posisi != -1) {
                barangToko barang = listBarang.get(posisi);
                System.out.println("Data pembelian dengan id = " + X);
                System.out.println("Nama Pembeli: " + barang.getNamaPelanggan());
                System.out.println("Id produk: " + barang.getIdProduk());
                System.out.println("Nama produk: " + barang.getNamaProduk());
                System.out.println("Banyak pembelian: " + barang.getBanyak());
            } else {
                System.out.println("Maaf, pembelian dengan id = " + X + " tidak ditemukan");
            }

            System.out.println();
            System.out.print("Mau mencari lagi(y/t)? ");
            String pilihanLagi = bacaLagi.next();

            System.out.println();
            System.out.println("===================================");

            if (pilihanLagi.compareTo("t") == 0) {
                lagi = false;
            }
        }
    }

    
    private static int binarySearch(List<barangToko> list, int targetId) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midId = list.get(mid).getId();

            if (midId == targetId) {
                return mid; 
            } else if (midId < targetId) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return -1; 
    }
}
