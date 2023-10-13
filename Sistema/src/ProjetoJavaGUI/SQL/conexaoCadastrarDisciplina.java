package ProjetoJavaGUI.SQL;
import java.sql.*;
import javax.swing.*;

public class conexaoCadastrarDisciplina {
    private String carga, nome, botaoselecionado;
    private int id_curso;

    public conexaoCadastrarDisciplina(String a, String b, String c, int d) {
        nome = a;
        carga = b;
        botaoselecionado = c;
        id_curso = d;

        String url = "jdbc:mysql://localhost:3306/projetojava";
        String usuario = "root";
        String senha = "Seiro714714@";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection CONEXAO = DriverManager.getConnection(url, usuario, senha);
            String consultaSQL = "INSERT INTO disciplina (nome_disciplina, carga_disciplina, quant_aulas_disciplinas,id_curso_disciplina_fk) VALUES (?, ?, ?, ?)";
             
            PreparedStatement preparedStatement = CONEXAO.prepareStatement(consultaSQL);
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, carga);
            preparedStatement.setString(3, botaoselecionado);
            preparedStatement.setInt(4, id_curso);

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