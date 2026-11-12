import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    // Altere as credenciais conforme a sua configuração local/nuvem
    private static final String URL = "jdbc:postgresql://localhost:5432/gestao_conhecimento";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "sua_senha_aqui";

    public static Connection getConexao() throws SQLException {
        try {
            // Carrega o driver do PostgreSQL
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC não encontrado: " + e.getMessage());
        }
    }
}