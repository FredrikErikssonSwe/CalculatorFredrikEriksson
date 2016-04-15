import static org.junit.Assert.*;

import org.junit.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTests {
	
	Calculator Calculator = new Calculator();
	
	@BeforeClass
	public static void BeforeClass() throws Exception{
	
	}

	//addition Test 1
	@Test 
	public void Addition() { 
	assertEquals("Unexepected error", 10.0, Calculator.addition(5.0 , 5.0),0.0); 
	} 
	//addition Test 2
	@Test 
	public void Addition2() { 
	assertEquals("Unexepected error", -10.0, Calculator.addition(-5.0 , -5.0),0.0); 
	} 
	//addition Test 3
	@Test 
	public void Addition3() { 
	assertEquals("Unexepected error", 0.0, Calculator.addition(-5.0 , 5.0),0.0); 
	}
	
	//Substraktion Test 1
	@Test 
	public void Subtraktion1() { 
	assertEquals("Unexepected error", 15.0, Calculator.subtraktion(10.0 , -5.0),0.0); 
	}
	//Substraktion Test 2
	@Test 
	public void Subtraktion2() { 
	assertEquals("Unexepected error", -5.0, Calculator.subtraktion(-10.0 , -5.0),0.0); 
	}
	//Substraktion Test 3
	@Test 
	public void Subtraktion3() { 
	assertEquals("Unexepected error", 1.0, Calculator.subtraktion(0.0 , -1.0),0.0); 
	}
	
	//Division Test 1
	@Test 
	public void Division1() { 
	assertEquals("Unexepected error", 5.0, Calculator.division(10.0 , 2.0),0.0); 
	}
	//Division Test 2
	@Test 
	public void Division2() { 
	assertEquals("Unexepected error", 0.5, Calculator.division(5.0 , 10.0),0.0); 
	}
	//Division Test 3 (Detta Test funkar ej!)
	@Test 
	public void Division3() { 
	assertEquals("Unexepected error", 0.0, Calculator.division(10.0 , 0.0),0.0); 
	}
	
	//Multiplikation Test 1
	@Test 
	public void Multiplikation1() { 
	assertEquals("Unexepected error", 25.0, Calculator.multiplikation(5.0 , 5.0),0.0); 
	}
	//Multiplikation Test 2
	@Test 
	public void Multiplikation2() { 
	assertEquals("Unexepected error", 56.0, Calculator.multiplikation(-7.0 , -8.0),0.0); 
	}
	//Multiplikation Test 3
	@Test 
	public void Multiplikation3() { 
	assertEquals("Unexepected error", 0.0, Calculator.multiplikation(1.0 , 0.0),0.0); 
	}

	
}
