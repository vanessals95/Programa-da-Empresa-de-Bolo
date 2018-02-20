
package persistencia;

import classes.produtos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vanessa
 */
public class ProdutosDAO implements iProdutosDAO{

    private Connection c;
    
    public ProdutosDAO() throws ClassNotFoundException, SQLException{
        Conexao cone = new Conexao();
        c = cone.iniciarConexao();
    }
    
    @Override
    public void Inserir(produtos prod) throws SQLException {
        String sql = "INSERT INTO produto_cadastrado (codigo_produto, descricao_produto, quantidade_produto, preco_produto, data_validade_produto) VALUES (?,?,?,?,?)";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1, prod.getCodigo_produto());
        ps.setString(2, prod.getDescricao_produto());
        ps.setInt(3, prod.getQuantidade_produto());
        ps.setDouble(4, prod.getPreco_produto());
        ps.setDate(5, (Date) prod.getData_validade_produto());
        ps.execute();
        ps.close();
    }
        
    @Override
    public void Atualizar(produtos prod) throws SQLException {
        String sql = "UPDATE produto_cadastrado SET quantidade_produto = ? WHERE codigo_produto = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setInt(1,prod.getSubtracaoQuantidade());
        ps.setInt(2, prod.getCodigo_produto());
        ps.execute();
        ps.close();
    }
    
    @Override
    public produtos consultaProduto(produtos prod) throws SQLException {
      String sql = "SELECT codigo_produto, descricao_produto, quantidade_produto, preco_produto, data_validade_produto FROM produto_cadastrado WHERE codigo_produto = ?";
      PreparedStatement ps = c.prepareStatement(sql);
      ps.setInt(1, prod.getCodigo_produto());
      ResultSet rs = ps.executeQuery();
      if(rs.next()){
          prod.setCodigo_produto(rs.getInt("codigo_produto"));
          prod.setDescricao_produto(rs.getString("descricao_produto"));
          prod.setQuantidade_produto(rs.getInt("quantidade_produto"));
          prod.setPreco_produto(rs.getDouble("preco_produto"));
          prod.getData_validade_produto(rs.getDate("data_validade_produto"));
      }
      rs.close();
      ps.close();
      return prod;
    }

}
