package ProjetoJavaGUI.SQL;
import java.sql.*;
import javax.swing.*;

public class conexaoAlterarDisciplina {
    private String carga, nome, botaoselecionado;
    private int id_curso,id_disciplina;

    public conexaoAlterarDisciplina(String a, String b, String c, int d, int e) {
        nome = a;
        carga = b;
        botaoselecionado = c;
        id_curso = d;
        id_disciplina = e;

        String url = "jdbc:mysql://localhost:3306/projetojava";
        String usuario = "root";
        String senha = "Seiro714714@";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection CONEXAO = DriverManager.getConnection(url, usuario, senha);
            String consultaSQL = "UPDATE disciplina" 
                                + " SET nome_disciplina = ?,"
                                + " carga_disciplina = ?,"
                                + " quant_aulas_disciplinas = ?,"
                                + " id_curso_disciplina_fk = ?"
                                + " WHERE id_disciplina = ?";
             
            PreparedStatement ps = CONEXAO.prepareStatement(consultaSQL);
            ps.setString(1, nome);
            ps.setString(2, carga);
            ps.setString(3, botaoselecionado);
            ps.setInt(4, id_curso);
            ps.setInt(5, id_disciplina);

            int linhasAfetadas = ps.executeUpdate();
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