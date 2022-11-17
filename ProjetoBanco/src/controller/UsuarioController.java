package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.Usuario;
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
                String wSql = "SELECT nome FROM usuario WHERE login = ? AND senha = md5(md5(?))";
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

    public boolean incluir(Usuario objUsuario) {

        try {
            Conexao.abreConexao();
            PreparedStatement stmt = null;

            stmt = Conexao.con.prepareStatement("INSERT INTO usuario (nome, login, senha, telefone) VALUES(?,?,md5(md5(?)),?)");
            stmt.setString(1, objUsuario.getNome());
            stmt.setString(2, objUsuario.getUser());
            stmt.setString(3, objUsuario.getPass());
            stmt.setString(4, objUsuario.getTelefone());

            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            Conexao.closeConnection(Conexao.con);
        }

    }
    
    public Usuario buscar(int id)
    {
        try {
            Usuario objUsuario = null;
            
            Conexao.abreConexao();
            ResultSet rs = null;
            PreparedStatement stmt;

            String wSql = "";
            wSql = " SELECT * ";
            wSql += " FROM usuarios ";
            wSql += " WHERE id = ? ";

            try{
                System.out.println("Vai Executar Conexão em buscar Usuario");
                stmt = Conexao.con.prepareStatement(wSql);
                stmt.setInt(1, id);

                rs = stmt.executeQuery();
                
                if(rs.next()){
                    objUsuario = new Usuario();
                    objUsuario.setId(rs.getInt("id"));
                    objUsuario.setNome(rs.getString("nome"));
                    objUsuario.setTelefone(rs.getString("telefone"));
                    objUsuario.setUser(rs.getString("usuario"));
                    objUsuario.setPass(rs.getString("senha"));
                    
                    objUsuario.setId(rs.getInt("id"));
                    return objUsuario;
                }
                
            }catch (SQLException ex )
            {
                System.out.println("ERRO de SQL: " + ex.getMessage().toString());
                return null;
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage().toString());
            return null;
        }
        
        return null;
		
    }
}
