import java.util.Scanner;

import javafx.css.Match;

public class App {
    public static void main(String[] args) {
     
        String Match[]=new String[5]; //deklarasi & instansiasi
        Match[1]= " Atletico Madrid VS Borrusia Dortmund" ;//inisialisasi
        Match[2]= " Arsenal VS Bayer Munich";
        Match[3]= " Manchester City VS Real Madrid";
        Match[4]= " PSG VS Barcelona";
        
        Scanner scanner =new Scanner (System.in) ;
        System.out.println("Pertandingan UCL ke berapa?(1, 2, 3, 4)");
        int Nilai = scanner.nextInt() ;
        System.out.println("Pertandingan tersebut adalah" + Match[Nilai]); 
    
       
    }
    
}
