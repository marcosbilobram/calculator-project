package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.entities.Calculus;

public class CalculatorViewController implements Initializable{
	
	Calculus calculus =  new Calculus();
	
	@FXML
	private TextField TextFieldPanel; 
	
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
		//Double result = currentOperation(N1, CurrentSignal, N2);
		
	}
	
	@FXML
	public void onButtonDeleteAction() {
		
	}
	
	@FXML
	public void onButtonClearAction() {
		
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
		TextFieldPanel.setText("÷");
	}
	
	@FXML
	public void onButtonMultiplicationAction() {
		TextFieldPanel.setText("x");
	}
	
	@FXML
	public void onButtonMinusAction() {
		TextFieldPanel.setText("-");
	}
	
	@FXML
	public void onButtonPlusAction() {
		TextFieldPanel.setText("+");
	}
	
	@FXML
	public void onButtonCommaAction() {
		TextFieldPanel.setText(".");
	}
	
	@FXML
	public void onButtonChangeSignalAction() {
		
	}
	
	@FXML
	public void onButtonOneAction() {
		TextFieldPanel.setText("1");
	}
	
	@FXML
	public void onButtonTwoAction() {
		TextFieldPanel.setText("2");
	}
	
	@FXML
	public void onButtonThreeAction() {
		TextFieldPanel.insertText(0, "3");
	}
	
	@FXML
	public void onButtonFourAction() {
		TextFieldPanel.setText("4");
	}
	
	@FXML
	public void onButtonFiveAction() {
		TextFieldPanel.setText("5");
	}
	
	@FXML
	public void onButtonSixAction() {
		TextFieldPanel.setText("6");
	}
	
	@FXML
	public void onButtonSevenAction() {
		TextFieldPanel.setText("7");
	}
	
	@FXML
	public void onButtonEightAction() {
		TextFieldPanel.setText("8");
	}
	
	@FXML
	public void onButtonNineAction() {
		TextFieldPanel.setText("9");
	}
	
	@FXML
	public void onButtonZeroAction() {
		TextFieldPanel.setText("0");
	}
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

}
