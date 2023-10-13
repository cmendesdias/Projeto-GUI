package ProjetoJavaGUI.itensMenuCadastrar;

import javax.swing.JOptionPane;
import ProjetoJavaGUI.SQL.conexaoCadastrarCurso;
import ProjetoJavaGUI.iniciar.controleGeral;

/**
 *
 * @author cdias
 */
public class cadastrarCurso extends javax.swing.JFrame {
    
    public cadastrarCurso() {
        initComponents();
        setTitle("Sistema de Controle Acadêmico - Cadastro: Curso");
        setLocation(500,240);
        conjuntoBotoes.add(botaoRadio1);
        conjuntoBotoes.add(botaoRadio2);
        conjuntoBotoes.add(botaoRadio3);
    }   
                            
    private void initComponents() {

        conjuntoBotoes = new javax.swing.ButtonGroup();
        JPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        carga = new javax.swing.JTextField();
        codInst = new javax.swing.JTextField();
        botaoIncluir = new javax.swing.JButton();
        botaoSAIR = new javax.swing.JButton();
        botaoLIMPAR = new javax.swing.JButton();
        botaoRadio1 = new javax.swing.JRadioButton();
        botaoRadio2 = new javax.swing.JRadioButton();
        botaoRadio3 = new javax.swing.JRadioButton();
        nomeCurso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CADASTRO DE CURSOS");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Carga Horária:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Código da Instituição:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo de Curso:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nome do Curso:");

        carga.setBackground(new java.awt.Color(255, 255, 255));
        carga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        codInst.setBackground(new java.awt.Color(255, 255, 255));
        codInst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botaoIncluir.setText("Incluir");
        botaoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirActionPerformed(evt);
            }
        });

        botaoSAIR.setText("Sair");
        botaoSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSAIRActionPerformed(evt);
            }
        });

        botaoLIMPAR.setText("Limpar");
        botaoLIMPAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLIMPARActionPerformed(evt);
            }
        });

        botaoRadio1.setForeground(new java.awt.Color(0, 0, 0));
        botaoRadio1.setText("Bacharel");

        botaoRadio2.setForeground(new java.awt.Color(0, 0, 0));
        botaoRadio2.setText("Gestão");

        botaoRadio3.setForeground(new java.awt.Color(0, 0, 0));
        botaoRadio3.setText("Outros");

        nomeCurso.setBackground(new java.awt.Color(255, 255, 255));
        nomeCurso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(botaoSAIR, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carga, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codInst, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoRadio2)
                                    .addComponent(botaoRadio1)
                                    .addComponent(botaoRadio3))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoLIMPAR, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSAIR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoLIMPAR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRadio1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRadio2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRadio3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                      

    private void botaoSAIRActionPerformed(java.awt.event.ActionEvent evt) {                                          
        dispose();
        new controleGeral().setVisible(true);
    }                                         

    private void botaoLIMPARActionPerformed(java.awt.event.ActionEvent evt) {                                            
        nomeCurso.setText("");
        carga.setText("");
        codInst.setText("");
        conjuntoBotoes.clearSelection();
    }                                           

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {
        String cargaString = carga.getText();
        String nomeCursoString = nomeCurso.getText();
        String botaoSelecionado = "";
        
        if(botaoRadio1.isSelected()){
            botaoSelecionado = botaoRadio1.getText();
        } 
        else if(botaoRadio2.isSelected()){
            botaoSelecionado = botaoRadio2.getText();
        }
        else if(botaoRadio3.isSelected()){
            botaoSelecionado = botaoRadio3.getText();
        }

        try {
            int cod_inst_int = Integer.parseInt(codInst.getText());

            new conexaoCadastrarCurso(nomeCursoString, cod_inst_int, cargaString,botaoSelecionado);
            nomeCurso.setText("");
            carga.setText("");
            codInst.setText("");
            conjuntoBotoes.clearSelection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digito Inválido.","Erro", JOptionPane.ERROR_MESSAGE);        
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(cadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastrarCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoIncluir;
    private javax.swing.JButton botaoLIMPAR;
    private javax.swing.JButton botaoSAIR;
    private javax.swing.JTextField carga;
    private javax.swing.JTextField codInst;
    private javax.swing.ButtonGroup conjuntoBotoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel JPanel;
    private javax.swing.JRadioButton botaoRadio1;
    private javax.swing.JRadioButton botaoRadio2;
    private javax.swing.JRadioButton botaoRadio3;
    private javax.swing.JTextField nomeCurso;
    // End of variables declaration                   
}
