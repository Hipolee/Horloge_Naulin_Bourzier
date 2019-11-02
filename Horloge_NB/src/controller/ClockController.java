package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.SimpleClockFactory;

public class ClockController {

	@FXML
	private Label labelHeure;

	@FXML
	private Button newHeure;

	@FXML
	private void initialize() { 
		SimpleClockFactory heure1 = new SimpleClockFactory();
		labelHeure.setText(heure1.fabriqueClock().getTemps().toString());
	}

	@FXML
	private void paramHeureWindow() {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ressources/clockCreator.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root1, 400, 200));
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
