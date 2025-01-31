// Riva Aiyatsa - 23523162 //

import java.util.Scanner;
import java.util.Stack;

public class NotasiPostfix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan notasi postfix: ");
        String postfix = scanner.nextLine();

        StackArray stackArray = new StackArray();
        Stack<Double> stack = new Stack<>();

        for (String token : postfix.split("")) {
            if (stackArray.isOperator(token)) {
                if (stack.size() < 2) {
                    System.out.println("Postfix invalid!");
                return;
                }
                double b = stack.pop();
                double a = stack.pop();
                double result = stackArray.operation(a, b, token);
                stack.push(result);
            } else {
                stack.push(Double.parseDouble(token));
            }
        }

        if (stack.size()!= 1) {
            System.out.println("Postfix invalid!");
        } else {
            System.out.println("Hasil akhir: " + stack.pop());
        }
    }
}