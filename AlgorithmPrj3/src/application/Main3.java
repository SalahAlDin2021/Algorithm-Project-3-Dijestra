package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main3 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
				Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		        primaryStage.setTitle("Hello World");
		        primaryStage.setScene(new Scene(root));
		        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
