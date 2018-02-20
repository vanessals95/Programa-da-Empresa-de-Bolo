
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author login
 */
public class Conexao {
    // Arquivo que iniciará a conexao do JAVA com o SGBD
    // Atributos
    String servidor;
    String user;
    String password;
    String database;
    
    Connection connect;
    
    // Construtor da classe conexao contendo as credenciais para a conexao com o banco
    public Conexao(){
        servidor = "localhost:1433;"; // 127.0.0.1 é o IP padrão da porta root
        user = "sa"; // usuario padrao root, podendo variar de acordo com o servidor que deseja conectar
        password = "172569"; // senha vazia padrao root, podendo variar
        database = "databaseName=db_empresa_bolo"; // database é o nome do banco que dados que deseja se conectar
    }
    
    // Metodo que Inicia a conexao com o banco de Dados
    public Connection iniciarConexao() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // Pegando a conexao através da biblioteca e atribuindo o caminho da conexao a variavel de conexao
        connect = DriverManager.getConnection("jdbc:sqlserver://"+ servidor + database + user + password);
        return connect;
    }
    
    // Iniciando a conexao sem o banco especificado
    public Connection iniciarConexaoSemBanco() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // Pegando a conexao através da biblioteca e atribuindo o caminho da conexao (sem o banco especificado) a variavel de conexao
        connect = DriverManager.getConnection("jdbc:sqlserver://"+ servidor + database + user + password);
        return connect;
    } 
    
    // Fechando a conexao com o banco
    public void fecharConexao(){
        try{
            // Tenta fechar a conexao
            this.connect.close();
        }catch(Exception ex){
            // Caso não consiga fechar a conexao, retornará essa janela com o codigo do erro
            JOptionPane.showMessageDialog(null, "A conexão não pode ser fechada devido ao erro: "+ex);
        }
    }
}
