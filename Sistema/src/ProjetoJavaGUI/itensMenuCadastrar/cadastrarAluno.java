package ProjetoJavaGUI.itensMenuCadastrar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ProjetoJavaGUI.SQL.conexaoCadastrarAluno;
import ProjetoJavaGUI.iniciar.controleGeral;

/**
 *
 * @author cdias
 */
public class cadastrarAluno extends javax.swing.JFrame {
    String nome, id, data;

    public cadastrarAluno() {
        initComponents();
        setTitle("Sistema de Controle Acadêmico - Cadastro: Aluno");
        setLocation(500,150);
	setResizable(false);
    }

    @SuppressWarnings("all")

    private void initComponents() {

        painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaCodigoCurso = new javax.swing.JList<>();
        nomeAluno = new javax.swing.JTextField();
        dataAluno = new javax.swing.JTextField();
        botaoLimpar = new javax.swing.JButton();
        botaoSairAluno = new javax.swing.JButton();
        botaoIncluir = new javax.swing.JButton();

         DefaultListModel<String> listaProvisoriaCodigos = new DefaultListModel<>();

        try{
            String url = "jdbc:mysql://localhost:3306/projetojava";
            String usuario = "root";
            String senha = "Seiro714714@";    
            String consultaSQL = "SELECT id_curso FROM cursos";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement statement = conectar.prepareStatement(consultaSQL);
            ResultSet resultado = statement.executeQuery();
                
            while (resultado.next()) { // Movendo o cursor para a próxima linha de resultados
                String cursoCodigo = resultado.getString("id_curso");
                listaProvisoriaCodigos.addElement(cursoCodigo);
            }
            resultado.close();
            statement.close();
            conectar.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        listaCodigoCurso.setModel(listaProvisoriaCodigos);
        jScrollPane2.setViewportView(listaCodigoCurso);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CADASTRO DE ALUNOS");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nome do Aluno:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Data de Nascimento:");

        separador.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Código do Curso:");

        nomeAluno.setBackground(new java.awt.Color(255, 255, 255));
        nomeAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAlunoActionPerformed(evt);
            }
        });

        dataAluno.setBackground(new java.awt.Color(255, 255, 255));
        dataAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoSairAluno.setText("Sair");
        botaoSairAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairAlunoActionPerformed(evt);
            }
        });

        botaoIncluir.setText("Incluir");
        botaoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(botaoIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoSairAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4))
                                        .addGap(28, 28, 28)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dataAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel8)))
                                .addGap(0, 30, Short.MAX_VALUE)))))
                .addGap(14, 14, 14))
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSairAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void botaoSairAlunoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        dispose();
        new controleGeral().setVisible(true);
    }                                              

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //nomeAluno
        nomeAluno.setText("");
        dataAluno.setText("");
        listaCodigoCurso.clearSelection();
    }                                           

    private void nomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        nome = nomeAluno.getText(); 
        data = dataAluno.getText();

        try{ 
            int listaSelecionado = Integer.parseInt(listaCodigoCurso.getSelectedValue().toString());
        

            new conexaoCadastrarAluno(nome,data,listaSelecionado);
            
            nomeAluno.setText("");
            dataAluno.setText("");
            listaCodigoCurso.clearSelection();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Digito Inválido.","Erro", JOptionPane.ERROR_MESSAGE);        
        }

        nomeAluno.setText("");
        dataAluno.setText("");
        listaCodigoCurso.clearSelection();
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
            java.util.logging.Logger.getLogger(cadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastrarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoIncluir;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSairAluno;
    private javax.swing.JTextField dataAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator separador;
    private javax.swing.JList<String> listaCodigoCurso;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JPanel painel;
    // End of variables declaration                   
}
