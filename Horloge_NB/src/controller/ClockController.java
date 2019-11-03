package controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.SimpleClockFactory;

public class ClockController {
	private String format;
	private String refreshFreq;

	/**
	 * Display the hour
	 */
	@FXML
	private Label labelHeure;

	/**
	 * Click to create another clock
	 */
	@FXML
	private Button newHeure;
	
	/**
	 * Create a controller instance and save the parameters, if the parameters are not set, default one are set
	 * @param format The format to apply to the hour
	 * @param refreshFreq The frequency of hour refresh
	 */
	public ClockController(String format, String refreshFreq) {
		if (format == null || format.length() == 0) {
			this.setFormat("HH:mm");
		} else {
			this.setFormat(format);
		}

		if (refreshFreq == null || refreshFreq.length() == 0) {
			this.setRefreshFreq("60");
		} else {
			this.setRefreshFreq(refreshFreq);
		}
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getRefreshFreq() {
		return refreshFreq;
	}

	public void setRefreshFreq(String refreshFreq) {
		this.refreshFreq = refreshFreq;
	}

	/**
	 * Initialize the hour in the view and create a thread to actualize it
	 */
	@FXML
	private void initialize() {
		SimpleClockFactory heure1 = new SimpleClockFactory(this.getFormat(), this.getRefreshFreq());
		labelHeure.setText(heure1.fabriqueClock().getTemps().toString());
		int refreshtemp = (Integer.parseInt(refreshFreq)) * 1000;
		Thread thread = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(refreshtemp);
				} catch (Exception e) {
					e.printStackTrace();
				}
				Platform.runLater(() -> {
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
					labelHeure.setText(LocalTime.now().format(formatter).toString());
				});
			}
		});
		thread.setDaemon(true);
		thread.start();
	}

	/**
	 * Create a new window for parameterizing a new clock
	 */
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
