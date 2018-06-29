package staticVariable;

public class Calculator {

//	public static int calculator(int num1, int num2, String operator) {
//		switch (operator) {
//		case "-":
//			return (num1 - num2);
//			
//		case "+":
//			return (num1 + num2);
//			
//		case "*":
//			return (num1 * num2);
//			
//		case "/":
//			return (num1 / num2);
//			
//		}
//	return -1;
//	}
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int multiple(int num1, int num2) {
		return num1*num2;
	}
	
	public static int divide(int num1, int num2) {
		return num1/num2;
	}
	
	public static int remainder(int num1, int num2) {
		return num1%num2;
	}
	
	public static int substract(int num1, int num2) {
		return num1-num2;
	}
	
	public static int calculator(int num1, int num2, String operator) {
		switch (operator) {
		case "-":
			return (num1 - num2);
			
		case "+":
			return (num1 + num2);
			
		case "*":
			return (num1 * num2);
			
		case "/":
			return (num1 / num2);
			
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		int result;
		result=Calculator.calculator(5, 10, "*");
		System.out.println(result);
		
		result=Calculator.add(5, 25);
		System.out.println(result);
	}
}
