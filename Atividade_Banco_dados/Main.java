public class Main {
    public static void main(String[] args) {
        Conexao oracle = ConexaoFactory.criarConexao("oracle");
        Conexao postgres = ConexaoFactory.criarConexao("postgresql");
        Conexao mysql = ConexaoFactory.criarConexao("mysql");

        oracle.conectar();
        postgres.conectar();
        mysql.conectar();
    }
}
