package persistencia;

import classes.produtos;
import java.awt.List;
import java.sql.SQLException;

/**
 *
 * @author Vanessa
 */
public interface iProdutosDAO {
    public void Inserir(produtos prod) throws SQLException;
    public void Atualizar(produtos prod) throws SQLException;
    public produtos consultaProduto(produtos prod) throws SQLException;    
}
