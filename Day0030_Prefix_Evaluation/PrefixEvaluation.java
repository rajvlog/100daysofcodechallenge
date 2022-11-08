/* Evaluation of prefix Expression 
Prefix notation is a notation for writing arithmetic expressions
 in which the operands appear after their operators.*/

import java.util.Stack;

public class PrefixEvaluation {

    public static Double evaluate(double a, double b, char operator){
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                if (a == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return b / a;
        }
        return 0.0;
    }
    public static Double convert(String expression) {

        Stack<Double> stack = new Stack<>();

        StringBuilder input = new StringBuilder(expression);
        input.reverse();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '*' || c == '/' || c == '^' || c == '+' || c == '-') {
                double s1 = stack.pop();
                double s2 = stack.pop();
                double temp = evaluate(s2, s1, c);
                stack.push(temp);
            } else {
                stack.push((double) (c-'0'));
            }
        }

        double result = stack.pop();
        return result;
    }

    public static void main(String[] args) {
        String exp = "-/*2*5+3652";
        System.out.println("Prefix Expression: " + exp);
        System.out.println("Evaluation: " + convert(exp));
    }
}
