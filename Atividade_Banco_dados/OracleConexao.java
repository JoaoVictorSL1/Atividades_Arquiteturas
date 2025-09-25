public class OracleConexao implements Conexao {
    @Override
    public void conectar() {
        System.out.println("Conectado ao banco Oracle!");
    }
}