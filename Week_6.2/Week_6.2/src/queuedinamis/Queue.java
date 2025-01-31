
package queuedinamis; // ingat kembali materi FPA tentang package!

/**
 *
 * @param <E>
 */
@SuppressWarnings("rawtypes")
public class Queue<E> extends LinkedList {
       
    public Queue(){
        
    }
    
    public Object peek(){
        return getFirst();
    }
}

