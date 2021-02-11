/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadeployment;

import controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Makhlouf Helali
 */
public class JavaDeployment extends Application {
    
    private BorderPane root = new BorderPane();
    private MainController mainController = new MainController(root);
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Comments Example");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        mainController.showComments();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
