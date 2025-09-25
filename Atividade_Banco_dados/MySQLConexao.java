public class MySQLConexao implements Conexao {
    @Override
    public void conectar() {
        System.out.println("Conectado ao banco MySQL!");
    }
}
