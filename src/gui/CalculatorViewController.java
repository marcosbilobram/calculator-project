package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.IndexRange;
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
		TextFieldPanel.deleteNextChar();
	}
	
	@FXML
	public void onButtonClearAction() {
		TextFieldPanel.deleteText(IndexRange.valueOf(TextFieldPanel.getText()));
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
		TextFieldPanel.appendText("÷");
	}
	
	@FXML
	public void onButtonMultiplicationAction() {
		TextFieldPanel.appendText("X");
	}
	
	@FXML
	public void onButtonMinusAction() {
		TextFieldPanel.appendText("-");
	}
	
	@FXML
	public void onButtonPlusAction() {
		TextFieldPanel.appendText("+");
	}
	
	@FXML
	public void onButtonCommaAction() {
		TextFieldPanel.appendText(".");
	}
	
	@FXML
	public void onButtonChangeSignalAction() {
		
	}
	
	@FXML
	public void onButtonOneAction() {
		TextFieldPanel.appendText("1");
	}
	
	@FXML
	public void onButtonTwoAction() {
		TextFieldPanel.appendText("2");
	}
	
	@FXML
	public void onButtonThreeAction() {
		TextFieldPanel.appendText("3");
	}
	
	@FXML
	public void onButtonFourAction() {
		TextFieldPanel.appendText("4");
	}
	
	@FXML
	public void onButtonFiveAction() {
		TextFieldPanel.appendText("5");
	}
	
	@FXML
	public void onButtonSixAction() {
		TextFieldPanel.appendText("6");
	}
	
	@FXML
	public void onButtonSevenAction() {
		TextFieldPanel.appendText("7");
	}
	
	@FXML
	public void onButtonEightAction() {
		TextFieldPanel.appendText("8");
	}
	
	@FXML
	public void onButtonNineAction() {
		TextFieldPanel.appendText("9");
	}
	
	@FXML
	public void onButtonZeroAction() {
		TextFieldPanel.appendText("0");
	}
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		TextFieldPanel.setAlignment(Pos.BOTTOM_RIGHT);
	}

}
