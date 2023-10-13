package ProjetoJavaGUI.SQL;
import java.sql.*;
import javax.swing.*;

public class conexaoExcluirDisciplina {
    private int id_disciplina;
    private String nome_disciplina;

    public conexaoExcluirDisciplina(int a, String b){
        id_disciplina = a;
        nome_disciplina = b;

        String url = "jdbc:mysql://localhost:3306/projetojava";
        String usuario = "root";
        String senha = "Seiro714714@";
        String mensagem = "Falha ao excluir dados." + "\n" + "Dados Inexistentes.";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection CONEXAO = DriverManager.getConnection(url, usuario, senha);
            String SQL = "DELETE FROM disciplina WHERE id_disciplina = ? AND nome_disciplina = ?";

            PreparedStatement ps = CONEXAO.prepareStatement(SQL);
            ps.setInt(1, id_disciplina);
            ps.setString(2, nome_disciplina);
            int linhasAfetadas = ps.executeUpdate();
            
             if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, mensagem,"Erro", JOptionPane.OK_CANCEL_OPTION);
            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Há professores nesta disciplina.","Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }
}
