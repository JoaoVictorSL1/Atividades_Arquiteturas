public class ConexaoFactory {
    public static Conexao criarConexao(String tipo) {
        if (tipo.equalsIgnoreCase("oracle")) {
            return new OracleConexao();
        } else if (tipo.equalsIgnoreCase("postgresql")) {
            return new PostgreSQLConexao();
        } else if (tipo.equalsIgnoreCase("mysql")) {
            return new MySQLConexao();
        }
        throw new IllegalArgumentException("Tipo de conexão não suportado: " + tipo);
    }
}
