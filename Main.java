package application;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Main extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
    	
    	try {
    		AnchorPane root = new AnchorPane();
			 root = (AnchorPane)FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		    Scene scene = new Scene(root,400,600);
		    root.setStyle("-fx-background-image:url('Main.png'); -fx-background-repeat: no-repeat; -fx-background-size: 400 600; -fx-background-position: center center;");
			//String css =this.getClass().getResource("/application/application.css").toExternalForm();
			//primaryStage.getStylesheets().add(css);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

    public static void main(String[] args)
    {
        launch(args);
    }
}