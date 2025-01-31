public class StackArray {
    public Object[] stackArr;
    protected int elementCount;

    // Constructor untuk inisialisasi stack kosong
    public StackArray() {
        this.stackArr = new Object[10]; // Misalnya, kita mulai dengan kapasitas awal 10
        this.elementCount = 0;
    }
    
    // Method push(): menambahkan elemen ke stack
    public void addCapacity(){
        int newCapacity = this.stackArr.length*2;

        Object [] newArray = new Object[newCapacity];

        for(int i = 0; i<this.elementCount;i++){
            newArray[i] = this.stackArr[i];
        }
        this.stackArr = newArray;
    }
    public void push(Object value) {
        if (this.elementCount == this.stackArr.length) {
            this.addCapacity();
        }
        this.stackArr[this.elementCount++]= value ;
    }

    // Method pop(): menghapus dan mengembalikan elemen teratas dari stack
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack kosong. Pop gagal.");
        }
        Object value = stackArr[--elementCount];
        stackArr[elementCount] = null; // Hapus referensi ke elemen yang dihapus
        return value;
    }

    // Method peek(): mengembalikan elemen teratas dari stack tanpa menghapusnya
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack kosong. Tidak ada elemen yang dilihat.");
        }
        return stackArr[elementCount - 1];
    }

    // Method isEmpty(): memeriksa apakah stack kosong
    public boolean isEmpty() {
        return (elementCount == 0);
    }
}
