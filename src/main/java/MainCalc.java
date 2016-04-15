
public class MainCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		System.out.println("Tal 5 + 5 = " + calc.addition(5.0, 5.0));
		System.out.println("Tal 5 - 1 = " + calc.subtraktion(5.0 , 1.0));
		System.out.println("Tal 10 / 2 = " + calc.division(10.0 , 2.0));
		System.out.println("Tal 2 * 2 = " + calc.multiplikation(2.0, 2.0));
	}

}
