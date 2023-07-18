package sd;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class Calculator{
    public Stack<String> ansStack = new Stack<String>();
    public int ansStackPointer = -1;
    double result;

    public String RPN(ArrayList<String> input) {

        Stack<String> stack = new Stack<String>();
        double result = 0;
        String totalValue = "";
        double x;
        double y;
        String operator;
        String str = "";

        for (int i = 0; i < input.size(); i++) {
            try {
                if (!Objects.equals(input.get(i), "+") && !Objects.equals(input.get(i), "-") //Checks input for operations
                        && !Objects.equals(input.get(i), "*") && !Objects.equals(input.get(i), "/") && !Objects.equals(input.get(i), "!") && !Objects.equals(input.get(i), "^") && !Objects.equals(input.get(i), "√") && !Objects.equals(input.get(i), "%")) {
                    stack.push(input.get(i));
                } else {
                    operator = input.get(i);
                    y = Double.parseDouble(stack.pop());
                    x = Double.parseDouble(stack.pop());
                    Operations operations = new Operations();
                    result = operations.calculate(operator, x, y);
                    totalValue = str + result; //converts integers to string
                    stack.push(totalValue);
                }
            }
            catch (Exception e){
                return "Error: Calculation Undefined";
            }

        }
        ++ansStackPointer;
        String temp = stack.pop();
        ansStack.push(temp);
        return temp;
    }

}

