package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Methods obj = new Methods();
		Label lb1 = new Label("Cgpa Calculator");
		lb1.setFont(Font.font("Verdana",FontWeight.BOLD,30));
		Label lb2 = new Label("Name : ");
		Label lb3 = new Label("ID : ");
		TextField tf1=new TextField();  
		TextField tf2=new  TextField();  		
		HBox hb1 = new HBox(10,lb1);
	    HBox hb2 = new HBox(10,lb2,tf1);
	    HBox hb3 = new HBox(10,lb3,tf2);
	    HBox hb4 = new HBox(50,hb2,hb3);
	    Label lb4 = new Label("....................................................................................................................................................................................................................................................");
	    hb1.setAlignment(Pos.CENTER);
	    hb4.setAlignment(Pos.CENTER);
	    Label lb5 = new Label("	Course");
		lb5.setFont(Font.font(" Verdana",FontWeight.BOLD,20));
		Label lb6 = new Label("	Credits");
		lb6.setFont(Font.font(" Verdana",FontWeight.BOLD,20));
		Label lb7 = new Label("	Grade");
		lb7.setFont(Font.font(" Verdana",FontWeight.BOLD,20));			
		Label lb = new Label("       ");
		Label lb8 = new Label("Course - 1 :");
		lb8.setFont(Font.font("Verdana",FontWeight.BOLD,17));
		ComboBox cb11 = new ComboBox();
		ComboBox cb12 = new ComboBox();
		ComboBox cb13 = new ComboBox();
		obj.Courses(cb11);
		obj.Credits(cb12);
		obj.Grades(cb13);
		Label lb9 = new Label("Course - 2 :");
		lb9.setFont(Font.font("Verdana",FontWeight.BOLD,17));
		ComboBox cb21 = new ComboBox();
		ComboBox cb22 = new ComboBox();
		ComboBox cb23 = new ComboBox();
		obj.Courses(cb21);
		obj.Credits(cb22);
		obj.Grades(cb23);
		Label lb10 = new Label("Course - 3 :");
		lb10.setFont(Font.font("Verdana",FontWeight.BOLD,17));
		ComboBox cb31 = new ComboBox();
		ComboBox cb32 = new ComboBox();
		ComboBox cb33 = new ComboBox();
		obj.Courses(cb31);
		obj.Credits(cb32);
		obj.Grades(cb33);
		Label lb11 = new Label("Course - 4 :");
		lb11.setFont(Font.font("Verdana",FontWeight.BOLD,17));
		ComboBox cb41 = new ComboBox();
		ComboBox cb42 = new ComboBox();
		ComboBox cb43 = new ComboBox();
		obj.Courses(cb41);
		obj.Credits(cb42);
		obj.Grades(cb43);
		Label lb12 = new Label("Course - 5 :");
		lb12.setFont(Font.font("Verdana",FontWeight.BOLD,17));
		ComboBox cb51 = new ComboBox();
		ComboBox cb52 = new ComboBox();
		ComboBox cb53 = new ComboBox();
		obj.Courses(cb51);
		obj.Credits(cb52);
		obj.Grades(cb53);    
		VBox vb = new VBox(30,lb,lb8,lb9,lb10,lb11,lb12);
		VBox vb2 = new VBox(20,lb5,cb11,cb21,cb31,cb41,cb51);
		VBox vb3 = new VBox(20,lb6,cb12,cb22,cb32,cb42,cb52);
		VBox vb4 = new VBox(20,lb7,cb13,cb23,cb33,cb43,cb53);
		HBox hb5 = new HBox(50,vb,vb2,vb3,vb4);
		hb5.setAlignment(Pos.CENTER);		
	    Label lb13 = new Label("....................................................................................................................................................................................................................................................");
	    Button btn = new Button("Calculate"); 
	    btn.setFont(Font.font(30));
	    btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String name = tf1.getText();
				String id = tf2.getText();	
				try {
					obj.SelectedItems(cb11, cb12, cb13, cb21, cb22, cb23, cb31, cb32, cb33, cb41, cb42, cb43, cb51, cb52, cb53);
					obj.Display(name,id,cb12, cb13, cb22, cb23, cb32, cb33, cb42, cb43, cb52, cb53);
				} catch (IOException e) {				
					e.printStackTrace();
				}
				
			}
		});
	    HBox hb11 = new HBox(btn);
	    hb11.setAlignment(Pos.CENTER);
	    VBox vb5 = new VBox(30,hb1,hb4,lb4,hb5,lb13,hb11);
	    vb5.setAlignment(Pos.CENTER);
	    Scene scene = new Scene(vb5,800,800);
	    primaryStage.setTitle("Cgpa Calculator");
	    primaryStage.setScene(scene);
	    primaryStage.show(); 
	}

	public static void main(String[] args) {
		launch(args);
	}
}
