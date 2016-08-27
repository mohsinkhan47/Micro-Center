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

	// Variables global to other methods
	TextField storeCodeTF, cityTF, stateTF;
	Label storeCodeL, cityL, stateL;

	Scene intro;
	Stage tempStage;
	BorderPane root;
	GridPane mainPane;

	@Override
	public void start(Stage primaryStage) {
		try {
			// Set the title of the Program Window
			primaryStage.setTitle("Daily Numbers v0.1");

			// The layout of the scene
			root = new BorderPane();

			intro = new Scene(root, 580, 180);
			intro.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			// Adding the scene to the stage.
			// Root goes on the Scene, and the scene is added to the Stage where
			// the user will see the GUI.
			primaryStage.setScene(intro);

			/**
			 * Intro GUI.
			 */

			mainPane = new GridPane();
			mainPane.setPadding(new Insets(10, 10, 10, 10));
			mainPane.setVgap(10);
			mainPane.setHgap(20);

			storeCodeL = new Label("What is the store code? (Ex. 085)");
			storeCodeTF = new TextField();
			storeCodeTF.setMaxWidth(125);

			cityL = new Label("In what city is the store located in? (Ex. Rockville)");
			cityTF = new TextField();
			cityTF.setMaxWidth(125);

			stateL = new Label("In what state is the store located in? (Ex. MD)");
			stateTF = new TextField();
			stateTF.setMaxWidth(125);

			Button next = new Button("Next");
			next.setOnAction(new AddButtonClicked());

			Button open = new Button("Open");
			open.setOnAction(new AddButtonClicked());

			mainPane.add(storeCodeL, 0, 0);
			mainPane.add(cityL, 0, 1);
			mainPane.add(stateL, 0, 2);

			mainPane.add(storeCodeTF, 1, 0);
			mainPane.add(cityTF, 1, 1);
			mainPane.add(stateTF, 1, 2);
			mainPane.add(next, 1, 3);
			mainPane.add(open, 2, 3);

			root.setTop(mainPane);

			/**
			 * End of Intro GUI.
			 */

			primaryStage.show();
			tempStage = primaryStage;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error has occured in the start method");
		}
	}

	public void start1(Stage primaryStage) {
		primaryStage.setTitle("Daily Numbers v0.2");

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
	}

	public class AddButtonClicked implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			Store store;
			Button button = (Button) event.getSource();

			if (button.getText() == "Next") {
				if (Integer.parseInt(storeCodeTF.getText()) > 0) {
					store = new Store(Integer.parseInt(storeCodeTF.getText()), cityTF.getText(), stateTF.getText());
					System.out.println(store.toString());
					mainPane.getChildren().clear();
					tempStage.setMaximized(true);
					start1(tempStage);
				} else {
					storeCodeTF.setText("Wrong Input");
					cityTF.setText("Wrong Input");
					stateTF.setText("Wrong Input");
				}
			}
			if (button.getText() == "Open")
				System.out.println("Open Button");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}