package Stack;
import java.util.Stack;
public class P40_PostfixExpression {

    public static int evaluatePostfix(String[] arr) {
        Stack<Integer> st = new Stack<>();
        
        for (String token : arr) {
            // If token starts with a digit, it's a number
            if (Character.isDigit(token.charAt(0))) {
                st.push(Integer.parseInt(token));
            } else {
                int b = st.pop();
                int a = st.pop();
                st.push(calculate(a, b, token.charAt(0)));
            }
        }
        return st.pop();
    }

    private static int calculate(int a, int b, char op) {
        if (op == '+') {
            return a + b;
        } 
        else if (op == '-') {
            return a - b;
        } 
        else if (op == '*') {
            return a * b;
        } 
        else if (op == '/') {
            return a / b;  // integer division
        } 
        else if (op == '^') {
            return (int) Math.pow(a, b);
        } 
        else {
            throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
    public static void main(String[] args) {
        
    }
}




