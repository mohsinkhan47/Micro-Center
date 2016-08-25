package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

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

			// Start intro GUI

			/**
			 * Intro GUI.
			 * 
			 * Needs the store's code, location by city and state, technicians,
			 * names and ID
			 * 
			 */

			GridPane mainPane = new GridPane();
			mainPane.setPadding(new Insets(10, 10, 10, 10));
			mainPane.setVgap(10);
			mainPane.setHgap(20);

			Store store = new Store();
			Label storeCodeL = new Label("What is the store code? (Ex. 085)");
			TextField storeCodeTF = new TextField();
			storeCodeTF.setMaxWidth(100);

			Label cityL = new Label("In what city is the store located in? (Ex. Rockville)");
			TextField cityTF = new TextField();
			cityTF.setMaxWidth(100);

			Label stateL = new Label("In what state is the store located in? (Ex. MD)");
			TextField stateTF = new TextField();
			stateTF.setMaxWidth(100);

			Button next = new Button("Next");
			next.setOnAction(new AddButtonClicked());

			mainPane.add(storeCodeL, 0, 0);
			mainPane.add(cityL, 0, 1);
			mainPane.add(stateL, 0, 2);

			mainPane.add(storeCodeTF, 1, 0);
			mainPane.add(cityTF, 1, 1);
			mainPane.add(stateTF, 1, 2);
			mainPane.add(next, 2, 3);

			root.setTop(mainPane);

			// store.setLocationCode(Integer.parseInt(entry.getText()));

			// End of intro GUI

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

			// Same Day Table
			// root.setTop(sameDayL);

			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error has occured in the start method");
		}
	}

	private static class AddButtonClicked implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			System.out.println("My Very Own Private Button Handler");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
