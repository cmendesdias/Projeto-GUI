package ProjetoJavaGUI.SQL;
import java.sql.*;
import javax.swing.*;

public class conexaoCadastrarAluno {
    private String nome, data;
    public int id;
    public conexaoCadastrarAluno(String a, String b, int c){

        String url = "jdbc:mysql://localhost:3306/projetojava";
        String usuario = "root";
        String senha = "Seiro714714@";
        
        nome = a;
        data  = b;
        id = c;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection CONEXAO = DriverManager.getConnection(url, usuario, senha);
            String consultaSQL = "INSERT INTO alunos (nome_aluno, nasc_aluno, id_curso_aluno_fk) VALUES (?, ?, ?)";

            PreparedStatement preparedStatement = CONEXAO.prepareStatement(consultaSQL);
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, data);
            preparedStatement.setInt(3, id);

            int linhasAfetadas = preparedStatement.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            } 
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao inserir dados." + 
                "\n" + "Dados Incompatíveis.","Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
    }
}