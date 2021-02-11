/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import model.entities.Comment;

/**
 *
 * @author Makhlouf Helali
 */
public class MainView {
    
    private Button btnShowComments = new Button("Show Comments");
    private VBox  data = new VBox();

    public void showButton(BorderPane root){
        HBox line = new HBox();
        final Pane spacer = new Pane();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        spacer.prefWidthProperty().bind(root.widthProperty().divide(2));
        line.getChildren().addAll(spacer, btnShowComments);
        root.setTop(line);
    }
    
    public void showComments(BorderPane root, ArrayList<Comment> listComments){
        data.prefWidthProperty().bind(root.widthProperty().divide(4));
        
       
        listComments.forEach(comment->{
            
            Label labelUser = new Label("User: ");
            labelUser.setStyle("-fx-font: 12 Verdana; -fx-text-fill: blue;");
            HBox userBox = new HBox(labelUser, new Label(comment.getMyUser()));
            
            Label labelEmail = new Label("Email: ");
            labelEmail.setStyle("-fx-font: 12 Verdana; -fx-text-fill: blue;");
            HBox emailBox = new HBox(labelEmail, new Label(comment.getEmail()));

            Label labelWebPage = new Label("WebPage: ");
            labelWebPage.setStyle("-fx-font: 12 Verdana; -fx-text-fill: blue;");
            HBox webPageBox = new HBox(labelWebPage, new Label(comment.getWebPage()));

            Label labelDate = new Label("Date: ");
            labelDate.setStyle("-fx-font: 12 Verdana; -fx-text-fill: blue;");
            HBox dateBox = new HBox(labelDate, new Label(comment.getDate().toString()));

            Label labelSummary = new Label("Summary: ");
            labelSummary.setStyle("-fx-font: 12 Verdana; -fx-text-fill: blue;");
            HBox summaryBox = new HBox(labelSummary, new Label(comment.getSummary()));
            
            Label labelComments = new Label("Comments: ");
            labelComments.setStyle("-fx-font: 12 Verdana; -fx-text-fill: blue;");
            HBox comentsBox = new HBox(labelComments, new Label(comment.getComments()));
            
            data.getChildren().addAll(userBox, emailBox, webPageBox, dateBox, summaryBox, new Separator());
            
            
            
        });
        root.setCenter(data);
    }
    
    public Button getBtnShowComments() {
        return btnShowComments;
    }
    
}
