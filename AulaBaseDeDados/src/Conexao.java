import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/nome_do_banco";
    private static final String USUARIO = "A";
    private static final String SENHA = "123";
    private static Connection conexao = null;

    // Método para obter a conexão
    public static Connection getConexao() throws SQLException {
        if (conexao == null || conexao.isClosed()) {
            try {
                // Carregar o driver do MySQL (necessário para versões antigas do JDBC)
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // Estabelecer a conexão
                conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            } catch (ClassNotFoundException e) {
                throw new SQLException("Driver do MySQL não encontrado", e);
            }
        }
        return conexao;
    }

    // Método para fechar a conexão
    public static void fecharConexao() {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
