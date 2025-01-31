public class Selectionsort {

    public static void selectionSort (int[] arr){

        for (int i=0; i <arr.length-1; i++)
     {
         int index = i;
         for (int j=i+1; j<arr.length;j++){
             if(arr[j]<arr[index]){
                 index = j;
             }
         }
         int smallerNumber = arr[index];
         arr[index] = arr[i];
         arr[i] = smallerNumber;
     }
     
 }
 
 public static void main (String a[]){
     int[]arr1 = {2,3,5,2,3,1,9,5,7};
     System.out.println("Sebelum pengurutan seleksi");
     for(int i:arr1){
         System.out.print(i+"");
     }
     System.out.println();
     
     selectionSort (arr1); 
     //pengurutan array menggunakan pengurutan seleksi
     
     System.out.println("Setelah pengurutan seleksi");
     for(int i:arr1){
         System.out.print(i+"");
    
     
     }
 }
}