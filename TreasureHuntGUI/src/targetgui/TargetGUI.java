/*Tazaki Khan
 * TargetGUI.java
    All rights reserved
 *
 * This program requires a Target class in the same package.
 */


package targetgui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TargetGUI extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
         
        HBox titleBox = new HBox();
        titleBox.setPadding(new Insets(15, 15, 15, 15));
        
        titleBox.setAlignment(Pos.CENTER);
        
        Font titleFont=Font.font("Comic Sans", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 28);//setting up an improvred font
        Text title = new Text("Target Grid");
        title.setFont(titleFont);
        title.setStyle("-fx-stroke:black;-fx-fill:blue;");//COLOR FOR THE TITLE FONT
         
        DropShadow dropShadow = new DropShadow();///ADDED THE DROPSHADOW
        dropShadow.setOffsetX(2.0f);
        dropShadow.setOffsetY(4.0f);
        dropShadow.setColor(Color.rgb(150, 50, 50, .688));
        title.setEffect(dropShadow);
        title.setEffect(dropShadow);
        titleBox.getChildren().add(title);
        
        // Create a grid pane to hold the buttons
        GridPane gPane = new GridPane();
        gPane.setPadding(new Insets(11, 11, 11, 11));
        
        gPane.setAlignment(Pos.CENTER);
        gPane.setHgap(5);
        gPane.setVgap(5);

        // Create a VBox to hold the information box
        VBox infoBox = new VBox(5);
        infoBox.setPadding(new Insets(15, 15, 15, 15));
       
        
        final Button btnExit= new Button("exit"); //declaring an exit button
        final Button btnIns=new Button("Call HIT!!");//CREATING hit BUTTON
        final Button btnIns1=new Button("Call MISS!!");//CREATING hit BUTTON

        
        infoBox.getChildren().add(btnExit);  //putting up the button in the fx
        infoBox.getChildren().add(btnIns); //adding hit button
        infoBox.getChildren().add(btnIns1);/// adding miss button
        
         btnIns.setOnAction(
        new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                
                VBox dialogVbox = new VBox(20);
                
                Scene dialogScene = new Scene(dialogVbox, 300, 200);
                dialog.setScene(dialogScene);
                dialog.show();
            }
         });
        
        btnExit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                btnExit.setStyle("-fx-background: red");
                System.exit(1);
            }
           
        });
      

        // Add buttons to the grid pane
        for (int rows = 0; rows < Target.ROWS+1; rows++) {
            for (int cols = 0; cols < Target.ROWS+1; cols++) {

                final Button bt = new Button("");
                bt.setStyle("-fx-font: 10 helvetica; -fx-base: turquoise;");
                bt.setPrefWidth(30);
                bt.setPrefHeight(30);

                gPane.add(bt, cols, rows);
                final int row = rows;
                final int col = cols;
                // Create and register the handler
                bt.setOnAction(new EventHandler<ActionEvent>() {
                    @Override 
                    public void handle(ActionEvent e) {
                        
                       
                           bt.setDisable(true);
                           bt.setDisable(true);              
                        
                    }                   
                });  

            }
        }

        // Create a border pane and add the Title Box, Buttons, and 
        // Info Box to it.
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(titleBox);
        borderPane.setCenter(gPane);
        borderPane.setRight(infoBox);
        
        
 
        // Create a scene containing the pane and place it in the stage
        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("BattleShip"); 
        
        // Place the scene in the stage
        primaryStage.setScene(scene); 
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}