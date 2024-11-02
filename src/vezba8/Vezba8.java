package vezba8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Vezba8 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
        
        Scene scene = new Scene(root);
        Image ikonica=new Image("/vezba8/mm_icon.png"); 
        stage.setScene(scene);
        stage.setTitle("MasterMind Game");
        stage.getIcons().add(ikonica);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
