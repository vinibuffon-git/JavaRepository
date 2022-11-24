package controller;

import java.awt.Color;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import models.Usuario;
import tools.Conexao;

public class UsuarioController {

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

    public Usuario buscar(int id) {
        try {
            Usuario objUsuario = null;

            Conexao.abreConexao();
            ResultSet rs = null;
            PreparedStatement stmt;

            String wSql = "";
            wSql = " SELECT * ";
            wSql += " FROM usuario ";
            wSql += " WHERE id = ? ";

            try {
                System.out.println("Vai Executar Conexão em buscar Usuario");
                stmt = Conexao.con.prepareStatement(wSql);
                stmt.setInt(1, id);

                rs = stmt.executeQuery();

                if (rs.next()) {
                    objUsuario = new Usuario();
                    objUsuario.setId(rs.getInt("id"));
                    objUsuario.setNome(rs.getString("nome"));
                    objUsuario.setTelefone(rs.getString("telefone"));
                    objUsuario.setUser(rs.getString("login"));
                    objUsuario.setPass(rs.getString("senha"));

                    objUsuario.setId(rs.getInt("id"));
                    return objUsuario;
                }

            } catch (SQLException ex) {
                System.out.println("ERRO de SQL: " + ex.getMessage().toString());
                return null;
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage().toString());
            return null;
        }

        return null;

    }

    public void preencherLista(JTable jtbUsuarios) {

        Vector<String> cabecalhos = new Vector<String>();
        Vector dadosTabela = new Vector();
        cabecalhos.add("Id");
        cabecalhos.add("Nome");
        cabecalhos.add(" ");

        Conexao.abreConexao();
        ResultSet result = null;

        try {

            String sql = "";
            sql = "SELECT id, nome ";
            sql += " FROM usuario ";
            sql += " ORDER BY nome ";

            result = Conexao.stmt.executeQuery(sql);

            while (result.next()) {
                Vector<Object> linha = new Vector<Object>();
                linha.add(result.getInt(1));
                linha.add(result.getString(2));
                linha.add("X");
                dadosTabela.add(linha);
            }

        } catch (SQLException e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        jtbUsuarios.setModel(new DefaultTableModel(dadosTabela, cabecalhos) {

            public boolean isCellEditable(int row, int column) {
                return false;
            }

        });

        // permite seleção de apenas uma linha da tabela
        jtbUsuarios.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < 3; i++) {
            column = jtbUsuarios.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(80);
                    break;
                case 1:
                    column.setPreferredWidth(250);
                    break;
            }
        }
        jtbUsuarios.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected,
                        hasFocus, row, column);
                if (row % 2 == 0) {
                    setBackground(Color.LIGHT_GRAY);
                } else {
                    setBackground(Color.WHITE);
                }
                return this;
            }
        });
        //return (true);
    }

    public boolean verificaExist(String login) {

        Usuario objUsuario = null;

        Conexao.abreConexao();
        ResultSet rs = null;
        PreparedStatement stmt;

        String wSql = "";
        wSql = " SELECT * ";
        wSql += " FROM usuario ";
        wSql += " WHERE login = ? ";

        try {
            System.out.println("Vai Executar Conexão em buscar Usuario");
            stmt = Conexao.con.prepareStatement(wSql);
            stmt.setString(1, login);

            rs = stmt.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
            System.out.println("ERRO de SQL: " + ex.getMessage());
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        return false;
    }

}
