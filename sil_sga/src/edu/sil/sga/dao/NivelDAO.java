/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.sil.sga.dao;

import edu.sil.sga.entidades.Nivel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Cesar Lopez
 */
public class NivelDAO {
    
    public boolean RegistrarEspecialidad(Nivel nivel)throws SQLException{
            boolean retornar = false;
            try {
                Connection con = Conexion.getConnection();
                PreparedStatement pstm = con.prepareStatement("INSERT INTO nivelEducacion (id,nombreCorto,nombreLargo)"
                        + " values (sq_especialidad.NEXTVAL, ?, ? ) ");
                pstm.setString(1, nivel.getNombreCorto());
                pstm.setString(2, nivel.getNombreLargo());
                pstm.execute();
                pstm.close();
                con.close();
                retornar = true;
            } catch (Exception e) {
                System.out.println(" error --> DAO --> Nivel --> registrar ");
                e.printStackTrace();
            }
            return retornar;
        }
    
    
    public boolean ActualizarEspecialidad(Nivel nivel)throws SQLException{
        boolean retornar = false;
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement("UPDATE nivelEducacion "
                    + " SET nombreCorto = ? , nombreLargo = ? WHERE id = ? ");
            pstm.setString(1, nivel.getNombreCorto());
            pstm.setString(2, nivel.getNombreLargo());
            pstm.setInt(3, nivel.getId());
            pstm.execute();
            pstm.close();
            con.close();
            retornar = true;
        } catch (Exception e) {
            System.out.println(" error --> DAO --> Nivel --> actualizar ");
            e.printStackTrace();
        }
        return retornar;
    }
    
    public boolean EliminarEspecialidad(Nivel nivel)throws SQLException{
        boolean retornar = false;
        try {
            Connection con = Conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement("DELETE FROM nivelEducacion WHERE id = ? ");
            pstm.setInt(1, nivel.getId());
            pstm.execute();
            pstm.close();
            con.close();
            retornar = true;
        } catch (Exception e) {
            System.out.println(" error --> DAO --> Nivel --> eliminar  ");
            e.printStackTrace();
        }
        return retornar;
    }
    
    public List<Nivel>ListarEspecialidad(){
        List<Nivel> listarNivel = new ArrayList<>();
        try {
            Connection con  = Conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement(
            " select * from nivelEducacion");
            ResultSet rst = pstm.executeQuery();
            while (rst.next()) {
                Nivel nivel = new Nivel();
                nivel.setId(rst.getInt("id"));
                nivel.setNombreCorto(rst.getString("nombre"));
                nivel.setNombreLargo(rst.getString("apellidopaterno"));
                
                listarNivel.add(nivel);
            }
            pstm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listarNivel;
    }
    
    
    
}