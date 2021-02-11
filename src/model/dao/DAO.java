/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Makhlouf Helali
 */
public abstract class DAO<T> {
    private Connection connection;
    
    public Connection connecter(){
        connection = DbConnection.getInstance();
        return connection;
    }
    
    public abstract void create(T obj);
    public abstract List<T> findAll();
    public abstract void update(T obj);
    public abstract void delete(T obj);
    
}
