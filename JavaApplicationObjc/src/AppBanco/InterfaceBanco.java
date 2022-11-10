/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppBanco;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import tools.CaixaDeDialogo;

/**
 *
 * @author vinicius.buffon
 */
public class InterfaceBanco extends javax.swing.JFrame {

    ContaBanco objConta1;
    ContaBanco objConta2;
    DefaultComboBoxModel modelContas;

    public InterfaceBanco() {
        initComponents();

        ArrayList<ContaBanco> listaContas;
        listaContas = new ArrayList<>();

        ContaBanco objConta = new ContaBanco();
        objConta.setNome("Juca da Silva");
        objConta.setNumConta(123);
        objConta.setSaldoConta(1000);
        objConta.setLimiteChuq(1000);

        listaContas.add(objConta);

        objConta = new ContaBanco();
        objConta.setNome("Pericles Pereira");
        objConta.setNumConta(456);
        objConta.setSaldoConta(2000);
        objConta.setLimiteChuq(2000);

        listaContas.add(objConta);

        objConta = new ContaBanco();
        objConta.setNome("Joaquina Catalona");
        objConta.setNumConta(789);
        objConta.setSaldoConta(1500);
        objConta.setLimiteChuq(5000);

        listaContas.add(objConta);

        objConta = new ContaBanco();
        objConta.setNome("Amanda Pierre");
        objConta.setNumConta(321);
        objConta.setSaldoConta(5000);
        objConta.setLimiteChuq(1000);

        listaContas.add(objConta);

        objConta = new ContaBanco();
        objConta.setNome("Bruno Mayer");
        objConta.setNumConta(654);
        objConta.setSaldoConta(9000);
        objConta.setLimiteChuq(10000);

        listaContas.add(objConta);

        modelContas = new DefaultComboBoxModel();
        listaContas.forEach(object -> {
            modelContas.addElement(object);
        });
        cmbBox1.setModel(modelContas);

        modelContas = new DefaultComboBoxModel();
        listaContas.forEach(object -> {
            modelContas.addElement(object);
        });

        cmbBox2.setModel(modelContas);
    }

    private void atualizarSaldos() {
        txtField1.setText("");
        txtField2.setText("");
        lblSaldoConta1.setText("Saldo: " + objConta1.getSaldoConta() + " R$");
        lblSaldoConta2.setText("Saldo: " + objConta2.getSaldoConta() + " R$");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDepositar1 = new javax.swing.JButton();
        btnSacar1 = new javax.swing.JButton();
        btnTrasnferir1 = new javax.swing.JButton();
        lblNome1 = new javax.swing.JLabel();
        lblNumConta1 = new javax.swing.JLabel();
        lblSaldoConta1 = new javax.swing.JLabel();
        lblCheqLimit1 = new javax.swing.JLabel();
        lblCheqLimit2 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        lblNumConta2 = new javax.swing.JLabel();
        lblSaldoConta2 = new javax.swing.JLabel();
        txtField1 = new javax.swing.JTextField();
        txtField2 = new javax.swing.JTextField();
        btnDepositar2 = new javax.swing.JButton();
        btnSacar2 = new javax.swing.JButton();
        btnTrasnferir2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbBox1 = new javax.swing.JComboBox<>();
        cmbBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDepositar1.setText("Depositar Dinheiro");
        btnDepositar1.setBorderPainted(false);
        btnDepositar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositar1ActionPerformed(evt);
            }
        });

        btnSacar1.setText("Sacar Dinheiro");
        btnSacar1.setBorderPainted(false);
        btnSacar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacar1ActionPerformed(evt);
            }
        });

        btnTrasnferir1.setText("Transfêrir Dinheiro");
        btnTrasnferir1.setBorderPainted(false);
        btnTrasnferir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasnferir1ActionPerformed(evt);
            }
        });

        lblNome1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNome1.setText("Nome Do Cliente");

        lblNumConta1.setText("Número da Conta:");

        lblSaldoConta1.setText("Saldo:");

        lblCheqLimit1.setText("Limite do cheque:");

        lblCheqLimit2.setText("Limite do cheque:");

        lblNome2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNome2.setText("Nome Do Cliente");

        lblNumConta2.setText("Número da Conta:");

        lblSaldoConta2.setText("Saldo:");

        txtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField1ActionPerformed(evt);
            }
        });

        txtField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField2ActionPerformed(evt);
            }
        });

        btnDepositar2.setText("Depositar Dinheiro");
        btnDepositar2.setBorderPainted(false);
        btnDepositar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositar2ActionPerformed(evt);
            }
        });

        btnSacar2.setText("Sacar Dinheiro");
        btnSacar2.setBorderPainted(false);
        btnSacar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacar2ActionPerformed(evt);
            }
        });

        btnTrasnferir2.setText("Transfêrir Dinheiro");
        btnTrasnferir2.setBorderPainted(false);
        btnTrasnferir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasnferir2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/banco-original.png"))); // NOI18N

        cmbBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox1ActionPerformed(evt);
            }
        });

        cmbBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSaldoConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblNumConta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnTrasnferir1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSacar1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnDepositar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblCheqLimit1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnTrasnferir2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSacar2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnDepositar2, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbBox2, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblNome2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNumConta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSaldoConta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCheqLimit2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lblNumConta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSaldoConta2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCheqLimit2)
                            .addComponent(lblCheqLimit1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumConta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldoConta1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDepositar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSacar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrasnferir2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDepositar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSacar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrasnferir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacar1ActionPerformed
        // Sacar da conta 1.
        try {
            double valorSac = Double.parseDouble(txtField1.getText());
            boolean resposta = CaixaDeDialogo.obterinstancia()
                    .pedirConfirmacao("Confirma o saque no valor de " + valorSac
                            + "?", "Confirmação", 'p');
            if (resposta == true) {
                if (objConta1.sacar(valorSac)) {
                    //Sucesso
                    atualizarSaldos();
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Operação bem "
                            + "sucedida", 'i');
                } else {
                    //Erro
                    atualizarSaldos();
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo i"
                            + "nsuficiente", 'i');
                }
            } else {
                atualizarSaldos();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação "
                        + "cancelada pelo usuário", 'e');
            }
        } catch (Exception ex) {
            System.out.println("Erro " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSacar1ActionPerformed

    private void txtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField1ActionPerformed

    private void btnDepositar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositar1ActionPerformed
        // Depositar na conta 1.
        try {
            double valorDep = Double.parseDouble(txtField1.getText());
            objConta1.depositar(valorDep);
            atualizarSaldos();
        } catch (Exception ex) {
            System.out.println("Erro " + ex.getMessage());
        }
    }//GEN-LAST:event_btnDepositar1ActionPerformed

    private void txtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField2ActionPerformed

    private void btnDepositar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositar2ActionPerformed
        // Depositar na conta 2.
        try {
            double valorDep = Double.parseDouble(txtField2.getText());
            objConta2.depositar(valorDep);
            atualizarSaldos();
        } catch (Exception ex) {
            System.out.println("Erro " + ex.getMessage());
        }
    }//GEN-LAST:event_btnDepositar2ActionPerformed

    private void btnSacar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacar2ActionPerformed
        // Saca da conta 2.
        try {
            double valorSac = Double.parseDouble(txtField2.getText());
            boolean resposta = CaixaDeDialogo.obterinstancia()
                    .pedirConfirmacao("Confirma o saque no valor de " + valorSac
                            + "?", "Confirmação", 'p');
            if (resposta == true) {
                if (objConta2.sacar(valorSac)) {
                    //Sucesso
                    atualizarSaldos();
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Operação bem "
                            + "sucedida", 'i');
                } else {
                    //Erro
                    atualizarSaldos();
                    CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo i"
                            + "nsuficiente", 'i');
                }
            } else {
                atualizarSaldos();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Operação "
                        + "cancelada pelo usuário", 'e');
            }
        } catch (Exception ex) {
            System.out.println("Erro " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSacar2ActionPerformed

    private void btnTrasnferir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasnferir1ActionPerformed
        // Transfere para a conta da conta 1 para a 2.
        try {
            if (objConta1.getNumConta() != objConta2.getNumConta()) {
                double valorTransf = Double.parseDouble(txtField1.getText());
                boolean resposta = CaixaDeDialogo.obterinstancia()
                        .pedirConfirmacao("Confirmar a transferência no valor de R$"
                                + valorTransf + " para " + objConta2.getNome()
                                + "?", "Confirmação", 'p');
                if (resposta == true) {
                    if (objConta1.transferir(valorTransf, objConta2)) {
                        //Sucesso
                        atualizarSaldos();
                    }
                }
            } else {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Tentando efetuar"
                        + " uma transferência para a própria conta.", 'a');
                atualizarSaldos();
                //Erro
            }
        } catch (Exception ex) {
            System.out.println("Erro " + ex.getMessage());
        }
    }//GEN-LAST:event_btnTrasnferir1ActionPerformed

    private void btnTrasnferir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasnferir2ActionPerformed

        // Transfere para a conta da conta 2 para a 1.
        try {
            if (objConta2.getNumConta() != objConta1.getNumConta()) {
                double valorTransf = Double.parseDouble(txtField2.getText());
                boolean resposta = CaixaDeDialogo.obterinstancia()
                        .pedirConfirmacao("Confirmar a transferência no valor de R$"
                                + valorTransf + " para " + objConta1.getNome()
                                + "?", "Confirmação", 'p');
                if (resposta == true) {
                    if (objConta2.transferir(valorTransf, objConta1)) {
                        //Sucesso
                        atualizarSaldos();
                    }
                }
            } else {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Tentando efetuar"
                        + " uma transferência para a própria conta.", 'a');
                atualizarSaldos();
                //Erro
            }
        } catch (Exception ex) {
            System.out.println("Erro " + ex.getMessage());
        }
    }//GEN-LAST:event_btnTrasnferir2ActionPerformed

    private void cmbBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox1ActionPerformed
        objConta1 = (ContaBanco) cmbBox1.getSelectedItem();

        //preencher os campos na tela
        lblNome1.setText(objConta1.getNome());
        lblNumConta1.setText("Número da Conta: " + objConta1.getNumConta());
        lblSaldoConta1.setText("Saldo: " + objConta1.getSaldoConta() + " R$");
        lblCheqLimit1.setText("L.C: " + objConta1.getLimiteChuq() + " R$");
        lblSaldoConta1.setText("Saldo: " + objConta1.getSaldoConta() + " R$");
        txtField1.setText("");

    }//GEN-LAST:event_cmbBox1ActionPerformed

    private void cmbBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox2ActionPerformed
        // TODO add your handling code here:
        objConta2 = (ContaBanco) cmbBox2.getSelectedItem();

        //preencher os campos na tela
        lblNome2.setText(objConta2.getNome());
        lblNumConta2.setText("Número da Conta: " + objConta2.getNumConta());
        lblSaldoConta2.setText("Saldo: " + objConta2.getSaldoConta() + " R$");
        lblCheqLimit2.setText("L.C: " + objConta2.getLimiteChuq() + " R$");
        lblSaldoConta2.setText("Saldo: " + objConta2.getSaldoConta() + " R$");
        txtField2.setText("");
    }//GEN-LAST:event_cmbBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar1;
    private javax.swing.JButton btnDepositar2;
    private javax.swing.JButton btnSacar1;
    private javax.swing.JButton btnSacar2;
    private javax.swing.JButton btnTrasnferir1;
    private javax.swing.JButton btnTrasnferir2;
    private javax.swing.JComboBox<String> cmbBox1;
    private javax.swing.JComboBox<String> cmbBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCheqLimit1;
    private javax.swing.JLabel lblCheqLimit2;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNumConta1;
    private javax.swing.JLabel lblNumConta2;
    private javax.swing.JLabel lblSaldoConta1;
    private javax.swing.JLabel lblSaldoConta2;
    private javax.swing.JTextField txtField1;
    private javax.swing.JTextField txtField2;
    // End of variables declaration//GEN-END:variables
}
