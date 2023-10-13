package ProjetoJavaGUI.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class conexaoAlterarCurso {
    private int id,id_inst;
    private String nome,carga,botao;
    public conexaoAlterarCurso(int a, String b, int c, String d, String e){
        id = a;
        nome = b;
        id_inst = c;
        carga = d;
        botao = e;
        
        String url = "jdbc:mysql://localhost:3306/projetojava";
        String usuario = "root";
        String senha = "Seiro714714@";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection CONEXAO = DriverManager.getConnection(url, usuario, senha);
            String consultaSQL = "UPDATE cursos" 
                                + " SET nome_curso = ?,"
                                + " cod_inst = ?,"
                                + " carga_curso = ?,"
                                + " tipo_curso = ?"
                                + " WHERE id_curso = ?";
             
            PreparedStatement preparedStatement = CONEXAO.prepareStatement(consultaSQL);
            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2, id_inst);
            preparedStatement.setString(3, carga);
            preparedStatement.setString(4, botao);
            preparedStatement.setInt(5, id);

            int linhasAfetadas = preparedStatement.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            } 
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao alterar dados." + 
                "\n" + "Dados Incompatíveis.","Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
    }
}