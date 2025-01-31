import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Tree<String> Perusahaan = new Tree<String>("Jim");


        Perusahaan.addChild("Jim", "Ali");
        Node<String> Supervisor1 = new Node<String>("Roy");
        Node<String> Supervisor2 = new Node<String>("Ica");
        Node<String> Supervisor3 = new Node<String>("Mal");
        Node<String> Supervisor4 = new Node<String>("Boy");
        Node<String> Pegawai1 = new Node<String>("Adi");
        Node<String> Pegawai2 = new Node<String>("Ana");
        Node<String> Pegawai3 = new Node<String>("Gal");
        Node<String> Pegawai4 = new Node<String>("Abu");
        Node<String> Pegawai5 = new Node<String>("Kim");
        Node<String> Pegawai6 = new Node<String>("Ali");

        Perusahaan.addChild("Jim", Supervisor3);
        Perusahaan.addChild("Jim", Supervisor1);

        Perusahaan.addChild("Roy", Pegawai1);
        Perusahaan.addChild("Roy", Supervisor2);

        Node<String> AnaNode = new Node<String>("Ana");
        Node<String> GalNode = new Node<String>("Gal");
        Perusahaan.addChild("Ica", AnaNode);
        Perusahaan.addChild("Ica", GalNode);

        Perusahaan.addChild("Mal", "Boy");
        Node<String> AbuNode = new Node<String>("Abu");
        Node<String> KimNode = new Node<String>("Kim"); 
        Perusahaan.addChild("Boy", AbuNode);
        Perusahaan.addChild("Boy", KimNode);

        Perusahaan.draw();
        System.out.println("Cari bawahan : ");
        System.out.println();
        String Nama = scan.nextLine();
        Perusahaan.CariBawahan(Nama, Perusahaan);
        scan.close();
        
    }
}
