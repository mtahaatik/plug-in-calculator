package softwaredesign;

import java.util.Objects;
import java.util.Stack;

public class Operations extends Plugin {



    private double RPN() {
        Calculator myObject = new Calculator();

        Stack<String> stack = new Stack<String>();
        double result = 0;
        String totalValue = "";
        double x, y;
        String operator;
        String str = "";

        for (int i = 0; i < myObject.rpn.size(); i++) {
            operator = myObject.rpn.get(i);
            if (!Objects.equals(operator, "+") && !Objects.equals(operator, "-")
                    && !Objects.equals(operator, "*") && !Objects.equals(operator, "/")) {
                stack.push(operator);
            } else {
                x = Integer.parseInt(stack.pop());
                y = Integer.parseInt(stack.pop());
                result = calculate(operator, x, y);
                totalValue = str + result; //converts integers to string
                stack.push(totalValue);
            }

        }
        return Integer.parseInt(stack.pop());
    }

    public double calculate(String operator, double x, double y){
        switch (operator){
            case "+":
                Addition(x,y);
                break;
            case "/":
                Division(x,y);
                break;
            case "*":
                Multiplication(x,y);
                break;
            case "-":
                Subtraction(x,y);
                break;
            case "!":
                Complex(x,y);
                break;
            default:
                break;
        }
        return result;
    }

    public void Addition(double operand_one, double operand_two){
        result = operand_one + operand_two;
    }
    public void Subtraction(double operand_one, double operand_two){
        result = operand_one - operand_two;
    }
    public void Division(double operand_one, double operand_two){
        result = operand_one / operand_two;
    }
    public void Multiplication(double operand_one, double operand_two){
        result = operand_one * operand_two;
    }
}