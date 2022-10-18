package com.dh.clase22.dao;

import com.dh.clase22.dominio.Entrenador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EntrenadorDAOH2 implements IDao<Entrenador> {

    @Override
    public List<Entrenador> listarTodos() {
        Connection connection=null;
        List<Entrenador> listadoEntrenadores= new ArrayList<>();
        try{
            connection=getConnection();
            PreparedStatement ps=connection.prepareStatement("SELECT * " +
                    "FROM ENTRENADORES");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                listadoEntrenadores.add(new Entrenador(rs.getInt(1),
                        rs.getString(2)));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return listadoEntrenadores;

    }
    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/cam9clase22",
                "sa","sa");
    }
}
