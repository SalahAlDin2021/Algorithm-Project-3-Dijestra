package application;


import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public class Controller implements Initializable{
	@FXML
	ComboBox<String> source;
	@FXML
	ComboBox<String> target;
	@FXML
	TextArea path;
	@FXML
	TextArea distance;
	@FXML
	AnchorPane pane;
	@FXML
	ArrayList<Vertix> cit=new ArrayList<>();
	public void run(ActionEvent event) {
		
	}
	
	
	private static ObservableList<String> cities;
	//FXCollections.observableArrayList("Play With Friend","Easy(Rndom Moves)"," Impossible(Min-Max Algorithm)");
	@Override
	public void initialize(URL arg0, ResourceBundle arg1){
		try {
			readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	Graph g=new Graph();
	ArrayList<Button> rbs=new ArrayList<>();
	void readFile() throws FileNotFoundException {
		File file = new File("C:\\Users\\hp\\Desktop\\new java2\\AlgorithmPrj3\\src\\application\\palestine.txt");
		Scanner sc=new Scanner(file);
		String c2=sc.nextLine();
		String[] inf2=c2.split(" ");
		int nVer=Integer.parseInt(inf2[0]);
		int nEdg=Integer.parseInt(inf2[1]);
		for(int i =0;i<nVer;i++) {
			String c=sc.nextLine();
			String[] inf=c.split(" ");
			Vertix ver=new Vertix(inf[0], Double.parseDouble(inf[2]), Double.parseDouble(inf[1]));
			addRbutton(ver);
			g.addVertix(inf[0], Double.parseDouble(inf[2]), Double.parseDouble(inf[1]));
			cit.add(ver);
		}
		for(int i =0;i<nEdg;i++) {
			String c=sc.nextLine();
			String[] inf=c.split(" ");
			
		}
		
	}
	int n;
	void addRbutton(Vertix v){
		RadioButton rb=new RadioButton();
		rb.setLayoutX(((v.getLongitude()-34)+0.5)*120);
		rb.setLayoutY((2.3-(v.getLatitude()-31))*170);
		rb.setText(v.getName());
		rb.setFont(new Font(12));
		rb.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    	
		        rb.setDisable(true);
		        n++;
		        if(n==2) {
		        	String v1,v2;int k=0;
		    		for(int i=0;i<rbs.size();i++) {
		    			if(rbs.get(i).isDisable()) {
		    				if(k==0){
		    					v1=rbs.get(i).getText();
		    				}else {
		    					v2=rbs.get(i).getText();
		    				}
		    			}
		    			//rbs.get(i).setDisable(true);
		    		}
		    		//Here set Code of Dijestra
		    		}
		    }
		});
		pane.getChildren().add(rb);
		//rbs.add(rb);
	}
	/*Vertex find(String name) {
		for(int i=0;i<cit.size();i++) {
			if(cit.get(i).getName()==name)return cit.get(i)
		}
		return null; 
	}*/
	
	

}
