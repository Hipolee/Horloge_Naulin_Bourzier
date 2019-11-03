package Main;

import controller.ClockController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

public class main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			/**
			 * To create a new start window, just copy this block of code and change ClockController parameters
			 */
			//Start
			ClockController control = new ClockController(null, null);
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/ressources/horloge.fxml"));
			loader.setController(control);
			AnchorPane root1 = loader.load();
			Scene scene1 = new Scene(root1,600,400);
			scene1.getStylesheets().add(getClass().getResource("/ressources/application.css").toExternalForm());
			primaryStage.setScene(scene1);
			primaryStage.show();
			//End
			
			ClockController controlEn = new ClockController("hh:mm:ss", "1");
			FXMLLoader loaderEn = new FXMLLoader(getClass().getResource("/ressources/horloge.fxml"));
			loaderEn.setController(controlEn);
			AnchorPane root2 = loaderEn.load();
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
