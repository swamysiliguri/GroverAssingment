package Grover;
	

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Groverwindow1 extends Application  {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Grover Assignment");
        
        
        Label lbl_name = new Label("Enter Name:");
                
        TextField tf_name =new TextField();
               
        Label lbl_fname = new Label("Father Name:");
                
        TextField tf_fname =new TextField();
        Button btnSubmit = new Button("Submit");
        Button btnClear = new Button("Clear");
        
        Label output_name =new Label();
        Label output_fname =new Label();
        
        GridPane Gpane=new GridPane();
        Gpane.setAlignment(Pos.BASELINE_CENTER);
             
        btnSubmit.setOnAction(value ->  {
           
           output_name.setText("Name:"+ tf_name.getText());
           output_fname.setText("Father Name:"+tf_fname.getText());
        });
        
        btnClear.setOnAction(value ->{
        	output_name.setText("");
        	output_fname.setText("");
        	tf_name.setText("");
        	tf_fname.setText("");
        });

        //HBox hbox = new HBox( lblname, tfname, lblphone, tfmnumber, button, output);
         
        //hbox.setAlignment(Pos.CENTER_RIGHT);
        Scene scene = new Scene(Gpane, 400, 400);
        Gpane.addRow(0,lbl_name,tf_name);
        Gpane.addRow(1,lbl_fname,tf_fname);
        Gpane.addRow(2,btnSubmit,btnClear);
        
        Gpane.addRow(3,output_name);
        Gpane.addRow(4,output_fname);
        
        
        Gpane.setVgap(10);
        Gpane.setHgap(10);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}