package Main;

import java.time.format.DateTimeFormatter;

import model.EnglishClockConcret;
import model.EnglishClockFactory;
import model.SimpleClockConcret;
import ressources.ClockWindow;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class main extends Application {
	
	@FXML
	Label labelHeure;
	
	/*public static void main(String[] args) {
		DateTimeFormatter formatterclock1 = DateTimeFormatter.ofPattern("HH:mm");
		DateTimeFormatter formatterclock2 = DateTimeFormatter.ofPattern("hh:mm:ss");
		SimpleClockConcret clock1 = new SimpleClockConcret(formatterclock1,60);
		EnglishClockConcret clock2 = new EnglishClockConcret(formatterclock2);
		System.out.println("HeureFr : " + clock1.getTemps().toString());
		System.out.println("HeureEn : " + clock2.getTemps().toString());
		//new ClockWindow();
	}*/
	
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root1 = FXMLLoader.load(getClass().getResource("/ressources/horloge.fxml"));
			Scene scene1 = new Scene(root1,600,400);
			scene1.getStylesheets().add(getClass().getResource("/ressources/application.css").toExternalForm());
			primaryStage.setScene(scene1);
			primaryStage.show();
			
			AnchorPane root2 = FXMLLoader.load(getClass().getResource("/ressources/horlogeEN.fxml"));
			Scene scene2 = new Scene(root2,600,400);
			scene2.getStylesheets().add(getClass().getResource("/ressources/application.css").toExternalForm());
			Stage stageEn = new Stage();
			stageEn.setScene(scene2);
			stageEn.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
