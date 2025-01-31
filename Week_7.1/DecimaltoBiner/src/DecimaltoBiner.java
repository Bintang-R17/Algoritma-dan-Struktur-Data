import java.util.Scanner;
public class DecimaltoBiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan dalam desimal: ");
        int decimal = scanner.nextInt();
        System.out.println("Hasil konversi bilangan desimal " + decimal + " ke biner adalah: " + decimalToBinary(decimal));
        scanner.close();
    }

    public static String decimalToBinary(int decimal) {
        StackArray stack = new StackArray(); // Tidak ada ukuran maksimum yang ditentukan
        for (int i = decimal; i != 0; i /= 2) {
            int remainder = i % 2;
            stack.push(remainder);
        }
        if (stack.isEmpty()) {
            return "0"; // Handle kasus ketika bilangan desimal adalah 0
        }
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    } 
}
