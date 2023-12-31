package softwaredesign;

import java.util.ArrayList;
import java.util.Stack;

public class Calculator {
    private String[] Input;
    public ArrayList<String> rpn;

    public Calculator() {
        Plugin myObject = new Plugin();
        this.Input = myObject.getInput();
        this.rpn = convertToRPN(Input);
    }

    private ArrayList<String> convertToRPN(String[] expression) {
        ArrayList<String> result = new ArrayList<>();
        if (expression == null || expression.length == 0) {
            return result;
        }
        Stack<String> opStack = new Stack<>();
        for (String token : expression) {
            if (isNumber(token)) {
                result.add(token);
            } else if (token.equals("(")) {
                opStack.push(token);
            } else if (token.equals(")")) {
                while (!opStack.peek().equals("(")) {
                    result.add(opStack.pop());
                }
                opStack.pop();
            } else {
                while (!opStack.isEmpty() && getPriority(opStack.peek()) >= getPriority(token)) {
                    result.add(opStack.pop());
                }
                opStack.push(token);
            }
        }
        while (!opStack.isEmpty()) {
            result.add(opStack.pop());
        }
        return result;
    }

    private boolean isNumber(String token) {
        return Character.isDigit(token.charAt(0));
    }

    private int getPriority(String op) {
        if (op.equals("(")) {
            return 0;
        } else if (op.equals("+") || op.equals("-")) {
            return 1;
        } else {
            return 2;
        }
    }

    public double ans() {
        //to be added
        return 0;
    }

    public double undo() {
        ///to be added
        return 0;
    }

    public double redo() {
        //to be added
        return 0;
    }
}