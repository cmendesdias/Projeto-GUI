package ProjetoJavaGUI.itensMenuAlterarDeletar;

import javax.swing.JOptionPane;
import ProjetoJavaGUI.SQL.conexaoAlterarDisciplina;
import ProjetoJavaGUI.iniciar.controleGeral;

/**
 *
 * @author cdias
 */
public class alterarDisciplina extends javax.swing.JFrame {

    public alterarDisciplina() {
	setResizable(false);
        initComponents();
        setTitle("Sistema de Controle Acadêmico - Altear: Disciplina");
        setLocation(500,240);
    }

    private void initComponents() {

        conjuntoBotoesRadio = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoRadio1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        botaoRadio2 = new javax.swing.JRadioButton();
        botaoRadio3 = new javax.swing.JRadioButton();
        botaoRadio4 = new javax.swing.JRadioButton();
        botaoRadio5 = new javax.swing.JRadioButton();
        botaoRadio6 = new javax.swing.JRadioButton();
        botaoSairDisciplinas = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        nomeDisciplina = new javax.swing.JTextField();
        carga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idDisciplina = new javax.swing.JTextField();

        conjuntoBotoesRadio.add(botaoRadio1);
        conjuntoBotoesRadio.add(botaoRadio2);
        conjuntoBotoesRadio.add(botaoRadio3);
        conjuntoBotoesRadio.add(botaoRadio4);
        conjuntoBotoesRadio.add(botaoRadio5);
        conjuntoBotoesRadio.add(botaoRadio6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CADASTRO DE DISCIPLINAS");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID da Disciplina:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Aulas por Semana:");

        botaoRadio1.setForeground(new java.awt.Color(0, 0, 0));
        botaoRadio1.setText(" 1");
        botaoRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Carga Horária: ");

        botaoRadio2.setForeground(new java.awt.Color(0, 0, 0));
        botaoRadio2.setText(" 2");
        botaoRadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        botaoRadio3.setForeground(new java.awt.Color(0, 0, 0));
        botaoRadio3.setText(" 3");
        botaoRadio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        botaoRadio4.setForeground(new java.awt.Color(0, 0, 0));
        botaoRadio4.setText(" 4");
        botaoRadio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        botaoRadio5.setForeground(new java.awt.Color(0, 0, 0));
        botaoRadio5.setText(" 5");
        botaoRadio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        botaoRadio6.setForeground(new java.awt.Color(0, 0, 0));
        botaoRadio6.setText(" 6");
        botaoRadio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        botaoSairDisciplinas.setText("Sair");
        botaoSairDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairDisciplinasActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirActionPerformed(evt);
            }
        });

        nomeDisciplina.setBackground(new java.awt.Color(255, 255, 255));
        nomeDisciplina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nomeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDisciplinaActionPerformed(evt);
            }
        });

        carga.setBackground(new java.awt.Color(255, 255, 255));
        carga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Código do Curso:");

        idCurso.setBackground(new java.awt.Color(255, 255, 255));
        idCurso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        idCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCursoActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nome da Disciplina:");

        idDisciplina.setBackground(new java.awt.Color(255, 255, 255));
        idDisciplina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        idDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(botaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nomeDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                        .addComponent(carga)
                                        .addComponent(idCurso)
                                        .addComponent(idDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(botaoRadio5)
                                            .addGap(18, 18, 18)
                                            .addComponent(botaoRadio6))
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botaoRadio1)
                                            .addComponent(botaoRadio3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botaoRadio2)
                                            .addComponent(botaoRadio4))))
                                .addGap(0, 23, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoSairDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addComponent(jLabel1))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoRadio1)
                            .addComponent(botaoRadio2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoRadio3)
                            .addComponent(botaoRadio4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoRadio6)
                            .addComponent(botaoRadio5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(idCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSairDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void botaoSairDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        dispose();
        new controleGeral().setVisible(true);
        // TODO add your handling code here:
    }                                                    

    private void nomeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void idCursoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        idDisciplina.setText("");
        nomeDisciplina.setText("");
        carga.setText("");
        idCurso.setText("");
        conjuntoBotoesRadio.clearSelection();
        
    }                                           

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String nomeDisciplinaString = nomeDisciplina.getText();
        String cargaDisciplinaString = carga.getText();
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
        else if(botaoRadio4.isSelected()){
            botaoSelecionado = botaoRadio3.getText();
        }
        else if(botaoRadio5.isSelected()){
            botaoSelecionado = botaoRadio3.getText();
        }
        else if(botaoRadio6.isSelected()){
            botaoSelecionado = botaoRadio3.getText();
        }

        try {
            int idcurso = Integer.parseInt(idCurso.getText());
            int id_disciplina = Integer.parseInt(idDisciplina.getText());
            int idcursotrue = idcurso;
            int id_disciplina_true = id_disciplina;

            idDisciplina.setText("");
            nomeDisciplina.setText("");
            carga.setText("");
            idCurso.setText("");
            conjuntoBotoesRadio.clearSelection();

            new conexaoAlterarDisciplina(nomeDisciplinaString, cargaDisciplinaString, botaoSelecionado, idcursotrue, id_disciplina_true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digito Inválido.","Erro", JOptionPane.ERROR_MESSAGE);        
            e.printStackTrace();
        }

    }                                            

    private void idDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

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
            java.util.logging.Logger.getLogger(alterarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alterarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alterarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alterarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alterarDisciplina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSairDisciplinas;
    private javax.swing.JTextField carga;
    private javax.swing.ButtonGroup conjuntoBotoesRadio;
    private javax.swing.JTextField idCurso;
    private javax.swing.JTextField idDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton botaoRadio1;
    private javax.swing.JRadioButton botaoRadio2;
    private javax.swing.JRadioButton botaoRadio3;
    private javax.swing.JRadioButton botaoRadio4;
    private javax.swing.JRadioButton botaoRadio5;
    private javax.swing.JRadioButton botaoRadio6;
    private javax.swing.JTextField nomeDisciplina;
    // End of variables declaration                   
}
