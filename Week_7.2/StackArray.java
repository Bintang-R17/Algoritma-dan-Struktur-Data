// Riva Aiyatsa - 23523162 //

public class StackArray {

    public boolean isOperator(String ch){
        String operators = "^*/+-";
            if (operators.contains(ch)) {
                return true;
            } else {
                return false;
        }
    }

    public double operation(double a, double b, String op){   
        if ("+".equals(op)) {
            return a+b;
        } else if ("-".equals(op)) {
            return a-b;
        } else if ("*".equals(op)) {
            return a*b;
        } else if ("^".equals(op)) {
            return Math.pow(a, b);
        } else {
            return a/b;
        }
    }

    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
}
