package screens;

import controller.GameController;
import models.Game;
import tools.CaixaDeDialogo;

public class GameScreen extends javax.swing.JFrame {

    Game objGame;
    GameController gamecontroller;

    public GameScreen() {
        initComponents();
        atualizaLista();
    }

    private void atualizaLista() {
        gamecontroller = new GameController();
        gamecontroller.preencherListaGames(tblGames);
    }

    private void preencherCampos() {
        try {

            jlbID.setText(String.valueOf(objGame.getId()));
            txtNome.setText(objGame.getNome());
            txtGenero.setText(objGame.getGenero());
            

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

            objGame = new Game();
            objGame.setNome(txtNome.getText());
            objGame.setGenero(txtGenero.getText());
          
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
        jlbUser = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblGames = new javax.swing.JTable();
        btnLimpas = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jlbID = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();

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
        jLabel1.setText("Catálogo de jogos:");

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

        jlbUser.setText("Genéro:");

        tblGames.setModel(new javax.swing.table.DefaultTableModel(
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
        tblGames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGamesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblGames);

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
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbNome)
                                            .addComponent(jlbUser))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdicionar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAlterar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLimpas)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnExcluir)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jlbID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(jlbUser)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            boolean wPergunta = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Tem certeza de que deseja excluir este jogo?", "Confirmação", 'p');

            if (wPergunta) {
                gamecontroller = new GameController();
                boolean retorno = gamecontroller.excluirGame(Integer.parseInt(jlbID.getText()));
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
                gamecontroller = new GameController();
                if (gamecontroller.verificaExistenciaGame(objGame)) {
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Jogo já cadastrado!", 'a');
                } else {
                    boolean retorno = gamecontroller.incluirGame(objGame);
                    atualizaLista();

                    //4 - avisar o usuário se a inclusão deu certo ou deu errado
                    if (retorno == true) {
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Jogo incluído com sucesso");
                    } else {
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao incluir Jogo");
                    }
                }
            }
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("ERRO: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private boolean validarDados() {

        if (txtNome.getText().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe o nome do Jogo", 'e');
            return false;
        } else if (txtGenero.getText().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe o Gênero do Jogo", 'e');
            return false;
        }
        return true;
    }

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            if (validarDados()) {

                guardarDados();
                objGame.setId(Integer.parseInt(jlbID.getText()));

                //verificar se o usuário já existe
                gamecontroller = new GameController();
                if (gamecontroller.verificaExistenciaGame(objGame)) {
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Jogo já existe!", 'e');
                } else {
                    if (gamecontroller.alterarGame(objGame) == true) {
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Jogo alterado com Sucesso (" + objGame.getId() + ")!");
                    } else {
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao alterar Jogo!", 'e');
                    }
                }
                limparCampos();
            }
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tblGamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGamesMouseClicked
        // TODO add your handling code here:
        try {
            int linhaSelecionada = tblGames.getSelectedRow();//pega a linha selecionada
            String idUsuario = tblGames.getModel()
                    .getValueAt(linhaSelecionada, 0).toString(); // Primeira coluna da linha

            //if(jtbUsuarios.isColumnSelected(2)){
            gamecontroller = new GameController();

            objGame = gamecontroller.buscarGame(Integer.parseInt(idUsuario));
            if (objGame != null && objGame.getId() > 0) {
                preencherCampos();
            } else {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao buscar Jogo no BD!");
            }
            //}
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_tblGamesMouseClicked

    private void btnLimpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpasActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimpasActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameScreen().setVisible(true);
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlbID;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbUser;
    private javax.swing.JTable tblGames;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
