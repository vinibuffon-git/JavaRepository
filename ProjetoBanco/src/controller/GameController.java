package controller;

import tools.Conexao;
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
import models.Game;


public class GameController {

    
    public void preencherListaGames(JTable jtbGame) {

        System.out.print("Tabela Games Lancada! ");

        Vector<String> cabecalhos = new Vector<>();
        Vector dadosTabela = new Vector();
        cabecalhos.add("Id");
        cabecalhos.add("Nome");
        cabecalhos.add("Género");

        Conexao.abreConexao();
        ResultSet result = null;

        try {
            String sql = "";
            sql = "SELECT id, nome, genero ";
            sql += " FROM game ";
            sql += " ORDER BY nome ";

            result = Conexao.stmt.executeQuery(sql);

            while (result.next()) {
                Vector<Object> linha = new Vector<Object>();
                linha.add(result.getInt("id"));
                linha.add(result.getString("nome"));
                linha.add(result.getString("genero"));
                dadosTabela.add(linha);
            }

        } catch (SQLException e) {
            System.out.println("Problemas para popular tabela...");
            System.out.println(e);
        }

        jtbGame.setModel(new DefaultTableModel(dadosTabela, cabecalhos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        });

        // permite seleção de apenas uma linha da tabela
        jtbGame.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < 3; i++) {
            column = jtbGame.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(80);
                    break;
                case 1:
                    column.setPreferredWidth(300);
                    break;
                case 2:
                    column.setPreferredWidth(200);
                    break;
            }
        }
        jtbGame.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

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

    public Game buscarGame(int id) {
        try {
            Game objGame = null;

            Conexao.abreConexao();
            ResultSet rs = null;
            PreparedStatement stmt;

            String wSql = "";
            wSql = " SELECT * ";
            wSql += " FROM game ";
            wSql += " WHERE id = ? ";

            try {
                System.out.println("Vai Executar Conexão em buscar Game");
                stmt = Conexao.con.prepareStatement(wSql);
                stmt.setInt(1, id);

                rs = stmt.executeQuery();

                if (rs.next()) {
                    objGame = new Game();
                    objGame.setId(rs.getInt("id"));
                    objGame.setNome(rs.getString("nome"));
                    objGame.setGenero(rs.getString("genero"));
                    //objGame.setDtlacamento(rs.getString("data"));
                    return objGame;
                }
            } catch (SQLException ex) {
                System.out.println("ERRO de SQL: " + ex.getMessage());
                return null;
            }
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }
        return null;
    }
    
    public boolean verificaExistenciaGame(Game objGame) {
        try {
            Conexao.abreConexao();
            ResultSet rs = null;
            PreparedStatement stmt;

            String wSql = " SELECT * ";
            wSql += " FROM game ";
            wSql += " WHERE nome = ? ";
            if (objGame.getId() > 0) {
                wSql += " AND id <> ? ";
            }

            System.out.println("Vai Executar Conexão em verificaExistenciaGame");
            stmt = Conexao.con.prepareStatement(wSql);
            stmt.setString(1, objGame.getNome());
            if (objGame.getId() > 0) {
                stmt.setInt(2, objGame.getId());
            }

            rs = stmt.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println("ERRO de SQL: " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("ERRO: " + ex.getMessage());
            return false;
        }

        return false;

    }
    
    public boolean incluirGame(Game objGame) {

        try {

            Conexao.abreConexao();
            PreparedStatement stmt = null;

            stmt = Conexao.con.prepareStatement("INSERT INTO Game (nome, genero) VALUES(?,?)");
            stmt.setString(1, objGame.getNome());
            stmt.setString(2, objGame.getGenero());
            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            Conexao.closeConnection(Conexao.con);
        }

    }
     
    
    public boolean alterarGame(Game objGame) {

        Conexao.abreConexao();
        PreparedStatement stmt = null;

        try {
            stmt = Conexao.con.prepareStatement("UPDATE game SET nome=?, genero=? WHERE id=? ");
            stmt.setString(1, objGame.getNome());
            stmt.setString(2, objGame.getGenero());
            stmt.setInt(3, objGame.getId());
            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            Conexao.closeConnection(Conexao.con);
        }

    }
    
    public boolean excluirGame(int id) {

        Conexao.abreConexao();
        PreparedStatement stmt = null;

        try {
            stmt = Conexao.con.prepareStatement("DELETE FROM game WHERE id=?");
            stmt.setInt(1, id);//1º?

            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            Conexao.closeConnection(Conexao.con);
        }

    }
}
