public class Mahasiswa {
    String nama = null;
    String NIM = null;
    Double IPK = 0.0;

    public Mahasiswa(String NIM, String nama, Double ipk) {
        this.NIM = NIM;
        this.nama = nama;
        this.IPK = ipk;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNIM() {
        return this.NIM;
    }

    public Double getIPK() {
        return this.IPK;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setIPK(Double IPK) {
        this.IPK = IPK;
    }

}
