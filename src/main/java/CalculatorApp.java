
public class CalculatorApp 
{
    public double calculate(double firstOperand, int secondOperand, int operator) {
    	
        double result = 0;

        switch (operator) {

            case '+':
                result = firstOperand + secondOperand;
                break;

            case '-':
                result = firstOperand - secondOperand;
                break;

            case '*':
                result = firstOperand * secondOperand;
                break;

            case '/':
                result = firstOperand / secondOperand;
                break;
        }
        return result;
    }
}