/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import model.dao.DAOComments;
import model.entities.Comment;
import view.MainView;

/**
 *
 * @author Makhlouf Helali
 */
public class MainController {
    /**
     * container will passed as argument in the constructor
     */
    private BorderPane root;
    
    /**
     * view connection
     */
    private MainView mainView = new MainView();

    /**
     * Business Object connection
     */
    private DAOComments daoComments = new DAOComments();
    
    
    /**
     * Constructor
     * @param root 
     */
    public MainController(BorderPane root) {
        this.root = root;
    }
    
    /**
     * Control method
     */
    public void showComments(){
        mainView.showButton(root);
        ArrayList<Comment> listComments = daoComments.findAll();
        Button btnShowComments = mainView.getBtnShowComments();
        
        btnShowComments.setOnAction(click->{
            mainView.showComments(root, listComments);
        });
    }
    
    
    
}
