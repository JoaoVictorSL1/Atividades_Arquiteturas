public class PostgreSQLConexao implements Conexao {
    @Override
    public void conectar() {
        System.out.println("Conectado ao banco PostgreSQL!");
    }
}
