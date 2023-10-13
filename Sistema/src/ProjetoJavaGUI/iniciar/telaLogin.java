package ProjetoJavaGUI.iniciar;

import javax.swing.JOptionPane;

/**
 *
 * @author cdias
 */
public class telaLogin extends javax.swing.JFrame {

    public telaLogin() {
        setTitle("Login");
        setResizable(false);
        setLocation(500,150);
        initComponents();
    }

    @SuppressWarnings("all")

    private void initComponents() {

        janelaPANEL = new javax.swing.JPanel();
        L1 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        L2 = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        janelaPANEL.setBackground(new java.awt.Color(255, 255, 51));

        L1.setBackground(new java.awt.Color(255, 255, 255));
        L1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        L1.setForeground(new java.awt.Color(0, 0, 0));
        L1.setText("Login");

        txtLogin.setBackground(new java.awt.Color(255, 255, 255));
        txtLogin.setForeground(new java.awt.Color(0, 0, 0));
        txtLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        L2.setBackground(new java.awt.Color(255, 255, 255));
        L2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        L2.setForeground(new java.awt.Color(0, 0, 0));
        L2.setText("Senha");

        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha.setText("jPasswordField1");
        txtSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tentativa-de-logo.png"))); // NOI18N

        javax.swing.GroupLayout janelaPANELLayout = new javax.swing.GroupLayout(janelaPANEL);
        janelaPANEL.setLayout(janelaPANELLayout);
        janelaPANELLayout.setHorizontalGroup(
            janelaPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(janelaPANELLayout.createSequentialGroup()
                .addGroup(janelaPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(janelaPANELLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(janelaPANELLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(janelaPANELLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(janelaPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(janelaPANELLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(foto)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        janelaPANELLayout.setVerticalGroup(
            janelaPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(janelaPANELLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(foto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(L1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(janelaPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(janelaPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        if(txtLogin.getText().equals("usuario") && new String(txtSenha.getPassword()).equals("senha")){
            JOptionPane.showMessageDialog(null,"Logando...","Sucesso", JOptionPane.DEFAULT_OPTION);
            new controleGeral().setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha incorreta.","Erro",JOptionPane.CANCEL_OPTION);
        }
        
    }

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JPanel janelaPANEL;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
