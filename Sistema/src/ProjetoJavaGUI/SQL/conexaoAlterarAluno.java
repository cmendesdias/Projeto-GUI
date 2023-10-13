package ProjetoJavaGUI.SQL;
import java.sql.*;
import javax.swing.*;

public class conexaoAlterarAluno {
    private String nome, data;
    public int id_curso,id_aluno;
    public conexaoAlterarAluno(String a, String b, int c, int d){

        String url = "jdbc:mysql://localhost:3306/projetojava";
        String usuario = "root";
        String senha = "Seiro714714@";
        
        nome = a;
        data  = b;
        id_curso = c;
        id_aluno = d;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection CONEXAO = DriverManager.getConnection(url, usuario, senha);
            String consultaSQL = "UPDATE alunos SET nome_aluno = ?, nasc_aluno = ?, id_curso_aluno_fk = ? WHERE id_aluno = ?";

            PreparedStatement preparedStatement = CONEXAO.prepareStatement(consultaSQL);
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, data);
            preparedStatement.setInt(3, id_curso);
            preparedStatement.setInt(4, id_aluno);

            int linhasAfetadas = preparedStatement.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Dados Inválidos.","Erro",JOptionPane.ERROR_MESSAGE);
            } 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir dados." + 
            "\n" + "Dados Incompatíveis.","Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}