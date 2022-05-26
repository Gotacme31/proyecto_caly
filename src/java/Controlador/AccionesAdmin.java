/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MReporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aly
 */
public class AccionesAdmin {
    public static List<MReporte> getAllReportes(){
        //primero declarar el arraylist
        List<MReporte> lista = new ArrayList<MReporte>();
        
        try{
            //establecer es la conexion
            Connection con = Conexion.getConection();
            
            String q = "select * from mreporte";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                MReporte e = new MReporte();
                e.setDes_report(rs.getString(1));
                e.setHora_report(rs.getString(2));
                e.setComentario(rs.getString(3));
                e.setId_equipo(rs.getInt(4));
                e.setId_priori(rs.getInt(5));
                e.setId_tipreport(rs.getInt(6));
                e.setId_estatus(rs.getInt(7));
                e.setId_usuario(rs.getInt(8));
                e.setId_materia(rs.getInt(9));
                lista.add(e);
            }
            
            System.out.println("Se consulto el reporte");
            con.close();
            
        }catch(Exception ex){
            System.out.println("No se pudo consultar al reporte");
            System.out.println(ex.getMessage());
        }
        return lista;
    }
}
