package ProjetoJavaGUI.SQL;
import java.sql.*;
import javax.swing.*;

public class conexaoExcluirAluno {
    private int id_curso;
    private String nomeCurso;

    public conexaoExcluirAluno(int a, String b){
        id_curso = a;
        nomeCurso = b;

        String url = "jdbc:mysql://localhost:3306/projetojava";
        String usuario = "root";
        String senha = "Seiro714714@";
        
        String mensagem = "Falha ao excluir dados." + "\n" + "Dados Inexistentes.";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection CONEXAO = DriverManager.getConnection(url, usuario, senha);
            String SQL = "DELETE FROM alunos WHERE id_aluno = ? AND nome_aluno = ?";
            PreparedStatement ps = CONEXAO.prepareStatement(SQL);
            ps.setInt(1, id_curso);
            ps.setString(2, nomeCurso);
            int linhasAfetadas = ps.executeUpdate();
            
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, mensagem,"Erro", JOptionPane.OK_CANCEL_OPTION);
            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao excluir dados.","Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
        }
    }
}
