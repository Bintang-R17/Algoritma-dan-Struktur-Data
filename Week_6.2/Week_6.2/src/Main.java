public class Main {
    public static void main(String[] args) {
        LinkedList<Mahasiswa> mhs = new LinkedList<>();

        mhs.add(new Mahasiswa("16523001", "Idris", 3.88));
        mhs.add(new Mahasiswa("16523002", "Agus", 3.18));
        mhs.add(new Mahasiswa("16523003", "Dani", 3.42));
        mhs.add(new Mahasiswa("16523008", "Roni", 3.67));
        mhs.add(new Mahasiswa("16523020", "Sinta", 3.05));

        LinkedList.Element counter = mhs.first;
        int count = 0;

        while (counter != null && count < 3) {
            counter = counter.next;
            count++;
        }

        if (counter != null) {
            Mahasiswa m = (Mahasiswa) counter.data;
            m.setIPK(3.8);
            System.out.println("NIM" + m.getNIM());
            System.out.println("Nama" + m.getNama());
            System.out.println("IPK" + m.getIPK());
        }

        

    }
}
