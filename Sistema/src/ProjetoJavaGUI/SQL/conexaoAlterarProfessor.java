package ProjetoJavaGUI.SQL;
import java.sql.*;
import javax.swing.*;

public class conexaoAlterarProfessor {
    private String nasc, nome, endereco,certificado;
    private int id_curso,id_disciplina,id_professor;

    public conexaoAlterarProfessor(String a, String b, String c, String d, int e, int f, int g){

        String url = "jdbc:mysql://localhost:3306/projetojava";
        String usuario = "root";
        String senha = "Seiro714714@";
        
        nome = a;
        nasc = b;
        endereco = c;
        certificado = d;
        id_curso = e;
        id_disciplina = f;
        id_professor = g;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection CONEXAO = DriverManager.getConnection(url, usuario, senha);
            String consultaSQL = "UPDATE professor SET nome_prof = ?, nasc_prof = ?, endereco = ?, certificado = ?," + 
                                " id_curso_prof_fk = ?, id_disciplina_fk = ? WHERE id_professor = ?";

            PreparedStatement preparedStatement = CONEXAO.prepareStatement(consultaSQL);
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, nasc);
            preparedStatement.setString(3, endereco);
            preparedStatement.setString(4, certificado);
            preparedStatement.setInt(5, id_curso);
            preparedStatement.setInt(6, id_disciplina);
            preparedStatement.setInt(7, id_professor);


            int linhasAfetadas = preparedStatement.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Dados Inválidos.","Erro",JOptionPane.CANCEL_OPTION);
            } 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir dados." + 
            "\n" + "Dados Incompatíveis.","Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}