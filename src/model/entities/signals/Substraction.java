package model.entities.signals;

import model.entities.Calculus;
import model.entities.MatSignals;

public class Substraction implements MatSignals {
	
	Calculus calculus;

	@Override
	public double operationAction() {
		Double firstNumber = calculus.getFirstNumber();
		Double secondNumber = calculus.getSecondNumber();
		Double result = firstNumber - secondNumber;
		calculus.setFirstNumber(result);
		return result;
	}

}
