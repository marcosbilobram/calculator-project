package model.service;

import model.entities.Calculus;
import model.entities.MatSignals;
import model.entities.signals.Division;
import model.entities.signals.Plus;

public class CalculusManagement {
	
	private Calculus calculus;
	private MatSignals matSignals;
	
	public Double currentOperation(Double firstNumber, MatSignals currentSignal , Double secondNumber) {
		firstNumber = calculus.getFirstNumber();
		currentSignal = signalConverter(calculus.getCurrentySignal());
		secondNumber =  calculus.getSecondNumber();
		matSignals.operationAction();
		
		
		return null;
	}
	
	public MatSignals signalConverter(String currentSignal) {
		MatSignals matSignal = null;
		if(currentSignal == "÷" ) {
			matSignal = new Division();
		}
		if(currentSignal == "+") {
			matSignal = new Plus();
		}
		return matSignal;
	}
		
}
