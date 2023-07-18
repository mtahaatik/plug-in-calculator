package sd;

public class Operations extends Calculator{

    public double calculate(String operator, double x, double y){
        switch (operator){
            case "+":
                addition(x,y);
                break;
            case "/":
                division(x,y);
                break;
            case "*":
                multiplication(x,y);
                break;
            case "-":
                subtraction(x,y);
                break;
            case "!":
                factorial(x);
                break;
            case "^":
                power(x,y);
                break;
            case "√":
                sqrRoot(y);
                break;
            case "%":
                modulo(x,y);
                break;
            default:
                break;

        }
        return result;
    }

    private void addition(double operandOne, double operandTwo){
        result = operandOne + operandTwo;
    }
    private void subtraction(double operandOne, double operandTwo){
        result = operandOne - operandTwo;
    }
    private void division(double operandOne, double operandTwo){
        result = operandOne / operandTwo;
    }
    private void multiplication(double operandOne, double operandTwo){
        result = operandOne * operandTwo;
    }
    private void modulo(double operandOne, double operandTwo){
        result = operandOne % operandTwo;
    }
    private void factorial(double operandOne){
        result = 1;
        for(double i = operandOne; i > 0; i--){
            result *= i;
        }
    }

    private void power(double operandOne, double operandTwo){
        result = 1;
        for(double i = operandTwo; i > 0; i--){
            result *= operandOne;
        }
    }

    private void sqrRoot(double operandOne){
        double temp;
        double root = operandOne / 2;

        do
        {
            temp=root;
            root=(temp+(operandOne/temp))/2;
        }
        while((temp-root)!= 0);
        result = root;
    }
}
