public class App {
    public static void main (String[] args) {
        Jumlah_J() ;
        Jumlah_M() ;
    }

    public static void Jumlah_J() {
    System.out.println("Jumlah J") ;
    int M = 10 ;
    int G = 5 ; 
    System.out.println("Jumlah maksimal gacha adalah"+ M);
    System.out.println("Jumlah gacha yang lalu"+ G);

    if (M > 5 || G >= 0)  {
        System.out.println("Maksimal gacha harus lebih dari 5");
        
    } else {
        int J = M - G ;
        System.out.println("Jadi jumlah gacha yang diperlukan adalah"+J);
    }
}    
}
     
    

