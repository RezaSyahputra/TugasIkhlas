/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.blits.tugasrezasyahputra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Koneksi {
    
   public Statement state;
    public Connection connect;
    public String url = "jdbc:mysql://localhost/db_tugas";
    
    public void koneksiDatabase() {
        try {
             connect = DriverManager.getConnection(url,"root","qwerty");//nama database, username database, password database
            System.out.println("Koneksi Berhasil");
            state = connect.createStatement();
        } catch (SQLException ex) {
             System.err.println("SQLException:"+ex.getMessage());
        }
    }
}
