/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staffdb;

import java.sql.*;

public class StaffDB {

    private static final String serverURL = "jdbc:mysql://localhost:3306";
    private static final String url = "jdbc:mysql://localhost:3306/staff";
    private static String username = "root";
    private static String password = "";
    


    public static void main(String[] args) {
        DatabaseConnector initialConnector = new DatabaseConnector(serverURL, username, password);
        int result = initialConnector.createDatabase();
        System.out.println(result);
        
        DatabaseConnector normalConnector = new DatabaseConnector(url, username, password);
        result = normalConnector.createStaffTable();
        System.out.println(result);
        
        Record[] data ={
            new Record("Smith", "Larry", "M", "1700 Nowhere St", "Place", "NW", 1234567890, "larry@smith.com"),
            new Record("Park", "Mandy", "R", "1978 Somewhere Ave", "Place", "NW", 1238906789, "mandy@park.com"),
            new Record("Poppins", "Mary", "P", "1345 Nowhere St", "Place", "NW", 1234237896, "mary@pop.com"),
            new Record("Lane", "Mark", "L", "1012 Somewhere Ave", "Place", "NW", 1238975674, "mark@lane.com"),
        };
        
        result = 0;
        for(Record r : data) {
            result += normalConnector.insertData(r.getLastName(), r.getFirstName(), r.getMi(), r.getAddress(), r.getCity(), r.getState(), r.getTelephone(), r.getEmail());
        }
        System.out.println(result);
    }
    
}
