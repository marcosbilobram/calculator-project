package model.entities;

public class Calculus {

	private Double firstNumber;
	private Double secondNumber;
	private String currentySignal;
	
	public Calculus() {
	}
	
	public Calculus(Double firstNumber, Double secondNumber, String currentySignal) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.currentySignal = currentySignal;
	}

	public Double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(Double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public Double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(Double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public String getCurrentySignal() {
		return currentySignal;
	}

	public void setCurrentySignal(String currentySignal) {
		this.currentySignal = currentySignal;
	}
	
	
}
