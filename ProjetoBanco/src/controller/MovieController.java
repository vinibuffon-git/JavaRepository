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
import models.Movie;


public class MovieController {

    
    public void preencherListaMovies(JTable jtbMovie) {

        System.out.print("Tabela Movies Lancada! ");

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
            sql += " FROM movie ";
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
            System.out.println("Problemas para popular tabela Movie...");
            System.out.println(e);
        }

        jtbMovie.setModel(new DefaultTableModel(dadosTabela, cabecalhos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        });

        // permite seleção de apenas uma linha da tabela
        jtbMovie.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < 3; i++) {
            column = jtbMovie.getColumnModel().getColumn(i);
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
        jtbMovie.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

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

    public Movie buscarMovie(int id) {
        try {
            Movie objMovie = null;

            Conexao.abreConexao();
            ResultSet rs = null;
            PreparedStatement stmt;

            String wSql = "";
            wSql = " SELECT * ";
            wSql += " FROM movie ";
            wSql += " WHERE id = ? ";

            try {
                System.out.println("Vai Executar Conexão em buscar Movie");
                stmt = Conexao.con.prepareStatement(wSql);
                stmt.setInt(1, id);

                rs = stmt.executeQuery();

                if (rs.next()) {
                    objMovie = new Movie();
                    objMovie.setId(rs.getInt("id"));
                    objMovie.setNome(rs.getString("nome"));
                    objMovie.setGenero(rs.getString("genero"));
                    objMovie.setDiretor(rs.getString("diretor"));
                    objMovie.setResumo(rs.getString("resumo"));
                    //objMovie.setDtlacamento(rs.getString("data"));
                    return objMovie;
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
    
    public boolean verificaExistenciaMovie(Movie objMovie) {
        try {
            Conexao.abreConexao();
            ResultSet rs = null;
            PreparedStatement stmt;

            String wSql = " SELECT * ";
            wSql += " FROM movie ";
            wSql += " WHERE nome = ? ";
            if (objMovie.getId() > 0) {
                wSql += " AND id <> ? ";
            }

            System.out.println("Vai Executar Conexão em verificaExistenciaMovie");
            stmt = Conexao.con.prepareStatement(wSql);
            stmt.setString(1, objMovie.getNome());
            if (objMovie.getId() > 0) {
                stmt.setInt(2, objMovie.getId());
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
    
    public boolean incluirMovie(Movie objMovie) {

        try {

            Conexao.abreConexao();
            PreparedStatement stmt = null;

            stmt = Conexao.con.prepareStatement("INSERT INTO movie (nome, genero, diretor, resumo) VALUES(?,?,?,?)");
            stmt.setString(1, objMovie.getNome());
            stmt.setString(2, objMovie.getGenero());
            stmt.setString(3, objMovie.getDiretor());
            stmt.setString(4, objMovie.getResumo());
            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            Conexao.closeConnection(Conexao.con);
        }

    }
         
    public boolean alterarMovie(Movie objMovie) {

        Conexao.abreConexao();
        PreparedStatement stmt = null;

        try {
            stmt = Conexao.con.prepareStatement("UPDATE movie SET nome=?, genero=?, diretor = ?, resumo =? WHERE id=? ");
            stmt.setString(1, objMovie.getNome());
            stmt.setString(2, objMovie.getGenero());
            stmt.setString(3, objMovie.getDiretor());
            stmt.setString(4, objMovie.getResumo());
            stmt.setInt(5, objMovie.getId());
            stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            Conexao.closeConnection(Conexao.con);
        }

    }
    
    public boolean excluirMovie(int id) {

        Conexao.abreConexao();
        PreparedStatement stmt = null;

        try {
            stmt = Conexao.con.prepareStatement("DELETE FROM movie WHERE id=?");
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
