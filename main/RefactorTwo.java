package main;

class RefactorTwo<E> {
	E firstNumber;
	E secondNumber;
	E thirdNumber;

	RefactorTwo(E firstNumber, E secondNumber, E thirdNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}

	public <E extends Comparable<E>> E findMax(E firstNumber, E secondNumber, E thirdNumber) {
		E value = null;
		if (thirdNumber.compareTo(firstNumber) > 0 && thirdNumber.compareTo(secondNumber) > 0) {
			System.out.println(thirdNumber + " third is greater");
			value = thirdNumber;

		}
		if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
			System.out.println(firstNumber + " first is greater ");
			value = firstNumber;
		}
		if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0) {
			System.out.println(secondNumber + " second is greater");
			value = secondNumber;
		}
		return value;
	}

}
