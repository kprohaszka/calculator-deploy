
public class Calculator {
	
    public double calculate(int firstOperand, int secondOperand, String operator) {
    	
        double result = 0;
        
        double doubleFirstOperand = (double) firstOperand;
        double doubleSecondOperand = (double) secondOperand;

        switch (operator) {

            case "+":
                result = doubleFirstOperand + doubleSecondOperand;
                break;

            case "-":
                result = doubleFirstOperand - doubleSecondOperand;
                break;

            case "*":
                result = doubleFirstOperand * doubleSecondOperand;
                break;

            case "/":
                result = doubleFirstOperand / doubleSecondOperand;
                break;
        }
        return result;
    }
}
