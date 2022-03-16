package model.entities.signals;

import model.entities.Calculus;
import model.entities.MatSignals;

public class Plus implements MatSignals {
	
	Calculus calculus;

	@Override
	public void operationAction() {
		Double firstNumber = calculus.getFirstNumber();
		Double secondNumber = calculus.getSecondNumber();
		Double result = firstNumber + secondNumber;
		calculus.setFirstNumber(result);	
	}
	
	
	
}