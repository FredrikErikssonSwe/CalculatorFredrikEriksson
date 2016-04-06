
public class Calculator {
	double result;
	//Addition, add, (+)
	public void addition(double x, double y){
		result = x + y;
		System.out.println("Talet " + x + " + " + y + " = " +result);
	}
	//Subtraktion, remove, (-)
	public void subtraktion(double x, double y){
		result = x - y;
		System.out.println("Talet " + x + " - " + y + " = " +result);
	}
	//Division, divide, (/)
	public void division(double x, double y){
		result = x / y;
		System.out.println("Talet " + x + " / " + y + " = " +result);
	}
	//Multiplikation, multiply, (*)
	public void multiplikation(double x, double y){
		result = x * y;
		System.out.println("Talet " + x + " * " + y + " = " +result);
	}
}
