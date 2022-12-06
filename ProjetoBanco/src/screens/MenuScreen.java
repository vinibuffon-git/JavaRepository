
package screens;

import tools.CaixaDeDialogo;
import tools.Conexao;


public class MenuScreen extends javax.swing.JFrame {

    
    public MenuScreen() {
        initComponents();
        
       // this.setExtendedState(this.getExtendedState()|MenuScreen.MAXIMIZED_BOTH);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menUsuarios = new javax.swing.JMenuItem();
        menJogos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menSair = new javax.swing.JMenuItem();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Locadora de Jogos");

        jLabel2.setFont(new java.awt.Font("Niagara Engraved", 1, 48)); // NOI18N
        jLabel2.setText("Fireball");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMenu1.setText("Cadastros");

        menUsuarios.setText("Usuários");
        menUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(menUsuarios);

        menJogos.setText("Jogos");
        menJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menJogosActionPerformed(evt);
            }
        });
        jMenu1.add(menJogos);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Help");

        menSair.setText("Sair");
        menSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSairActionPerformed(evt);
            }
        });
        jMenu4.add(menSair);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 100, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menUsuariosActionPerformed
        // TODO add your handling code here:
        RegisScreen telas = new RegisScreen();
        telas.setVisible(true);
    }//GEN-LAST:event_menUsuariosActionPerformed

    private void menJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menJogosActionPerformed
        // TODO add your handling code here:
        GameScreen telas = new GameScreen();
        telas.setVisible(true);
    }//GEN-LAST:event_menJogosActionPerformed

    private void menSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menSairActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menJogos;
    private javax.swing.JMenuItem menSair;
    private javax.swing.JMenuItem menUsuarios;
    // End of variables declaration//GEN-END:variables
}
