public class BubbleSort {
    
    public void sorting(int array[]) {
        int n = array.length;
        for (int pass = 1; pass < n; pass++) {
            boolean swapped = false;
            for (int i = 0; i < n - pass; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("Array iterasi ke-" + pass + " :");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            if (!swapped) break; 
        }
    }
    
    public static void main(String[] args) {
        int data[] = {35, 13, 26, 10, 39, 40};
        BubbleSort b = new BubbleSort();
        
        System.out.println("Array awal:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");
        
        b.sorting(data);
        
        System.out.println("\nArray setelah diurutkan:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}
