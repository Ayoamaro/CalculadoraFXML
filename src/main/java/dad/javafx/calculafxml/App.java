package dad.javafx.calculafxml;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author Ayoze Amaro
 *
 */
public class App extends Application {

	private Controller controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new Controller();
		
		Scene scene = new Scene(controller.getView());
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculadora");
		primaryStage.getIcons().add(new Image("images/calculadora-icon-32x32.png"));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
