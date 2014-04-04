/**
 * 
 */
package com.andreiribas;

/**
 * @author andrei
 *
 */
public class MathOperationsImpl implements MathOperations {

	@Override
	public Number add(Number... numbers) {
				
		if(numbers.length < 2) {
			throw new IllegalArgumentException("This method requires at least two numbers as parameters.");
		}
		
		Number result = 0;
		
		for(Number number: numbers) {
			result = result.doubleValue() + number.doubleValue();
		}
		
		return result;
		
	}

	@Override
	public Number subtract(Number... numbers) {
		
		if(numbers.length < 2) {
			throw new IllegalArgumentException("This method requires at least two numbers as parameters.");
		}

		Number result = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			result = result.doubleValue() - numbers[i].doubleValue();
		}
		
		return result;
	
	}

	@Override
	public Number multiply(Number... numbers) {
		
		if(numbers.length < 2) {
			throw new IllegalArgumentException("This method requires at least two numbers as parameters.");
		}
		
		Number result = 1;
		
		for(Number number: numbers) {
			result = result.doubleValue() * number.doubleValue();
		}
		
		return result;
		
	}

	@Override
	public Number divide(Number number1, Number number2) {
		return number1.doubleValue() / number2.doubleValue();
	}

}
