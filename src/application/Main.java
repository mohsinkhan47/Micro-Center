package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Daily Numbers");

			BorderPane root = new BorderPane();

			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);

			primaryStage.centerOnScreen();
			// primaryStage.setFullScreen(true);

			Label sameDayL = new Label("Same Days");
			Label closesL = new Label("Closes");

			Label pcCheckInL = new Label("PC+ Check In");

			Label super6StoreL = new Label("Super 6 by Store");
			Label super6TechL = new Label("Super 6 by Techs");
			Label techCompletesL = new Label("Tech Completes");
			Label daysOnBenchL = new Label("Days on Bench");

			Label customerServiceCheckInL = new Label("Customer Service Check In");
			Label rpNumberL = new Label("RP");
			Label customerNameL = new Label("Customer's Name");
			Label unitL = new Label("Unit");
			Label techNameL = new Label("Tech");
			Label casherNotesL = new Label("Casher Notes");

			root.setTop(sameDayL);

			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error has occured in the start method");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
