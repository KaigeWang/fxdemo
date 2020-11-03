import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.*;

import javafx.scene.layout.*;

import javafx.stage.Stage;

import javafx.event.*;

import javafx.geometry.*;



public class CalculateSalary extends Application {

   public void start(Stage primaryStage) {

      GridPane pane = new GridPane();

      pane.setAlignment(Pos.CENTER);

      pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

      pane.setHgap(5.5);

      pane.setVgap(5.5);

      // Place nodes in the pane

      pane.add(new Label("Name: "), 0, 0);

      TextField name = new TextField();

      pane.add(name, 1, 0);

      pane.add(new Label("Hours: "), 0, 1);

      TextField hrs = new TextField("0");

      pane.add(hrs, 1, 1);

      pane.add(new Label("Rate: "), 0, 2);

      TextField rate = new TextField("0");

      pane.add(rate, 1, 2);

      Label results = new Label();

      pane.add(results, 1, 3);   // Label for Printing the Salary

      Button btCalc = new Button("Calculate");

      pane.add(btCalc, 1, 4);

      // write below the code to be inserted here


    	  btCalc.setOnAction(e -> {
    		  try {


	        	  String nameOutput = name.getText();
	              double hours = Double.parseDouble(hrs.getText());
	              double rate1 = Double.parseDouble(rate.getText());
	              if (rate1 < 0) {
	            	  results.setText("Something wrong!");
	              } else if (hours <= 40 && hours >=0 ) {
	    			results.setText("Salary for " + nameOutput + " " + rate1 * hours);
	    		  } else if (hours > 40) {
	        		results.setText("Salary for " + nameOutput + " " + (40 * rate1 + (hours - 40)* rate1 * 1.5) );
	        	  } else {
	        		  results.setText("Something wrong!");
	        	  }

    		  } catch (Exception e1) {
    			  results.setText("Something wrong!");
    		  }

          });





      Scene scene = new Scene(pane);

      primaryStage.setTitle("Calculate Salary");

      primaryStage.setScene(scene);

      primaryStage.show();

   }

   public static void main(String[] args) {
	    launch(args);
	  }

}