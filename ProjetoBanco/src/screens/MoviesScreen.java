package screens;

import controller.MovieController;
import models.Movie;
import tools.CaixaDeDialogo;

public class MoviesScreen extends javax.swing.JFrame {

    Movie objMovie;
    MovieController moviecontroller;

    public MoviesScreen() {
        initComponents();
        atualizaLista();
    }

    private void atualizaLista() {
        moviecontroller = new MovieController();
        moviecontroller.preencherListaMovies(tblMovies);
    }

    private void preencherCampos() {
        try {

            jlbID.setText(String.valueOf(objMovie.getId()));
            txtNome.setText(objMovie.getNome());
            txtGenero.setText(objMovie.getGenero());
            txtDiretor.setText(objMovie.getDiretor());
            txtResumo.setText(objMovie.getResumo());

            btnAdicionar.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);

        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage());
        }
    }

    private void limparCampos() {
        try {

            jlbID.setText("ID");
            txtNome.setText("");
            txtGenero.setText("");
            txtDiretor.setText("");
            txtResumo.setText("");

            btnAdicionar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);

            atualizaLista();

        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage());
        }
    }

    private void guardarDados() {
        try {

            objMovie = new Movie();
            objMovie.setNome(txtNome.getText());
            objMovie.setGenero(txtGenero.getText());
            objMovie.setDiretor(txtDiretor.getText());
            objMovie.setResumo(txtResumo.getText());

        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jlbNome = new javax.swing.JLabel();
        jlbGenero = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMovies = new javax.swing.JTable();
        btnLimpas = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jlbID = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        txtDiretor = new javax.swing.JTextField();
        jlbDiretor = new javax.swing.JLabel();
        jlbResumo = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtResumo = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Catálogo de Filmes:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jlbNome.setText("Nome:");

        jlbGenero.setText("Genéro:");

        tblMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMovies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMoviesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMovies);

        btnLimpas.setText("Limpar");
        btnLimpas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpasActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jlbID.setText("ID");

        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        txtDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiretorActionPerformed(evt);
            }
        });

        jlbDiretor.setText("Diretor:");

        jlbResumo.setText("Resumo");

        txtResumo.setColumns(20);
        txtResumo.setLineWrap(true);
        txtResumo.setRows(5);
        jScrollPane4.setViewportView(txtResumo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbNome)
                                    .addComponent(jlbGenero))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlbID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpas)
                                .addGap(12, 12, 12)
                                .addComponent(btnExcluir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbDiretor)
                                    .addComponent(jlbResumo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jlbID)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbNome))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDiretor)
                    .addComponent(txtDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbResumo)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdicionar)
                        .addComponent(btnAlterar)
                        .addComponent(btnLimpas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        try {
            boolean wPergunta = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Tem certeza de que deseja excluir este filme?", "Confirmação", 'p');

            if (wPergunta) {
                moviecontroller = new MovieController();
                boolean retorno = moviecontroller.excluirMovie(Integer.parseInt(jlbID.getText()));
                if (retorno) {
                    limparCampos();
                } else {
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {
            //salvar o usuário no banco de dados

            //1 - validar os dados
            if (validarDados()) {

                guardarDados();

                //3 - chamar o método de incluir do controller (passando o objeto criado)
                moviecontroller = new MovieController();
                if (moviecontroller.verificaExistenciaMovie(objMovie)) {
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Filme já cadastrado!", 'a');
                } else {
                    boolean retorno = moviecontroller.incluirMovie(objMovie);
                    atualizaLista();

                    //4 - avisar o usuário se a inclusão deu certo ou deu errado
                    if (retorno == true) {
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Filme incluído com sucesso");
                    } else {
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao incluir Filme");
                    }
                }
            }
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("ERRO: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private boolean validarDados() {

        if (txtNome.getText().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe o nome do Filme", 'e');
            return false;
        } else if (txtGenero.getText().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe o Gênero do Filme", 'e');
            return false;
        } else if (txtDiretor.getText().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe o Diretor do Filme", 'e');
            return false;
        } else if (txtResumo.getText().equals("")) {
            boolean confirmacao = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Deseja deixar este filme sem resumo?", "Resumo", 'p');
            if (confirmacao) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            if (validarDados()) {

                guardarDados();
                objMovie.setId(Integer.parseInt(jlbID.getText()));
                moviecontroller = new MovieController();
                if (moviecontroller.verificaExistenciaMovie(objMovie)) {
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Filme já existe!", 'e');
                } else {
                    if (moviecontroller.alterarMovie(objMovie) == true) {
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Filme alterado com Sucesso (" + objMovie.getId() + ")!");
                    } else {
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao alterar Filme!", 'e');
                    }
                }
                limparCampos();
            }
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tblMoviesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMoviesMouseClicked
        // TODO add your handling code here:
        try {
            int linhaSelecionada = tblMovies.getSelectedRow();//pega a linha selecionada
            String idUsuario = tblMovies.getModel()
                    .getValueAt(linhaSelecionada, 0).toString(); // Primeira coluna da linha

            //if(jtbUsuarios.isColumnSelected(2)){
            moviecontroller = new MovieController();

            objMovie = moviecontroller.buscarMovie(Integer.parseInt(idUsuario));
            if (objMovie != null && objMovie.getId() > 0) {
                preencherCampos();
            } else {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao buscar Filme no BD!");
            }
            //}
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_tblMoviesMouseClicked

    private void btnLimpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpasActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimpasActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiretorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoviesScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlbDiretor;
    private javax.swing.JLabel jlbGenero;
    private javax.swing.JLabel jlbID;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbResumo;
    private javax.swing.JTable tblMovies;
    private javax.swing.JTextField txtDiretor;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtResumo;
    // End of variables declaration//GEN-END:variables
}
