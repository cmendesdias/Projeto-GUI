package ProjetoJavaGUI.iniciar;

import ProjetoJavaGUI.itensMenuAlterarDeletar.alterarAluno;
import ProjetoJavaGUI.itensMenuAlterarDeletar.alterarCurso;
import ProjetoJavaGUI.itensMenuAlterarDeletar.alterarDisciplina;
import ProjetoJavaGUI.itensMenuAlterarDeletar.alterarProfessor;
import ProjetoJavaGUI.itensMenuAlterarDeletar.excluirAluno;
import ProjetoJavaGUI.itensMenuAlterarDeletar.excluirCurso;
import ProjetoJavaGUI.itensMenuAlterarDeletar.excluirDisciplina;
import ProjetoJavaGUI.itensMenuAlterarDeletar.excluirProfessor;

import ProjetoJavaGUI.itensMenuCadastrar.cadastrarAluno;
import ProjetoJavaGUI.itensMenuCadastrar.cadastrarCurso;
import ProjetoJavaGUI.itensMenuCadastrar.cadastrarDisciplina;
import ProjetoJavaGUI.itensMenuCadastrar.cadastrarProfessor;

import ProjetoJavaGUI.itensMenuConsultar.consultarAluno;
import ProjetoJavaGUI.itensMenuConsultar.consultarCurso;
import ProjetoJavaGUI.itensMenuConsultar.consultarCursosDisciplinas;
import ProjetoJavaGUI.itensMenuConsultar.consultarCursosProfessores;
import ProjetoJavaGUI.itensMenuConsultar.consultarDisciplina;
import ProjetoJavaGUI.itensMenuConsultar.consultarDisciplinaProfessor;
import ProjetoJavaGUI.itensMenuConsultar.consultarProfessor;


/**
 *
 * @author cdias
 */
public class controleGeral extends javax.swing.JFrame {
 
    public controleGeral() {
	    setResizable(false);
        initComponents();
        setTitle("Sistema de Controle Acadêmico");
        setLocation(500,240);
    }

    @SuppressWarnings("all")
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        painel = new javax.swing.JPanel();
        menuBarra = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        itemCurso = new javax.swing.JMenuItem();
        itemDisciplina = new javax.swing.JMenuItem();
        itemAluno = new javax.swing.JMenuItem();
        itemProfessor = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        consultarCursos = new javax.swing.JMenuItem();
        consultarDisciplinas = new javax.swing.JMenuItem();
        consultarAlunos = new javax.swing.JMenuItem();
        consultarProfessores = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        consultaCursosProfessores = new javax.swing.JMenuItem();
        consultaCursosDisciplinas = new javax.swing.JMenuItem();
        consultaDiscplinasProfessores = new javax.swing.JMenuItem();
        menuAlterar = new javax.swing.JMenu();
        botaoItemAlterarCurso = new javax.swing.JMenuItem();
        botaoItemExcluirCurso = new javax.swing.JMenuItem();
        separador2 = new javax.swing.JPopupMenu.Separator();
        botaoItemAlterarDisciplina = new javax.swing.JMenuItem();
        botaoItemExcluirDisciplina = new javax.swing.JMenuItem();
        separardor3 = new javax.swing.JPopupMenu.Separator();
        botaoItemAlterarAluno = new javax.swing.JMenuItem();
        botaoItemExcluirAluno = new javax.swing.JMenuItem();
        separador4 = new javax.swing.JPopupMenu.Separator();
        botaoItemAlterarProf = new javax.swing.JMenuItem();
        botaoItemExcluirProf = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 51));
        jLayeredPane1.setForeground(new java.awt.Color(255, 255, 51));

        painel.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(painel);
        painel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(painel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuCadastrar.setText("Cadastrar");

        itemCurso.setText("Cursos");
        itemCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCursoActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemCurso);

        itemDisciplina.setText("Disciplina");
        itemDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDisciplinaActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemDisciplina);

        itemAluno.setText("Aluno");
        itemAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlunoActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemAluno);

        itemProfessor.setText("Professor");
        itemProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProfessorActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemProfessor);

        menuBarra.add(menuCadastrar);

        menuConsultar.setText("Consultar");

        consultarCursos.setText("Cursos");
        consultarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCursosActionPerformed(evt);
            }
        });
        menuConsultar.add(consultarCursos);

        consultarDisciplinas.setText("Disciplinas");
        consultarDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarDisciplinasActionPerformed(evt);
            }
        });
        menuConsultar.add(consultarDisciplinas);

        consultarAlunos.setText("Alunos");
        consultarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAlunosActionPerformed(evt);
            }
        });
        menuConsultar.add(consultarAlunos);

        consultarProfessores.setText("Professores");
        consultarProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarProfessoresActionPerformed(evt);
            }
        });
        menuConsultar.add(consultarProfessores);
        menuConsultar.add(separador1);

        consultaCursosProfessores.setText("Cursos/Professores");
        consultaCursosProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaCursosProfessoresActionPerformed(evt);
            }
        });
        menuConsultar.add(consultaCursosProfessores);

        consultaCursosDisciplinas.setText("Cursos/Disciplinas");
        consultaCursosDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaCursosDisciplinasActionPerformed(evt);
            }
        });
        menuConsultar.add(consultaCursosDisciplinas);

        consultaDiscplinasProfessores.setText("Disciplinas/Professores");
        consultaDiscplinasProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaDiscplinasProfessoresActionPerformed(evt);
            }
        });
        menuConsultar.add(consultaDiscplinasProfessores);

        menuBarra.add(menuConsultar);

        menuAlterar.setText("Alterar");

        botaoItemAlterarCurso.setText("Alterar Curso");
        botaoItemAlterarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoItemAlterarCursoActionPerformed(evt);
            }
        });
        menuAlterar.add(botaoItemAlterarCurso);

        botaoItemExcluirCurso.setText("Excluir Curso");
        botaoItemExcluirCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoItemExcluirCursoActionPerformed(evt);
            }
        });
        menuAlterar.add(botaoItemExcluirCurso);
        menuAlterar.add(separador2);

        botaoItemAlterarDisciplina.setText("Alterar Disciplina");
        botaoItemAlterarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoItemAlterarDisciplinaActionPerformed(evt);
            }
        });
        menuAlterar.add(botaoItemAlterarDisciplina);

        botaoItemExcluirDisciplina.setText("Excluir Disciplina");
        botaoItemExcluirDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoItemExcluirDisciplinaActionPerformed(evt);
            }
        });
        menuAlterar.add(botaoItemExcluirDisciplina);
        menuAlterar.add(separardor3);

        botaoItemAlterarAluno.setText("Alterar Aluno");
        botaoItemAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoItemAlterarAlunoActionPerformed(evt);
            }
        });
        menuAlterar.add(botaoItemAlterarAluno);

        botaoItemExcluirAluno.setText("Excluir Aluno");
        botaoItemExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoItemExcluirAlunoActionPerformed(evt);
            }
        });
        menuAlterar.add(botaoItemExcluirAluno);
        menuAlterar.add(separador4);

        botaoItemAlterarProf.setText("Alterar Professor");
        botaoItemAlterarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoItemAlterarProfActionPerformed(evt);
            }
        });
        menuAlterar.add(botaoItemAlterarProf);

        botaoItemExcluirProf.setText("Excluir Professor");
        botaoItemExcluirProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoItemExcluirProfActionPerformed(evt);
            }
        });
        menuAlterar.add(botaoItemExcluirProf);

        menuBarra.add(menuAlterar);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuSair.add(menuItemSair);

        menuBarra.add(menuSair);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>                        

    private void itemCursoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        new cadastrarCurso().setVisible(true);
        this.setVisible(false);
    }                                         

    private void itemDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        new cadastrarDisciplina().setVisible(true);
        this.setVisible(false);
    }                                              

    private void itemAlunoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        new cadastrarAluno().setVisible(true);
        this.setVisible(false);
    }                                         

    private void itemProfessorActionPerformed(java.awt.event.ActionEvent evt) {                                              
        new cadastrarProfessor().setVisible(true);
        this.setVisible(false);        
    }                                             

    private void consultarAlunosActionPerformed(java.awt.event.ActionEvent evt) {      
        this.setVisible(false);
        new consultarAluno().setVisible(true);
    }                                               

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }                                        

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {                                             
                System.exit(0);
    }                                            

    private void botaoItemExcluirDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        new excluirDisciplina().setVisible(true);
        this.setVisible(false);
    }                                                          

    private void botaoItemAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        new alterarAluno().setVisible(true);
        this.setVisible(false);
    }                                                     

    private void botaoItemExcluirCursoActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        new excluirCurso().setVisible(true);
        this.setVisible(false);
    }                                                     

    private void botaoItemAlterarCursoActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        new alterarCurso().setVisible(true);
        this.setVisible(false);
    }                                                     

    private void botaoItemExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        new excluirAluno().setVisible(true);
        this.setVisible(false);
    }                                                     

    private void botaoItemExcluirProfActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        new excluirProfessor().setVisible(true);
        this.setVisible(false);
    }                                                    

    private void botaoItemAlterarProfActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        new alterarProfessor().setVisible(true);
        this.setVisible(false);
    }                                                    

    private void botaoItemAlterarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        new alterarDisciplina().setVisible(true);
        this.setVisible(false);
    }                                                          

    private void consultarProfessoresActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        new consultarProfessor().setVisible(true);
        this.setVisible(false);
    }                                                    

    private void consultarDisciplinasActionPerformed(java.awt.event.ActionEvent evt) { 
        new consultarDisciplina().setVisible(true);     
        this.setVisible(false);                                              
    }                                                    

    private void consultarCursosActionPerformed(java.awt.event.ActionEvent evt) {                                                
        new consultarCurso().setVisible(true);
        this.setVisible(false);
    }                                               

    private void consultaCursosProfessoresActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        new consultarCursosProfessores().setVisible(true);
        this.setVisible(false);
    }                                                         

    private void consultaCursosDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {      
        new consultarCursosDisciplinas().setVisible(true);
        this.setVisible(false);                                                    
    }                                                         

    private void consultaDiscplinasProfessoresActionPerformed(java.awt.event.ActionEvent evt) {        
        new consultarDisciplinaProfessor().setVisible(true); 
        this.setVisible(false);                                                     
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
            java.util.logging.Logger.getLogger(controleGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controleGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controleGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controleGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //tornando visivel o frame
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controleGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenuItem botaoItemAlterarAluno;
    private javax.swing.JMenuItem botaoItemAlterarCurso;
    private javax.swing.JMenuItem botaoItemAlterarDisciplina;
    private javax.swing.JMenuItem botaoItemAlterarProf;
    private javax.swing.JMenuItem botaoItemExcluirAluno;
    private javax.swing.JMenuItem botaoItemExcluirCurso;
    private javax.swing.JMenuItem botaoItemExcluirDisciplina;
    private javax.swing.JMenuItem botaoItemExcluirProf;
    private javax.swing.JMenuItem consultaCursosDisciplinas;
    private javax.swing.JMenuItem consultaCursosProfessores;
    private javax.swing.JMenuItem consultaDiscplinasProfessores;
    private javax.swing.JMenuItem consultarAlunos;
    private javax.swing.JMenuItem consultarCursos;
    private javax.swing.JMenuItem consultarDisciplinas;
    private javax.swing.JMenuItem consultarProfessores;
    private javax.swing.JMenuItem itemAluno;
    private javax.swing.JMenuItem itemCurso;
    private javax.swing.JMenuItem itemDisciplina;
    private javax.swing.JMenuItem itemProfessor;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JPanel painel;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JPopupMenu.Separator separador2;
    private javax.swing.JPopupMenu.Separator separardor3;
    private javax.swing.JPopupMenu.Separator separador4;
    private javax.swing.JMenu menuAlterar;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenu menuSair;
    // End of variables declaration                   
}
