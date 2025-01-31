
package queuedinamis;

public class TestQueueDinamis {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Queue<String> mhs = new Queue<>();
        
        mhs.add("Agus");
        mhs.add("Sinta");
        mhs.add("Bambang");
        
        System.out.println("Elemen pertama: "+mhs.peek());
        
        mhs.remove();
        System.out.println("Elemen pertama: "+mhs.peek());
        
        mhs.clear();
        System.out.println("Elemen pertama: "+mhs.peek());
    }
}

