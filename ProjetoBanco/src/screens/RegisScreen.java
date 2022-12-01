package screens;

import controller.UsuarioController;
import models.Usuario;
import tools.CaixaDeDialogo;

public class RegisScreen extends javax.swing.JFrame {

    Usuario objUsuario;
    UsuarioController controller;

    public RegisScreen() {
        initComponents();

        atualizaLista();
    }

    private void atualizaLista() {
        controller = new UsuarioController();
        controller.preencherLista(tblUsers);
    }

    private void preencherCampos() {
        try {

            jlbID.setText(String.valueOf(objUsuario.getId()));
            txtNome.setText(objUsuario.getNome());
            txtLogin.setText(objUsuario.getUser());
            txtNumCel.setText(objUsuario.getTelefone());
            txtEmail.setText(objUsuario.getEmail());

            btnAdicionar.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            txtLogin.setEnabled(false);
            txtLogin.setEditable(false);

        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage());
        }
    }

    private void limparCampos() {
        try {

            jlbID.setText("ID");
            txtNome.setText("");
            txtLogin.setText("");
            txtNumCel.setText("");
            txtSenha.setText("");
            txtConfSenha.setText("");
            txtEmail.setText("");

            btnAdicionar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtLogin.setEnabled(true);
            txtLogin.setEditable(true);

            atualizaLista();

        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage());
        }
    }

    private void guardarDados() {
        try {

            objUsuario = new Usuario();
            objUsuario.setNome(txtNome.getText());
            objUsuario.setTelefone(txtNumCel.getText());
            objUsuario.setUser(txtLogin.getText());
            objUsuario.setPass(txtSenha.getText());
            objUsuario.setEmail(txtEmail.getText());

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
        txtLogin = new javax.swing.JTextField();
        txtNumCel = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnAdicionar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtConfSenha = new javax.swing.JPasswordField();
        jlbNome = new javax.swing.JLabel();
        jlbUser = new javax.swing.JLabel();
        jlbSenha = new javax.swing.JLabel();
        jlbSenhaRepete = new javax.swing.JLabel();
        jlbNumCel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        btnLimpas = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jlbID = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

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
        jLabel1.setText("Registro de Usuários");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
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

        txtConfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfSenhaActionPerformed(evt);
            }
        });

        jlbNome.setText("Nome:");

        jlbUser.setText("Usuário:");

        jlbSenha.setText("Senha:");

        jlbSenhaRepete.setText("Repetir senha:");

        jlbNumCel.setText("Celular:");

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblUsers);

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

        jlbEmail.setText("Email:");

        jMenu1.setText("Voltar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbNumCel)
                                    .addComponent(jlbSenhaRepete)
                                    .addComponent(jlbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbNome)
                                    .addComponent(jlbUser)
                                    .addComponent(jlbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNumCel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpas)
                                .addGap(12, 12, 12)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(btnAdicionar))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUser))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbSenha))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbSenhaRepete))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbNumCel))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbEmail))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdicionar)
                        .addComponent(btnAlterar)
                        .addComponent(btnLimpas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        try {
            boolean wPergunta = CaixaDeDialogo.obterinstancia().pedirConfirmacao("Tem certeza de que deseja excluir este usuário²", "Confirmação", 'p');

            if (wPergunta) {
                controller = new UsuarioController();
                boolean retorno = controller.excluir(Integer.parseInt(jlbID.getText()));
                if (retorno) {
                    limparCampos();
                } else {
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {
            //salvar o usuário no banco de dados

            //1 - validar os dados
            if (validarDados()) {

                guardarDados();

                //3 - chamar o método de incluir do controller (passando o objeto criado)
                controller = new UsuarioController();
                if (controller.verificaExistencia(objUsuario)) {
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Usuário já cadastrado!", 'a');
                } else {
                    boolean retorno = controller.incluir(objUsuario);
                    atualizaLista();

                    //4 - avisar o usuário se a inclusão deu certo ou deu errado
                    if (retorno == true) {
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Usuário incluído com sucesso");
                    } else {
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao incluir usuário");
                    }
                }
            }
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("ERRO: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private boolean validarDados() {

        if (txtNome.getText().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe o nome do usuário", 'e');
            return false;
        } else if (txtNumCel.getText().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe o telefone do usuário", 'e');
            return false;
        } else if (txtEmail.getText().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe o Email do usuário", 'e');
            return false;
        } else if (txtLogin.getText().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe o login do usuário", 'e');
            return false;
        } else if (txtSenha.getText().equals("")) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Informe a senha do usuário", 'e');
            return false;
        } else if (!txtSenha.getText().equals(txtConfSenha.getText())) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("As senhas não correspondem", 'e');
            return false;
        }

        return true;
    }

    private void txtConfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfSenhaActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            if (validarDados()) {

                guardarDados();
                objUsuario.setId(Integer.parseInt(jlbID.getText()));

                //verificar se o usuário já existe
                controller = new UsuarioController();
                if (controller.verificaExistencia(objUsuario)) {
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Usuário já existe!", 'e');
                } else {
                    if (controller.alterar(objUsuario) == true) {
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Usuário alterado com Sucesso (" + objUsuario.getId() + ")!");
                    } else {
                        CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao alterar usuário!", 'e');
                    }
                }
                limparCampos();
            }
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        // TODO add your handling code here:
        try {
            int linhaSelecionada = tblUsers.getSelectedRow();//pega a linha selecionada
            String idUsuario = tblUsers.getModel()
                    .getValueAt(linhaSelecionada, 0).toString(); // Primeira coluna da linha

            //if(jtbUsuarios.isColumnSelected(2)){
            controller = new UsuarioController();

            objUsuario = controller.buscar(Integer.parseInt(idUsuario));
            if (objUsuario != null && objUsuario.getId() > 0) {
                preencherCampos();
            } else {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao buscar Usuário no BD!");
            }
            //}
        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.getMessage(), 'e');
        }
    }//GEN-LAST:event_tblUsersMouseClicked

    private void btnLimpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpasActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimpasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbID;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbNumCel;
    private javax.swing.JLabel jlbSenha;
    private javax.swing.JLabel jlbSenhaRepete;
    private javax.swing.JLabel jlbUser;
    private javax.swing.JTable tblUsers;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumCel;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
