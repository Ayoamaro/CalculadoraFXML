package dad.javafx.calculafxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * @author Ayoze Amaro
 *
 */
public class Controller implements Initializable {

	// Llamamos a la clase "Calculadora"
	Calculadora calcula = new Calculadora();
	
	// Varaibles declaradas
	@FXML
	private GridPane view;
	@FXML
	private TextField field;
	@FXML
	private Button zero, one, two, three, four, five, six, seven, eight, nine, cButton, ceButton, dot, add, substract, multiply, divison, equal;
	
	// Agregamos acciones a cada botón
	@FXML 
	void onZeroAction(ActionEvent e){ calcula.insertar('0'); field.setText(calcula.getPantalla()); }
	@FXML 
	void onOneAction(ActionEvent e){ calcula.insertar('1'); field.setText(calcula.getPantalla()); }
	@FXML 
	void onTwoAction(ActionEvent e){ calcula.insertar('2'); field.setText(calcula.getPantalla()); }
	@FXML 
	void onThreeAction(ActionEvent e){ calcula.insertar('3'); field.setText(calcula.getPantalla()); }
	@FXML 
	void onFourAction(ActionEvent e){ calcula.insertar('4'); field.setText(calcula.getPantalla()); }
	@FXML 
	void onFiveAction(ActionEvent e){ calcula.insertar('5'); field.setText(calcula.getPantalla()); }
	@FXML 
	void onSixAction(ActionEvent e){ calcula.insertar('6'); field.setText(calcula.getPantalla()); }
	@FXML 
	void onSevenAction(ActionEvent e){ calcula.insertar('7'); field.setText(calcula.getPantalla()); }
	@FXML 
	void onEightAction(ActionEvent e){ calcula.insertar('8'); field.setText(calcula.getPantalla()); }
	@FXML 
	void onNineAction(ActionEvent e){ calcula.insertar('9'); field.setText(calcula.getPantalla()); }
	@FXML 
	void onDotAction(ActionEvent e){ calcula.insertarComa(); field.setText(calcula.getPantalla()); }
	@FXML 
	void onCButtonAction(ActionEvent e){ calcula.borrar(); field.setText(calcula.getPantalla()); }
	@FXML 
	void onCeButtonAction(ActionEvent e){ calcula.borrarTodo(); field.setText(calcula.getPantalla()); }
	@FXML 
	void onAddAction(ActionEvent e){ calcula.operar(Calculadora.SUMAR); field.setText(calcula.getPantalla()); }
	@FXML 
	void onSubstractAction(ActionEvent e) { calcula.operar(Calculadora.RESTAR); field.setText(calcula.getPantalla()); }
	@FXML 
	void onMultiplyAction(ActionEvent e){ calcula.operar(Calculadora.MULTIPLICAR); field.setText(calcula.getPantalla()); }
	@FXML 
	void onDivisionAction(ActionEvent e){ calcula.operar(Calculadora.DIVIDIR); field.setText(calcula.getPantalla()); }
	@FXML 
	void onEqualAction(ActionEvent e){ calcula.operar(Calculadora.IGUAL); field.setText(calcula.getPantalla()); }
	
	// Caragmos la Vista creada con el Scene Builder
	public Controller() throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	public void initialize(URL location, ResourceBundle resources) { }
	
	public GridPane getView() {
		return this.view;
	}
}
