package controller;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import tools.Conexao;
//import model.Usuario;

/**
 *
 * @author jonas
 */
public class UsuarioController {

    //Usuario objUsuario;
    //JTable jtbUsuarios = null;
    //public UsuarioController(Usuario objUsuario, JTable jtbUsuarios) {
    //    this.objUsuario = objUsuario;
    //    this.jtbUsuarios = jtbUsuarios;
    //}
    public boolean login(String user, String pass) {
        try {
            Conexao.abreConexao();
            PreparedStatement stmt;
            ResultSet rs;
            
            try {
                String wSql = "SELECT nome FROM usuarios WHERE login = ? AND senha = md5(?)";
                System.out.println("Vai Executar Conexão em buscar Usuario");
                stmt = Conexao.con.prepareStatement(wSql);
                stmt.setString(1, user);
                stmt.setString(2, pass);
                System.out.println("Executou Conexão em buscar Usuario");
                
                rs = stmt.executeQuery();
                
                return rs.next();
                
            } catch (SQLException ex) {
                System.out.println("ERRO de SQL: " + ex.getMessage().toString());
                return false;
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage().toString());
            return false;
        }

    }
}
