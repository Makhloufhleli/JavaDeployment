/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.entities.Comment;

/**
 *
 * @author Makhlouf Helali
 */
public class DAOComments extends DAO<Comment> {

    private Connection connection;

    public DAOComments() {
        this.connection = super.connecter();
    }
    
    
    @Override
    public void create(Comment obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Comment> findAll() {
        ArrayList<Comment> listComments = new ArrayList<Comment>();
        String request = "SELECT * FROM comments";
        
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(request);
            if (stmt.execute(request)) {
                rs = stmt.getResultSet();
                while(rs.next()){
                    int id = rs.getInt("id");
                    String user = rs.getString("myuser");
                    String email = rs.getString("email");
                    String webpage = rs.getString("webpage");
                    Date date = rs.getDate("datum");
                    String summary = rs.getString("summary");
                    String comments = rs.getString("comments");
                    
                    Comment comment = new Comment(id, user, email, webpage, date, summary, comments);
                    listComments.add(comment);
                }
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return listComments;
    }

    @Override
    public void update(Comment obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Comment obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
