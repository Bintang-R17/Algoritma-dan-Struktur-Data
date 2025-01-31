import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        BufferedReader br;
        Scanner sc = new Scanner(System.in);
        String logLine;
        List<LogFile> logs = new ArrayList<>();
        
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        System.out.print("Nama file: ");
        String fileName = sc.next();

        try {
            br = new BufferedReader(new FileReader(fileName));
            while((logLine = br.readLine()) != null){
                String[] logLineParts = logLine.split("\\s+");
                if (logLineParts.length >= 9) {  // Pastikan panjang array cukup untuk menghindari IndexOutOfBoundsException
                    LogFile newLog = new LogFile(logLineParts[0],
                                                logLineParts[5], 
                                                Integer.parseInt(logLineParts[6]),
                                                logLineParts[8]);
                    logs.add(newLog);
                }
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File tidak ditemukan. Pastikan nama file sudah benar dan berada di direktori yang sama dengan program.");
            ex.printStackTrace();
            return;
        } catch (IOException ex) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            ex.printStackTrace();
            return;
        }

        System.out.print("Query (bulan dan tanggal akhir): ");
        String month = sc.next();
        int endDate = sc.nextInt();

        System.out.println("File yang ditemukan:");
        for (LogFile log : logs) {
            if (log.getPermissions().charAt(0) == '-' && log.getPermissions().charAt(7) == 'r') {
                if (log.getMonth().equals(month) && log.getDate() <= endDate) {
                    System.out.println(log);
                }
            }
        }
    }
}
