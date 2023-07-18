package sd;

import java.util.ArrayList;
import java.util.Stack;

public class SecondaryOperations extends Calculator {
    public String[] Input;
    public ArrayList<String> rpn;
    private int undoRedo = 0;

    public void setValues(String[] in) {
        this.Input = in;
        this.rpn = convertToRPN(this.Input);
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
        return Double.parseDouble(ansStack.peek());
    }

    public double undo() {
        if(!((undoRedo + ansStackPointer) < 1)){
            --undoRedo;
        }
        else return 0;
        return Double.parseDouble(ansStack.get(ansStackPointer + undoRedo));
    }

    public double redo() {
        if (!((undoRedo + ansStackPointer) > ansStack.size() - 2)) {
                ++undoRedo;
        }
        else return 0;
        return Double.parseDouble(ansStack.get(ansStackPointer + undoRedo));

    }
}