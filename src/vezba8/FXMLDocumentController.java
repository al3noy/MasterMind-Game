package vezba8;

import java.awt.Color;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;


public class FXMLDocumentController implements Initializable {
    
    int birac;
    Alert a=new Alert(AlertType.WARNING);
    Alert info=new Alert(AlertType.INFORMATION);
           
    @FXML
    private Label lblr1,lblr2,lblr3,lblr4,lblr5,lblPobeda;
    
    @FXML
    private GridPane gridKomb;
    
    @FXML
    private Button btn1g1,btn2g1,btn3g1,btn4g1,btn5g1;
    
    @FXML
    private Button btn1g2,btn2g2,btn3g2,btn4g2,btn5g2;
    
    @FXML
    private Button btn1g3,btn2g3,btn3g3,btn4g3,btn5g3;
    
    @FXML
    private Button btn1g4,btn2g4,btn3g4,btn4g4,btn5g4;
    
    @FXML
    private Button btn1db,btn2db,btn3db,btn4db;
    
    @FXML
    private Button btnPosalji1, btnPosalji2, btnPosalji3, btnPosalji4, btnPosalji5;
        
    @FXML
    private VBox vboxDbtn;
    
    @FXML
    public Label lblNick;
    
    @FXML
    private void izlaz(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    private void crvena(ActionEvent event) {
        birac=1;                
    }
    
    @FXML
    private void zelena(ActionEvent event) {
        birac=2;                
    }
    
    @FXML
    private void plava(ActionEvent event) {
        birac=3;                
    }
    
    @FXML
    private void narandz(ActionEvent event) {
        birac=4;                
    }
    
    @FXML
    private void zuta(ActionEvent event) {
        birac=5;                
    }
    
    @FXML
    private void ljubicasta(ActionEvent event) {
        birac=6;                
    }
    
    @FXML
    private void dobitnaKombinacija() {
        Random r=new Random();
        
        int br1=r.nextInt(6);
        int br2=r.nextInt(6);
        int br3=r.nextInt(6);
        int br4=r.nextInt(6);
        
        if(br1==0){
           btn1db.setStyle("-fx-background-color: red");
        }
        else if(br1==1){
            btn1db.setStyle("-fx-background-color: green");
        }
        else if(br1==2){
            btn1db.setStyle("-fx-background-color: blue");
        }
        else if(br1==3){
            btn1db.setStyle("-fx-background-color: orange");
        }
        else if(br1==4){
            btn1db.setStyle("-fx-background-color: yellow");
        }
        else if(br1==5){
            btn1db.setStyle("-fx-background-color: purple");
        }
        
        if(br2==0){
           btn2db.setStyle("-fx-background-color: red");
        }
        else if(br2==1){
            btn2db.setStyle("-fx-background-color: green");
        }
        else if(br2==2){
            btn2db.setStyle("-fx-background-color: blue");
        }
        else if(br2==3){
            btn2db.setStyle("-fx-background-color: orange");
        }
        else if(br2==4){
            btn2db.setStyle("-fx-background-color: yellow");
        }
        else if(br2==5){
            btn2db.setStyle("-fx-background-color: purple");
        }
        
        if(br3==0){
           btn3db.setStyle("-fx-background-color: red");
        }
        else if(br3==1){
            btn3db.setStyle("-fx-background-color: green");
        }
        else if(br3==2){
            btn3db.setStyle("-fx-background-color: blue");
        }
        else if(br3==3){
            btn3db.setStyle("-fx-background-color: orange");
        }
        else if(br3==4){
            btn3db.setStyle("-fx-background-color: yellow");
        }
        else if(br3==5){
            btn3db.setStyle("-fx-background-color: purple");
        }     
        
        if(br4==0){
           btn4db.setStyle("-fx-background-color: red");
        }
        else if(br4==1){
            btn4db.setStyle("-fx-background-color: green");
        }
        else if(br4==2){
            btn4db.setStyle("-fx-background-color: blue");
        }
        else if(br4==3){
            btn4db.setStyle("-fx-background-color: orange");
        }
        else if(br4==4){
            btn4db.setStyle("-fx-background-color: yellow");
        }
        else if(br4==5){
            btn4db.setStyle("-fx-background-color: purple");
        }
        
    }
    
    @FXML
    private void farbaj1g1 (ActionEvent event) {
        if(birac==1){
           btn1g1.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn1g1.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn1g1.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn1g1.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn1g1.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn1g1.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                      
    }
    
    @FXML
    private void farbaj1g2(ActionEvent event) {
        if(birac==1){
           btn1g2.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn1g2.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn1g2.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn1g2.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn1g2.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn1g2.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }  
                      
    }
    
    @FXML
    private void farbaj1g3 (ActionEvent event) {
        if(birac==1){
           btn1g3.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn1g3.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn1g3.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn1g3.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn1g3.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn1g3.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }  
                      
    }
    
    @FXML
    private void farbaj1g4 (ActionEvent event) {
        if(birac==1){
           btn1g4.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn1g4.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn1g4.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn1g4.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn1g4.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn1g4.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj2g1 (ActionEvent event) {
        if(birac==1){
           btn2g1.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn2g1.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn2g1.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn2g1.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn2g1.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn2g1.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj2g2 (ActionEvent event) {
        if(birac==1){
           btn2g2.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn2g2.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn2g2.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn2g2.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn2g2.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn2g2.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj2g3 (ActionEvent event) {
        if(birac==1){
           btn2g3.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn2g3.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn2g3.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn2g3.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn2g3.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn2g3.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj2g4 (ActionEvent event) {
        if(birac==1){
           btn2g4.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn2g4.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn2g4.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn2g4.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn2g4.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn2g4.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj3g1 (ActionEvent event) {
        if(birac==1){
           btn3g1.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn3g1.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn3g1.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn3g1.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn3g1.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn3g1.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj3g2 (ActionEvent event) {
        if(birac==1){
           btn3g2.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn3g2.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn3g2.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn3g2.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn3g2.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn3g2.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj3g3 (ActionEvent event) {
        if(birac==1){
           btn3g3.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn3g3.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn3g3.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn3g3.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn3g3.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn3g3.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj3g4 (ActionEvent event) {
        if(birac==1){
           btn3g4.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn3g4.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn3g4.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn3g4.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn3g4.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn3g4.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();                        
        }                        
    }
    
    @FXML
    private void farbaj4g1 (ActionEvent event) {
        if(birac==1){
           btn4g1.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn4g1.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn4g1.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn4g1.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn4g1.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn4g1.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj4g2 (ActionEvent event) {
        if(birac==1){
           btn4g2.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn4g2.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn4g2.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn4g2.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn4g2.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn4g2.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj4g3 (ActionEvent event) {
        if(birac==1){
           btn4g3.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn4g3.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn4g3.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn4g3.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn4g3.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn4g3.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj4g4 (ActionEvent event) {
        if(birac==1){
           btn4g4.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn4g4.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn4g4.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn4g4.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn4g4.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn4g4.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj5g1 (ActionEvent event) {
        if(birac==1){
           btn5g1.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn5g1.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn5g1.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn5g1.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn5g1.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn5g1.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj5g2 (ActionEvent event) {
        if(birac==1){
           btn5g2.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn5g2.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn5g2.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn5g2.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn5g2.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn5g2.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj5g3 (ActionEvent event) {
        if(birac==1){
           btn5g3.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn5g3.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn5g3.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn5g3.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn5g3.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn5g3.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
    @FXML
    private void farbaj5g4 (ActionEvent event) {
        if(birac==1){
           btn5g4.setStyle("-fx-background-color: red");
        }
        else if(birac==2){
            btn5g4.setStyle("-fx-background-color: green");
        }
        else if(birac==3){
            btn5g4.setStyle("-fx-background-color: blue");
        }
        else if(birac==4){
            btn5g4.setStyle("-fx-background-color: orange");
        }
        else if(birac==5){
            btn5g4.setStyle("-fx-background-color: yellow");
        }
        else if(birac==6){
            btn5g4.setStyle("-fx-background-color: purple");
        }
        else{
            a.setTitle("Greska");
            a.setHeaderText("Prvo izaberi boju!");
            a.showAndWait();
        }                        
    }
    
   
    @FXML
    private void posalji1 (){
                
        int tacni=0;
        int netacni=0;
        
        if(btn1g1.getStyle()==btn1db.getStyle()){
            tacni++;
            lblr1.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);          
        }
        else{
            netacni++;
            lblr1.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);           
        }
               
        if(btn1g2.getStyle()==btn2db.getStyle()){
            tacni++;
            lblr1.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr1.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        
        if(btn1g3.getStyle()==btn3db.getStyle()){
            tacni++;
            lblr1.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr1.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
               
        if(btn1g4.getStyle()==btn4db.getStyle()){
            tacni++;
            lblr1.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr1.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        
        if(btn1g1.getStyle()==btn1db.getStyle() && btn1g2.getStyle()==btn2db.getStyle() && btn1g3.getStyle()==btn3db.getStyle() && btn1g4.getStyle()==btn4db.getStyle()){
            lblr1.setText("Tacni: " + "4" + "\n" +"Netacni: " + "0");
            info.setTitle("POBEDA");
            info.setHeaderText("Cestitamo! Pronasli ste kombinaciju!");
            info.showAndWait();
            gridKomb.setDisable(true);
            vboxDbtn.setVisible(true);
            btnPosalji1.setDisable(true);
            btnPosalji2.setDisable(true);
            btnPosalji3.setDisable(true);
            btnPosalji4.setDisable(true);
            btnPosalji5.setDisable(true);
        }
        else{            
            lblPobeda.setText("Preostalo pokusaja: 4");  
        }
        //------------------------------------------------------------                                      
    }
    
     @FXML
    private void posalji2 (){
                
        int tacni=0;
        int netacni=0;
        
        if(btn2g1.getStyle()==btn1db.getStyle()){
            tacni++;
            lblr2.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);          
        }
        else{
            netacni++;
            lblr2.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);           
        }
               
        if(btn2g2.getStyle()==btn2db.getStyle()){
            tacni++;
            lblr2.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr2.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        
        if(btn2g3.getStyle()==btn3db.getStyle()){
            tacni++;
            lblr2.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr2.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
               
        if(btn2g4.getStyle()==btn4db.getStyle()){
            tacni++;
            lblr2.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr2.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        if(btn2g1.getStyle()==btn1db.getStyle() && btn2g2.getStyle()==btn2db.getStyle() && btn2g3.getStyle()==btn3db.getStyle() && btn2g4.getStyle()==btn4db.getStyle()){
            lblr2.setText("Tacni: " + "4" + "\n" +"Netacni: " + "0");
            info.setTitle("POBEDA");
            info.setHeaderText("Cestitamo! Pronasli ste kombinaciju!");
            info.showAndWait();        
            gridKomb.setDisable(true);
            vboxDbtn.setVisible(true);
            btnPosalji1.setDisable(true);
            btnPosalji2.setDisable(true);
            btnPosalji3.setDisable(true);
            btnPosalji4.setDisable(true);
            btnPosalji5.setDisable(true);
        }
        else{
            lblPobeda.setText("Preostalo pokusaja: 3");  
        }
        //------------------------------------------------------------                                      
    }
    
     @FXML
    private void posalji3 (){
                
        int tacni=0;
        int netacni=0;
        
        if(btn3g1.getStyle()==btn1db.getStyle()){
            tacni++;
            lblr3.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);          
        }
        else{
            netacni++;
            lblr3.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);           
        }
               
        if(btn3g2.getStyle()==btn2db.getStyle()){
            tacni++;
            lblr3.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr3.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        
        if(btn3g3.getStyle()==btn3db.getStyle()){
            tacni++;
            lblr3.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr3.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
               
        if(btn3g4.getStyle()==btn4db.getStyle()){
            tacni++;
            lblr3.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr3.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        
        if(btn3g1.getStyle()==btn1db.getStyle() && btn3g2.getStyle()==btn2db.getStyle() && btn3g3.getStyle()==btn3db.getStyle() && btn3g4.getStyle()==btn4db.getStyle()){
            lblr3.setText("Tacni: " + "4" + "\n" +"Netacni: " + "0");
            info.setTitle("POBEDA");
            info.setHeaderText("Cestitamo! Pronasli ste kombinaciju!");
            info.showAndWait();           
            gridKomb.setDisable(true);
            vboxDbtn.setVisible(true);
            btnPosalji1.setDisable(true);
            btnPosalji2.setDisable(true);
            btnPosalji3.setDisable(true);
            btnPosalji4.setDisable(true);
            btnPosalji5.setDisable(true);
        }
        else{
            lblPobeda.setText("Preostalo pokusaja: 2");  
        }
        //------------------------------------------------------------                                      
    }
    
     @FXML
    private void posalji4 (){
                
        int tacni=0;
        int netacni=0;
        
        if(btn4g1.getStyle()==btn1db.getStyle()){
            tacni++;
            lblr4.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);          
        }
        else{
            netacni++;
            lblr4.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);           
        }
               
        if(btn4g2.getStyle()==btn2db.getStyle()){
            tacni++;
            lblr4.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr4.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        
        if(btn4g3.getStyle()==btn3db.getStyle()){
            tacni++;
            lblr4.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr4.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
               
        if(btn4g4.getStyle()==btn4db.getStyle()){
            tacni++;
            lblr4.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr4.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        if(btn4g1.getStyle()==btn1db.getStyle() && btn4g2.getStyle()==btn2db.getStyle() && btn4g3.getStyle()==btn3db.getStyle() && btn4g4.getStyle()==btn4db.getStyle()){
            lblr4.setText("Tacni: " + "4" + "\n" +"Netacni: " + "0");
            info.setTitle("POBEDA");
            info.setHeaderText("Cestitamo! Pronasli ste kombinaciju!");
            info.showAndWait();            
            gridKomb.setDisable(true);
            vboxDbtn.setVisible(true);
            btnPosalji1.setDisable(true);
            btnPosalji2.setDisable(true);
            btnPosalji3.setDisable(true);
            btnPosalji4.setDisable(true);
            btnPosalji5.setDisable(true);
        }
        else{
            lblPobeda.setText("Preostalo pokusaja: 1");  
        }
        //------------------------------------------------------------                                      
    }
    
     @FXML
    private void posalji5 (){
                
        int tacni=0;
        int netacni=0;
        
        if(btn5g1.getStyle()==btn1db.getStyle()){
            tacni++;
            lblr5.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);          
        }
        else{
            netacni++;
            lblr5.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);           
        }
               
        if(btn5g2.getStyle()==btn2db.getStyle()){
            tacni++;
            lblr5.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr5.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        
        if(btn5g3.getStyle()==btn3db.getStyle()){
            tacni++;
            lblr5.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr5.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
               
        if(btn5g4.getStyle()==btn4db.getStyle()){
            tacni++;
            lblr5.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        else{
            netacni++;
            lblr5.setText("Tacni: " + tacni + "\n" +"Netacni: " + netacni);
        }
        if(btn5g1.getStyle()==btn1db.getStyle() && btn5g2.getStyle()==btn2db.getStyle() && btn5g3.getStyle()==btn3db.getStyle() && btn5g4.getStyle()==btn4db.getStyle()){
            lblr5.setText("Tacni: " + "4" + "\n" +"Netacni: " + "0");
            info.setTitle("POBEDA");
            info.setHeaderText("Cestitamo! Pronasli ste kombinaciju!");
            info.showAndWait();          
            gridKomb.setDisable(true);
            vboxDbtn.setVisible(true);
            btnPosalji1.setDisable(true);
            btnPosalji2.setDisable(true);
            btnPosalji3.setDisable(true);
            btnPosalji4.setDisable(true);
            btnPosalji5.setDisable(true);
        }
        else{            
            lblPobeda.setText("Preostalo pokusaja: 0");  
            info.setTitle("PORAZ");
            info.setHeaderText("Niste uspeli da nadjete kombinaciju. Pokusajte ponovo.");
            info.showAndWait();
            vboxDbtn.setVisible(true);
            gridKomb.setDisable(true);
        }
        //------------------------------------------------------------                                      
    }
    
    
    
    @FXML
    private void ponistiSve (){
        btn1g1.setStyle("");
        btn1g2.setStyle("");
        btn1g3.setStyle("");
        btn1g4.setStyle("");
        
        btn2g1.setStyle("");
        btn2g2.setStyle("");
        btn2g3.setStyle("");
        btn2g4.setStyle("");
        
        btn3g1.setStyle("");
        btn3g2.setStyle("");
        btn3g3.setStyle("");
        btn3g4.setStyle("");
        
        btn4g1.setStyle("");
        btn4g2.setStyle("");
        btn4g3.setStyle("");
        btn4g4.setStyle("");
        
        btn5g1.setStyle("");
        btn5g2.setStyle("");
        btn5g3.setStyle("");
        btn5g4.setStyle("");
        
        lblr1.setText("");
        lblr2.setText("");
        lblr3.setText("");
        lblr4.setText("");
        lblr5.setText("");
        
        btnPosalji1.setVisible(false);
        btnPosalji2.setVisible(false);
        btnPosalji3.setVisible(false);
        btnPosalji4.setVisible(false);
        btnPosalji5.setVisible(false);
        
        lblPobeda.setText("");
        
        /*btn1db.setStyle("");
        btn2db.setStyle("");
        btn3db.setStyle("");
        btn4db.setStyle("");*/
        
        gridKomb.setVisible(false);
        vboxDbtn.setVisible(false);
        birac=0;
        
        
    }
    
    @FXML
    private void pocniIgru (){
        dobitnaKombinacija();
        
        ponistiSve();
        
        gridKomb.setDisable(false);
        
        btnPosalji1.setVisible(true);
        btnPosalji2.setVisible(true);
        btnPosalji3.setVisible(true);
        btnPosalji4.setVisible(true);
        btnPosalji5.setVisible(true);
        
        btnPosalji1.setDisable(false);
        btnPosalji2.setDisable(false);
        btnPosalji3.setDisable(false);
        btnPosalji4.setDisable(false);
        btnPosalji5.setDisable(false);
        
        // vboxDbtn.setVisible(true);
        gridKomb.setVisible(true);  
        
    }
    
    public void setNick(String username){
        lblNick.setText("Igrac: " + username);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
