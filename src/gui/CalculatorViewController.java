package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.entities.Calculus;
import model.service.CalculusManagement;

public class CalculatorViewController implements Initializable{
	
	Calculus calculus = new Calculus();
	CalculusManagement calculusMan = new CalculusManagement();
	
	@FXML
	private TextField textFieldPanel;
	
	@FXML
	private Button buttonEqual;
	
	@FXML
	private Button buttonDelete;
	
	@FXML
	private Button buttonClear;
	
	@FXML
	private Button buttonPercentage;
	
	@FXML
	private Button buttonOneDividedfor;
	
	@FXML
	private Button buttonSquared;
	
	@FXML
	private Button buttonSquareRoot;
	
	@FXML
	private Button buttonDivision;
	
	@FXML
	private Button buttonMultiplication;
	
	@FXML
	private Button buttonMinus;
	
	@FXML
	private Button buttonPlus;
	
	@FXML
	private Button buttonComma;
	
	@FXML
	private Button buttonChangeSignal;
	
	@FXML
	private Button buttonZero;
	
	@FXML
	private Button buttonOne;
	
	@FXML
	private Button buttonTwo;
	
	@FXML
	private Button buttonThree;
	
	@FXML
	private Button buttonFour;
	
	@FXML
	private Button buttonFive;
	
	@FXML
	private Button buttonSix;
	
	@FXML
	private Button buttonSeven;
	
	@FXML
	private Button buttonEight;
	
	@FXML
	private Button buttonNine;
	
	@FXML
	public void onTextFieldAction() {
		
	}
	
	@FXML
	public void onButtonEqualAction() {
		boolean éSim = textFieldPanel.getText().contains("+");
		String digits = textFieldPanel.getText();
		
		
		//calculusMan.numberOrganizor(digits);
		//Double result = currentOperation(N1, CurrentSignal, N2);
		
	}
	
	//public String digitsSpliter(String digits) {
	//	if (digits.contains("+") || digits.contains("-") || digits.contains("x") || digits.contains("÷")) {
			
	//	}
//	}
	
	@FXML
	public void onButtonDeleteAction() {
		textFieldPanel.deleteNextChar();
	}
	
	@FXML
	public void onButtonClearAction() {
		textFieldPanel.clear();
	}
	
	@FXML
	public void onButtonPercentageAction() {
		
	}
	
	@FXML
	public void onButtonOneDivideForAction() {
		
	}
	
	@FXML
	public void onButtonSquaredAction() {
		
	}
	
	@FXML
	public void onButtonSquaredRootAction() {
		
	}
	
	@FXML
	public void onButtonDivisionAction() {
		calculus.setCurrentySignal("÷");
		textFieldPanel.appendText("÷");
	}
	
	@FXML
	public void onButtonMultiplicationAction() {
		textFieldPanel.appendText("X");
	}
	
	@FXML
	public void onButtonMinusAction() {
		textFieldPanel.appendText("-");
	}
	
	@FXML
	public void onButtonPlusAction() {
		textFieldPanel.appendText("+");
	}
	
	@FXML
	public void onButtonCommaAction() {
		textFieldPanel.appendText(".");
	}
	
	@FXML
	public void onButtonChangeSignalAction() {
		
	}
	
	@FXML
	public void onButtonOneAction() {
		textFieldPanel.appendText("1");
	}
	
	@FXML
	public void onButtonTwoAction() {
		textFieldPanel.appendText("2");
	}
	
	@FXML
	public void onButtonThreeAction() {
		textFieldPanel.appendText("3");
	}
	
	@FXML
	public void onButtonFourAction() {
		textFieldPanel.appendText("4");
	}
	
	@FXML
	public void onButtonFiveAction() {
		textFieldPanel.appendText("5");
	}
	
	@FXML
	public void onButtonSixAction() {
		textFieldPanel.appendText("6");
	}
	
	@FXML
	public void onButtonSevenAction() {
		textFieldPanel.appendText("7");
	}
	
	@FXML
	public void onButtonEightAction() {
		textFieldPanel.appendText("8");
	}
	
	@FXML
	public void onButtonNineAction() {
		textFieldPanel.appendText("9");
	}
	
	@FXML
	public void onButtonZeroAction() {
		textFieldPanel.appendText("0");
	}
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		textFieldPanel.setAlignment(Pos.BOTTOM_RIGHT);
	}

}
