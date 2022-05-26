/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Alumno
 */

import java.sql.*;



public class Conexion {
    
    public static Connection getConection(){
        Connection con = null;
        try{
            String url, name, pass;
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://localhost/caly";
            name = "root";
            pass = "alery050831";
            
            con = DriverManager.getConnection(url, name, pass);
            
            
            System.out.println("si se conecto");
            return con;
           
        
        }catch(SQLException sq){
            System.out.println("Error al conectar la BD");
            System.out.println(sq.getMessage());
        }catch(Exception ex){
            System.out.println("Error al no encontrar la clase");
            System.out.println(ex.getMessage());
        
        }
        return null;
    }
    /*
    public static Connection getConection(){
        String url, username, password;
        
        url = "jdbc:mysql://localhost/caly";
        username = "root";
        password = "alery050831";
        
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Se conecto con la BD");
            System.out.println("aaa");
        }catch(Exception e){
            System.out.println("No se conecto con la bd");
            System.out.println(e.getMessage());
            System.out.println("ssss");
        
        }
        return con;
    }*/
}
