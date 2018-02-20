
package controller;

import classes.produtos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import persistencia.ProdutosDAO;
/**
 *
 * @author Vanessa
 */
public class ProdutosController implements iProdutosController {

    private JTextArea tfProds;
    private produtos prod;

    public ProdutosController(JTextArea tfProds) {
        this.tfProds = tfProds;
    }

    public ProdutosController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void listaProdutos() {
        try {
            ProdutosDAO pdao = new ProdutosDAO();
            tfProds.setText(String.valueOf(pdao.consultaProduto(prod)));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProdutosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
