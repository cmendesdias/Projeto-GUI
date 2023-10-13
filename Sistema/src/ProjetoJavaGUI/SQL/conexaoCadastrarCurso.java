package ProjetoJavaGUI.SQL;
import java.sql.*;
import javax.swing.*;

public class conexaoCadastrarCurso {
    private String carga, tipo, nome;
    private int codInst;

    public conexaoCadastrarCurso(String a, int b, String c, String d) {
        nome = a;
        codInst = b;
        carga = c;
        tipo = d;

        String url = "jdbc:mysql://localhost:3306/projetojava";
        String usuario = "root";
        String senha = "Seiro714714@";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection CONEXAO = DriverManager.getConnection(url, usuario, senha);
            String consultaSQL = "INSERT INTO cursos (nome_curso, cod_inst, carga_curso, tipo_curso) VALUES (?, ?, ?, ?)";
             
            PreparedStatement preparedStatement = CONEXAO.prepareStatement(consultaSQL);
            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2, codInst);
            preparedStatement.setString(3, carga);
            preparedStatement.setString(4, tipo);

            int linhasAfetadas = preparedStatement.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            } 
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao inserir dados.","Erro", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
    }
}