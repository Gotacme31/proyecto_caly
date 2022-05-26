/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aly
 */
public class MUsuario {
    private int id_usuario;
    private String nom_usu;
    private String appat_usu; 
    private String apmat_usu;
    private String pass_usu;
    private int id_grupo;
    private int id_rol;
    
    
  
     public MUsuario verificarUsuario(int user, String pass){
        //objeto de la persona
        MUsuario usuario = null;
        //objeto de conexion
        Conexion con = null;
        //Preparacion de la sentencia
        PreparedStatement ps = null;
        //Consultas
        ResultSet rs = null;
        
        try{
            //establecemos la conexion
            con = (Conexion) Conexion.getConection();
            System.out.println("holita");
            String q = "select id_usuario, pass_usu, id_rol" 
                    + "from musuario"
                    + "where id_usuario=?" 
                    + "and pass_usu=?;";
            //preparo la sentencia
            ps.setInt(1, user);
            ps.setString(2, pass);
            //ejecutamos la busqueda
            rs = ps.executeQuery();
            System.out.println("hola");
            //buscamos al usuario
            while(rs.next()){
                usuario = new MUsuario();
                //cprivilegio pri = new cprivilegio();
                
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setPass_usu(rs.getString("pass_usu"));
                usuario.setId_rol(rs.getInt("id_rol"));
                
                //pri.setPrivilegio_tipo(rs.getString("privilegio_tipo"));
                
                break;
            }
        
        }catch(SQLException sq){
            System.out.println("Error al verificar el usuario");
            System.out.println(sq.getMessage());
        
        }finally{
            try{
                //cerrar conexiones
                rs.close();
                ps.close();
            }catch(Exception ex){
            System.out.println("No se encontro ");     
            System.out.println(ex.getMessage());
        }
        }
        return usuario;
   }
    

    
    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getAppat_usu() {
        return appat_usu;
    }

    public void setAppat_usu(String appat_usu) {
        this.appat_usu = appat_usu;
    }

    public String getApmat_usu() {
        return apmat_usu;
    }

    public void setApmat_usu(String apmat_usu) {
        this.apmat_usu = apmat_usu;
    }

    public String getPass_usu() {
        return pass_usu;
    }

    public void setPass_usu(String pass_usu) {
        this.pass_usu = pass_usu;
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
    
    
}
