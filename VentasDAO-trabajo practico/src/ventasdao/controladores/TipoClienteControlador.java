/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasdao.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import ventasdao.objetos.TipoCliente;

/**
 *
 * @author hchanampe
 */
public class TipoClienteControlador implements ICrud<TipoCliente>{
    private Connection connection;
    
    private Statement stmt;
    
    private PreparedStatement ps;
    
    private ResultSet rs;
    
    private String sql;

    @Override
    public boolean crear(TipoCliente entidad) throws SQLException, Exception {
        return false; 
    }

    @Override
    public boolean eliminar(TipoCliente entidad) throws SQLException, Exception {
        return false;
    }

    @Override
    public TipoCliente extraer(int id) throws SQLException, Exception {
        return null;
    }

    @Override
    public boolean modificar(TipoCliente entidad) throws SQLException, Exception {
        return false;
    }

    @Override
    public List<TipoCliente> listar() throws SQLException, Exception {
        return null;
    }
    
}
