/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.sql.Date;

/**
 *
 * @author Makhlouf Helali
 */
public class Comment {
    
    /**
     * Attributes
     * these proprieties must be the same as the table columns in tha database
     */
    private int id;
    private String myUser;
    private String email;
    private String webPage;
    private Date date;
    private String summary;
    private String comments;

    /**
     * Constructor with arguments
     * @param id
     * @param myUser
     * @param email
     * @param webPage
     * @param date
     * @param summary
     * @param comments 
     */
    public Comment(int id, String myUser, String email, String webPage, Date date, String summary, String comments) {
        this.id = id;
        this.myUser = myUser;
        this.email = email;
        this.webPage = webPage;
        this.date = date;
        this.summary = summary;
        this.comments = comments;
    }

    /**
     * Constructor //without arguments
     */
    public Comment() {
    }

    /**
     * toString
     * @return 
     */
    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", myUser=" + myUser + ", email=" + email + ", webPage=" + webPage + ", date=" + date + ", summary=" + summary + ", comments=" + comments + '}';
    }
    
    

    
    /**
     * Getters & Setters
     * @return 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMyUser() {
        return myUser;
    }

    public void setMyUser(String myUser) {
        this.myUser = myUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
}
