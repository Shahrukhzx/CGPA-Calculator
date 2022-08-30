package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Methods {

		public void Courses(ComboBox cb) {
			
		    cb.setPromptText("Select Course");
		    cb.getItems().add("ENG102");
			cb.getItems().add("ENG103");
			cb.getItems().add("ENG111");
			cb.getItems().add("PHI101");
			cb.getItems().add("PHI104");
			cb.getItems().add("LBA101");	
			cb.getItems().add("LBA102");
			cb.getItems().add("POL101");
			cb.getItems().add("POL104");
			cb.getItems().add("ECO101");
			cb.getItems().add("ECO104");
			cb.getItems().add("SOC101");
			cb.getItems().add("ENV203");
			cb.getItems().add("GEO205");
			cb.getItems().add("ANT101");
			cb.getItems().add("BIO103");
			cb.getItems().add("BIO103L");
			cb.getItems().add("MAT116");
			cb.getItems().add("MAT120");		
			cb.getItems().add("MAT125");
			cb.getItems().add("MAT130");
			cb.getItems().add("MAT250");	
			cb.getItems().add("MAT350");
			cb.getItems().add("MAT361");
			cb.getItems().add("PHY107");
			cb.getItems().add("PHY107L");		
			cb.getItems().add("PHY108");
			cb.getItems().add("PHY108L");
			cb.getItems().add("CHE101");
			cb.getItems().add("CHE101L");
			cb.getItems().add("EEE452");
			cb.getItems().add("CEE110");		
			cb.getItems().add("CSE115");
			cb.getItems().add("CSE115L");
			cb.getItems().add("CSE173");
			cb.getItems().add("CSE215");
			cb.getItems().add("CSE215L");
			cb.getItems().add("CSE225");	
			cb.getItems().add("CSE225L");
			cb.getItems().add("CSE231");
			cb.getItems().add("CSE231L");
			cb.getItems().add("CSE299");
			cb.getItems().add("CSE311");
			cb.getItems().add("CSE311L");
			cb.getItems().add("CSE323");
			cb.getItems().add("CSE325");
			cb.getItems().add("CSE327");
			cb.getItems().add("CSE331");
			cb.getItems().add("CSE331L");
			cb.getItems().add("CSE332");
			cb.getItems().add("CSE373");		
			cb.getItems().add("CSE498");
			cb.getItems().add("CSE499A");
			cb.getItems().add("CSE499B");		
			cb.getItems().add("CSE401");
			cb.getItems().add("CSE417");
			cb.getItems().add("CSE418");
			cb.getItems().add("CSE426");
			cb.getItems().add("CSE473");
			cb.getItems().add("CSE491");		
			cb.getItems().add("CSE411");
			cb.getItems().add("CSE424");
			cb.getItems().add("CSE427");
			cb.getItems().add("CSE428");		
			cb.getItems().add("CSE429");
			cb.getItems().add("CSE422");		
			cb.getItems().add("CSE438");
			cb.getItems().add("CSE482");
			cb.getItems().add("CSE485");		
			cb.getItems().add("CSE486");
			cb.getItems().add("CSE493");
			cb.getItems().add("CSE433");
			cb.getItems().add("CSE435");
			cb.getItems().add("CSE413");
			cb.getItems().add("CSE414");		
			cb.getItems().add("CSE494");
			cb.getItems().add("CSE419");
			cb.getItems().add("CSE440");
			cb.getItems().add("CSE445");
			cb.getItems().add("CSE465");
			cb.getItems().add("CSE467");		
			cb.getItems().add("CSE468");
			cb.getItems().add("CSE470");		
			cb.getItems().add("CSE495");
			cb.getItems().add("CSE446");
			cb.getItems().add("CSE447");		
			cb.getItems().add("CSE448");
			cb.getItems().add("CSE449");
			cb.getItems().add("CSE496");

		}
		public void Credits(ComboBox cb) {
			
	    cb.setPromptText("Select Credits");
	    cb.getItems().add("0");
		cb.getItems().add("1");
		cb.getItems().add("1.5");
		cb.getItems().add("3");
		}
		public void Grades(ComboBox cb) {		
			
	    cb.setPromptText("Select Grade");
	    cb.getItems().add("A");
		cb.getItems().add("A-");
		cb.getItems().add("B+");
		cb.getItems().add("B");
		cb.getItems().add("B-");
		cb.getItems().add("C+");
		cb.getItems().add("C");
		cb.getItems().add("C-");
		cb.getItems().add("D+");
		cb.getItems().add("D");
		cb.getItems().add("F");
		}
		
		public  void SelectedItems(ComboBox cb11,ComboBox cb12,ComboBox cb13,ComboBox cb21,ComboBox cb22,ComboBox cb23,ComboBox cb31,ComboBox cb32,ComboBox cb33,ComboBox cb41,ComboBox cb42,ComboBox cb43,ComboBox cb51,ComboBox cb52,ComboBox cb53) throws IOException {
			Object[] selectedCourse= {cb11.getSelectionModel().getSelectedItem(),cb21.getSelectionModel().getSelectedItem(),cb31.getSelectionModel().getSelectedItem(),cb41.getSelectionModel().getSelectedItem(),cb51.getSelectionModel().getSelectedItem()};
			Object[] selectedCredit= {cb12.getSelectionModel().getSelectedItem(),cb22.getSelectionModel().getSelectedItem(),cb32.getSelectionModel().getSelectedItem(),cb42.getSelectionModel().getSelectedItem(),cb52.getSelectionModel().getSelectedItem()};
			Object[] selectedGrade= {cb13.getSelectionModel().getSelectedItem(),cb23.getSelectionModel().getSelectedItem(),cb33.getSelectionModel().getSelectedItem(),cb43.getSelectionModel().getSelectedItem(),cb53.getSelectionModel().getSelectedItem()};			
			File f = new File("Info.txt");
		    f.createNewFile();
			FileWriter fw = new FileWriter("Info.txt");
			for(int i =0;i<selectedCourse.length;i++) {
				fw.write(selectedCourse[i]+" "+selectedCredit[i]+" "+selectedGrade[i]+"\n");
			}
			fw.close();
			
		}
		public void Display(String name,String id,ComboBox cb12,ComboBox cb13,ComboBox cb22,ComboBox cb23,ComboBox cb32,ComboBox cb33,ComboBox cb42,ComboBox cb43,ComboBox cb52,ComboBox cb53) throws FileNotFoundException{
			
			double totalCredits=0;
			double sum=0;
			double[] selectedCredit= {Double.parseDouble((String) cb12.getSelectionModel().getSelectedItem()),Double.parseDouble((String) cb22.getSelectionModel().getSelectedItem()),Double.parseDouble((String) cb32.getSelectionModel().getSelectedItem()),Double.parseDouble((String) cb42.getSelectionModel().getSelectedItem()),Double.parseDouble((String) cb52.getSelectionModel().getSelectedItem())};
			Object[] selectedGrade= {cb13.getSelectionModel().getSelectedItem(),cb23.getSelectionModel().getSelectedItem(),cb33.getSelectionModel().getSelectedItem(),cb43.getSelectionModel().getSelectedItem(),cb53.getSelectionModel().getSelectedItem()};
			double[] selectedGradePoints= new double[selectedGrade.length];
			for(int i =0;i<selectedCredit.length;i++) {
				totalCredits+=selectedCredit[i];
			}
			for(int i=0;i<selectedGrade.length;i++) {
				if(selectedGrade[i]=="A") {
					selectedGradePoints[i]=4.00;	
				}
				else if(selectedGrade[i]=="A-") {
					selectedGradePoints[i]=3.7;	
				}
				else if(selectedGrade[i]=="B+") {
					selectedGradePoints[i]=3.33;	
				}
				else if(selectedGrade[i]=="B") {
					selectedGradePoints[i]=3.00;	
				}
				else if(selectedGrade[i]=="B-") {
					selectedGradePoints[i]=2.7;	
				}
				else if(selectedGrade[i]=="C+") {
					selectedGradePoints[i]=2.33;	
				}
				else if(selectedGrade[i]=="C") {
					selectedGradePoints[i]=2.00;	
				}								
				else if(selectedGrade[i]=="C-") {
					selectedGradePoints[i]=1.7;	
				}
				else if(selectedGrade[i]=="D+") {
					selectedGradePoints[i]=1.3;	
				}
				else if(selectedGrade[i]=="D") {
					selectedGradePoints[i]=1.00;	
				}
				else if(selectedGrade[i]=="F") {
					selectedGradePoints[i]=0.00;	
				}
			
			}
			for(int i = 0 ; i<selectedCredit.length;i++) {
				sum+=selectedCredit[i]*selectedGradePoints[i];
			}
			double result = sum/totalCredits;
			
			FileReader fr = new FileReader("Info.txt");
			Scanner in = new Scanner(fr);
			ArrayList<String>selectedCourse=new ArrayList<String>();
			ArrayList<String>selectedCredits=new ArrayList<String>();
			ArrayList<String>selectedGrades=new ArrayList<String>();
			while(in.hasNext()){
				selectedCourse.add(in.next());
				selectedCredits.add(in.next());
				selectedGrades.add(in.next());
			}
			
			Label lb1 = new Label("CGPA");
			lb1.setFont(Font.font("Verdana",FontWeight.BOLD,30));
			lb1.setAlignment(Pos.CENTER);
			Label lb2 = new Label("Name : "+name);
			lb2.setFont(Font.font("Verdana",FontWeight.BOLD,20));
			Label lb3 = new Label("ID : "+id);
			lb3.setFont(Font.font("Verdana",FontWeight.BOLD,20));
			HBox hb1 = new HBox(lb1);
			hb1.setAlignment(Pos.CENTER);
			HBox hb2 = new HBox(50,lb2,lb3);
			hb2.setAlignment(Pos.CENTER);		
			Label lb4 = new Label("...............................................................................................................................................................................");			
			Label lb5 = new Label("Course");
			lb5.setFont(Font.font("Verdana",FontWeight.BOLD,20));
			Label lb6 = new Label("Credits");
			lb6.setFont(Font.font("Verdana",FontWeight.BOLD,20));
			Label lb7 = new Label("Grade");
			lb7.setFont(Font.font("Verdana",FontWeight.BOLD,20));		        			
			Label lb = new Label("       ");
			Label lb8 = new Label("Course - 1 :");
			lb8.setFont(Font.font("Verdana",FontWeight.BOLD,17));
			Label lb9 = new Label("  "+selectedCourse.get(0));
			Label lb10 = new Label("       "+selectedCredits.get(0));
			Label lb11 = new Label("     "+selectedGrades.get(0));	
			Label lb12 = new Label("Course - 2 :");
			lb12.setFont(Font.font("Verdana",FontWeight.BOLD,17));
			Label lb13 = new Label("  "+selectedCourse.get(1)+"  ");
			Label lb14 = new Label("       "+selectedCredits.get(1)+"   ");
			Label lb15 = new Label("     "+selectedGrades.get(1)+"   ");		
			Label lb16 = new Label("Course - 3 :");
			lb16.setFont(Font.font("Verdana",FontWeight.BOLD,17));
			Label lb17 = new Label("  "+selectedCourse.get(2)+"  ");
			Label lb18 = new Label("       "+selectedCredits.get(2)+"   ");
			Label lb19 = new Label("     "+selectedGrades.get(2)+"   ");		
			Label lb20 = new Label("Course - 4 :");	
			lb20.setFont(Font.font("Verdana",FontWeight.BOLD,17));
			Label lb21 = new Label("  "+selectedCourse.get(3)+"  ");
			Label lb22 = new Label("       "+selectedCredits.get(3)+"   ");
			Label lb23 = new Label("     "+selectedGrades.get(3)+"   ");
			Label lb24 = new Label("Course - 5 :");
			lb24.setFont(Font.font("Verdana",FontWeight.BOLD,17));
			Label lb25 = new Label("  "+selectedCourse.get(4)+"  ");
			Label lb26 = new Label("       "+selectedCredits.get(4)+"   ");
			Label lb27 = new Label("     "+selectedGrades.get(4));

			VBox vb = new VBox(20,lb,lb8,lb12,lb16,lb20,lb24);
			VBox vb2 = new VBox(20,lb5,lb9,lb13,lb17,lb21,lb25);
			VBox vb3 = new VBox(20,lb6,lb10,lb14,lb18,lb22,lb26);
			VBox vb4 = new VBox(20,lb7,lb11,lb15,lb19,lb23,lb27);
			HBox hb4 = new HBox(50,vb,vb2,vb3,vb4);
			hb4.setAlignment(Pos.CENTER);
			
			Label lb28 = new Label("...............................................................................................................................................................................");
			DecimalFormat df = new DecimalFormat(".##");
			Label lb29 = new Label("Your Cgpa :");
			Label lb30 = new Label(df.format(result));
			lb29.setFont(Font.font("Verdana",FontWeight.BOLD,30));
			lb30.setFont(Font.font("Verdana",FontWeight.BOLD,30));
			lb29.setAlignment(Pos.CENTER);
			lb30.setAlignment(Pos.CENTER);
			VBox vb5 = new VBox(20,lb1,hb2,lb4,hb4,lb28,lb29,lb30);
			vb5.setAlignment(Pos.CENTER);
		
			Scene scene = new Scene(vb5,800,800);			
			Stage primaryStage = new Stage();
			primaryStage.setTitle("Your Cgpa");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}

	}

