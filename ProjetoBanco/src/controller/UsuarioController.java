package controller;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
                String wSql = "SELECT nome FROM usuario WHERE usuario.user = ? AND senha = md5(md5(?))";
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
