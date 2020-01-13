/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seproject1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class Seproject1 extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        
       GridPane grid = new GridPane();
       grid.setPadding(new Insets(10, 10, 10, 10));
       grid.setVgap(8);
       grid.setHgap(10);
       
       Label userName = new Label("Name");
       grid.add(userName, 0 ,1);
       
       TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        
        Label emailName = new Label("Email:");
        grid.add(emailName, 0, 2);

        TextField emailTextField = new TextField();
        grid.add(emailTextField, 1, 2);
        
         Label batch = new Label("Batch :");
        grid.add(batch, 0, 3);
        
         ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.getItems().addAll("Select One", "BSSE09", "BSSE10", "BSSE11", "BSSE12");
        choiceBox.setValue("Select One");
        grid.add(choiceBox, 1, 3);
        
        Label genderOption = new Label();
        genderOption.setText("Gender: ");
        grid.add(genderOption, 0, 4);

         RadioButton radioButton1 = new RadioButton("Male");
        RadioButton radioButton2 = new RadioButton("Female");
        grid.add(radioButton1, 1, 4);
        grid.add(radioButton2, 2, 4);
        
        ToggleGroup group = new ToggleGroup();
        radioButton1.setToggleGroup(group);
        radioButton2.setToggleGroup(group);
        
        Label about = new Label();
        about.setText("About: ");
        grid.add(about, 0, 5);
        
        TextField aboutTextField = new TextField();
        aboutTextField.setPrefSize(50, 150);
        grid.add(aboutTextField, 1, 5);
        
         Button clear = new Button();
        Button ok = new Button();
        Button cancel = new Button();
        clear.setText("Clear");
        ok.setText("Okay");
        cancel.setText("Cancel");
        
        cancel.setOnAction(e -> {
        System.exit(0);
        
        });

        grid.add(clear, 1, 11);
        grid.add(ok, 2, 11);
        grid.add(cancel, 0, 11);
        Scene scene1 = new Scene(grid, 400, 350);

        primaryStage.setTitle("IIT");
        primaryStage.setScene(scene1);
        primaryStage.show();
        
        
    }

    /**
     * @param args the command line arguments
     */
   
    
}
