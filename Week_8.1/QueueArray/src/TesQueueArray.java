

public class TesQueueArray {
    public static void main(String[] args) {
        
        QueueArray q = new QueueArray(10);
        q.enqueue(290);
        q.enqueue(675);
        q.enqueue(345);
        q.enqueue(235);
        q.enqueue(234);
        q.enqueue(123);
        q.enqueue(354);
        q.enqueue(230);
      
        
        System.out.println("Queue kosong? "+q.isEmpty()+"\n");
        
        System.out.println("\nQueue penuh? "+q.isFull());

        System.out.println("Jumlah array adalah : " + q.size());
        
        q.enqueue(200);
        
        System.out.println("\nHapus --> "+q.dequeue());
        System.out.println("Hapus --> "+q.dequeue());
        System.out.println("Hapus --> "+q.dequeue());
    }
}

