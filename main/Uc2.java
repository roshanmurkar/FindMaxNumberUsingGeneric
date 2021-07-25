package main;

public class Uc2 {
	public static Float findMax(Float firstNumber, Float secondNumber, Float thirdNumber) {
		Float value = null;
		if (thirdNumber.compareTo(firstNumber)>0 && thirdNumber.compareTo(secondNumber)>0) {
			System.out.println(thirdNumber+" third is greater");
			value=thirdNumber;
			
		}
		if (firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
			System.out.println(firstNumber+" first is greater ");
			value=firstNumber;
		}
		if (secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
			System.out.println(secondNumber+" second is greater");
			value=secondNumber;
		}
		return value;
	}

}

