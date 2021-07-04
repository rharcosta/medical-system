package sistemamedico.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {

    public Connection connection;
    public Statement statement;
    public ResultSet result;
    private final String DRIVER = ("com.mysql.cj.jdbc.Driver");
    private final String URL = "jdbc:mysql://localhost:3306/Pief?serverTimezone=UTC";
    private final String LOGIN = "root";
    private final String SENHA = "root";

    public void abrirConexao() {
        try {
            Class.forName(DRIVER).newInstance();
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
            statement = connection.createStatement();
            //JOptionPane.showMessageDialog(null, "Conexão OK!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o Banco de Dados", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void fecharConexao() throws Exception {
        statement.close();
        connection.close();
        result.close();
        JOptionPane.showMessageDialog(null, "BD desconectou!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        fecharConexao();
    }

}
