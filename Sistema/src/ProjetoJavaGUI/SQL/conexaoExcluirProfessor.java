package ProjetoJavaGUI.SQL;
import java.sql.*;
import javax.swing.*;

public class conexaoExcluirProfessor {
    private int id_professor;
    private String nome_prof;

    public conexaoExcluirProfessor(int a, String b){
        id_professor = a;
        nome_prof = b;

        String url = "jdbc:mysql://localhost:3306/projetojava";
        String usuario = "root";
        String senha = "Seiro714714@";
        
        String mensagem = "Falha ao excluir dados." + "\n" + "Dados Inexistentes.";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection CONEXAO = DriverManager.getConnection(url, usuario, senha);
            String SQL = "DELETE FROM professor WHERE id_professor = ? AND nome_prof = ?";
            PreparedStatement ps = CONEXAO.prepareStatement(SQL);
            ps.setInt(1, id_professor);
            ps.setString(2, nome_prof);
            int linhasAfetadas = ps.executeUpdate();
            
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, mensagem,"Erro", JOptionPane.OK_CANCEL_OPTION);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir dados." + "\n" + "Há professores amarrados nesta disciplina.","Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}
