package vezba8;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class FXMLMenuController implements Initializable {

    @FXML
    private Button btnKreni;
    @FXML
    private TextField txfNick;
    @FXML
    private Button btnIzadji;
    @FXML
    private AnchorPane pane;
    
    private Stage stage;
    private Parent root;
    private Scene scene;
    
      @FXML
    private Label lblNick;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void kreni(ActionEvent event) throws IOException {
        
        if("".equals(txfNick.getText())){
            Alert alert= new Alert(AlertType.WARNING);
            alert.setTitle("Obavestenje!");
            alert.setContentText("Unesite nickname!");
            alert.setHeaderText("Niste uneli nickname!");
            alert.showAndWait();
        }
        else{
        String username= txfNick.getText();
        
        FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        root=loader.load();
        
        FXMLDocumentController dvacontroller=loader.getController();
        dvacontroller.setNick(username);
        
        //root=FXMLLoader.load(getClass().getResource("FXMLDva.fxml"));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();       
    }
    }

    @FXML
    private void izlaz(ActionEvent event) {
        System.exit(0);
    }
    
    
    
}
