package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ClockCreatorController {
	
	@FXML
	TextField formatField;
	
	@FXML
	TextField refreshField;
	
	@FXML
	Button CreaHorloge;
	
	@FXML
	private void initialize() {
		formatField.setText("HH:mm");
		refreshField.setText("60");
	}
	
	@FXML
	private void createHorloge() {
		
		try {
			AnchorPane root1 = FXMLLoader.load(getClass().getResource("/ressources/horloge.fxml"));
			Scene scene1 = new Scene(root1,600,400);
			scene1.getStylesheets().add(getClass().getResource("/ressources/application.css").toExternalForm());
			Stage newClock = new Stage();
			newClock.setScene(scene1);
			newClock.show();
			Stage stage = (Stage) CreaHorloge.getScene().getWindow();
			stage.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
