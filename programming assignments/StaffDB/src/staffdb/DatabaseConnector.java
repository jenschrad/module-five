/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staffdb;
import java.sql.*;
public class DatabaseConnector {
    private String url;
    private String username;
    private String password;
    
    // constructor
    public DatabaseConnector(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
    // method create db
    public int createDatabase() {
        String query = "CREATE DATABASE IF NOT EXISTS Staff;";

        int result;
        // set up connection to db, get ready for statement, run query, close stuff
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(query);
            stmt.close();
            con.close();
        }
        catch(Exception e){
            return -999;
        }
        return result;
    }
    
    // create table
    public int createStaffTable() {
        String query = "CREATE TABLE IF NOT EXISTS staff(";
        query += "id INTEGER PRIMARY KEY AUTO_INCREMENT, ";
        query += "lastName VARCHAR(15), ";
        query += "firstName VARCHAR(15), ";
        query += "mi CHAR(1), ";
        query += "address VARCHAR(20), ";
        query += "city VARCHAR(20), ";
        query += "state VARCHAR(2), ";
        query += "telephone INTEGER, ";
        query += "email VARCHAR(40)); ";


        int result;
        // set up connection to db, get ready for statement, run query, close stuff
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(query);
            stmt.close();
            con.close();
        }
        catch(Exception e){
            return -999;
        }
        return result;
    }
    
    // insert query
    public int insertData(String lastName, String firstName, String mi, String address, String city, String state, int telephone, String email) {
        String query = "INSERT INTO staff(lastName, firstName, mi, address, city, state, telephone, email) VALUES(";
        query += "\"" + lastName + "\", \"" + firstName + "\", \"" + mi + "\", \"" + address + " \", \"" + city+ "\", \""+ state +"\"," + telephone +", \"" + email + "\"); ";
        
                int result;
        // set up connection to db, get ready for statement, run query, close stuff
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(query);
            stmt.close();
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
            return -999;
        }
        return result;
    }
     
}
