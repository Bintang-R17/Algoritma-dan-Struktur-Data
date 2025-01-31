import java.util.*;

public class ManajemenPelanggan {

    private ArrayList<Pelanggan> customersArrayList;
    private LinkedList<Pelanggan> customersLinkedList;
    private Queue<Pelanggan> customersQueue;
    private Scanner scanner;

    public ManajemenPelanggan() {
        customersArrayList = new ArrayList<>();
        customersLinkedList = new LinkedList<>();
        customersQueue = new LinkedList<>();
        scanner = new Scanner(System.in);
    }

    public void addCustomerToArrayList(Pelanggan customer) {
        customersArrayList.add(customer);
    }

    public void addCustomerToLinkedList(Pelanggan customer) {
        customersLinkedList.add(customer);
    }

    public void addCustomerToQueue(Pelanggan customer) {
        customersQueue.add(customer);
    }

    public void displayArraylistPelanggan() {
        System.out.println("Daftar Pelanggan (ArrayList):");
        for (Pelanggan customer : customersArrayList) {
            System.out.println(customer);
        }
        System.out.println();
    }

    public void displayLinkedlistPelanggan() {
        System.out.println("Daftar Pelanggan (LinkedList):");
        for (Pelanggan customer : customersLinkedList) {
            System.out.println(customer);
        }
        System.out.println();
    }

    public void displayAntreanPelanggan() {
        System.out.println("Daftar Pelanggan (Queue):");
        for (Pelanggan customer : customersQueue) {
            System.out.println(customer);
        }
        System.out.println();
    }

    public void urutkanNamaPelanggan() {
        int n = customersArrayList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (customersArrayList.get(j).getName().compareTo(customersArrayList.get(j + 1).getName()) > 0) {
                    Pelanggan temp = customersArrayList.get(j);
                    customersArrayList.set(j, customersArrayList.get(j + 1));
                    customersArrayList.set(j + 1, temp);
                }
            }
        }
    }

    public void hapusPelanggan() {
        if (customersArrayList.isEmpty() && customersLinkedList.isEmpty() && customersQueue.isEmpty()) {
            System.out.println("Tidak ada pelanggan dalam antrean.");
            return;
        }

        System.out.println("Pilih jenis antrean untuk menghapus pelanggan:");
        System.out.println("1. ArrayList");
        System.out.println("2. LinkedList");
        System.out.println("3. Queue");
        System.out.print("Pilihan Anda: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if (!customersArrayList.isEmpty()) {
                    Pelanggan removedCustomer = customersArrayList.remove(0);
                    System.out.println("Pelanggan " + removedCustomer.getName() + " dihapus dari ArrayList.");
                } else {
                    System.out.println("ArrayList kosong.");
                }
                break;
            case 2:
                if (!customersLinkedList.isEmpty()) {
                    Pelanggan removedCustomer = customersLinkedList.remove();
                    System.out.println("Pelanggan " + removedCustomer.getName() + " dihapus dari LinkedList.");
                } else {
                    System.out.println("LinkedList kosong.");
                }
                break;
            case 3:
                if (!customersQueue.isEmpty()) {
                    Pelanggan removedCustomer = customersQueue.poll();
                    System.out.println("Pelanggan " + removedCustomer.getName() + " dilayani dan dihapus dari Queue.");
                } else {
                    System.out.println("Queue kosong.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public void runApplication() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambahkan Pelanggan ke ArrayList");
            System.out.println("2. Tambahkan Pelanggan ke LinkedList");
            System.out.println("3. Tambahkan Pelanggan ke Queue");
            System.out.println("4. Tampilkan Daftar Pelanggan (ArrayList)");
            System.out.println("5. Tampilkan Daftar Pelanggan (LinkedList)");
            System.out.println("6. Tampilkan Daftar Pelanggan (Queue)");
            System.out.println("7. Urutkan Pelanggan berdasarkan Nama (Bubble Sort)");
            System.out.println("8. Layani Pelanggan");
            System.out.println("9. Keluar");

            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String name = scanner.next();
                    System.out.print("Masukkan ID pelanggan: ");
                    int id = scanner.nextInt();
                    Pelanggan customer1 = new Pelanggan(name, id);
                    addCustomerToArrayList(customer1);
                    break;
                case 2:
                    System.out.print("Masukkan nama pelanggan: ");
                    String name2 = scanner.next();
                    System.out.print("Masukkan ID pelanggan: ");
                    int id2 = scanner.nextInt();
                    Pelanggan customer2 = new Pelanggan(name2, id2);
                    addCustomerToLinkedList(customer2);
                    break;
                case 3:
                    System.out.print("Masukkan nama pelanggan: ");
                    String name3 = scanner.next();
                    System.out.print("Masukkan ID pelanggan: ");
                    int id3 = scanner.nextInt();
                    Pelanggan customer3 = new Pelanggan(name3, id3);
                    addCustomerToQueue(customer3);
                    break;
                case 4:
                    displayArraylistPelanggan();
                    break;
                case 5:
                    displayLinkedlistPelanggan();
                    break;
                case 6:
                    displayAntreanPelanggan();
                    break;
                case 7:
                    urutkanNamaPelanggan();
                    System.out.println("Daftar Pelanggan (ArrayList) setelah diurutkan berdasarkan nama:");
                    displayArraylistPelanggan();
                    break;
                case 8:
                    hapusPelanggan();
                    break;
                case 9:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void main(String[] args) {
        ManajemenPelanggan customerManagement = new ManajemenPelanggan();
        customerManagement.runApplication();
    }
}

