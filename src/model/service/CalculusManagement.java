package model.service;

import model.entities.Calculus;
import model.entities.MatSignals;
import model.entities.signals.Division;
import model.entities.signals.Multiplication;
import model.entities.signals.Sum;
import model.entities.signals.Substraction;

public class CalculusManagement {
	
	private Calculus calculus;
	private MatSignals matSignals;
	
	public Double currentOperation(Double firstNumber, MatSignals currentSignal , Double secondNumber) {
		firstNumber = calculus.getFirstNumber();
		currentSignal = signalConverter(calculus.getCurrentySignal());
		secondNumber =  calculus.getSecondNumber();
		Double result = matSignals.operationAction();
		return result;
	}
	
	public MatSignals signalConverter(String currentSignal) {
		MatSignals matSignal = null;
		if(currentSignal == "÷" ) {
			matSignal = new Division();
		}
		if(currentSignal == "+") {
			matSignal = new Sum();
		}
		if(currentSignal == "-") {
			matSignal = new Substraction();
		}
		if(currentSignal == "x") {
			matSignal = new Multiplication();
		}
		return matSignal;
	}
		
}
