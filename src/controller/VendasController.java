
package controller;

import classes.vendas;
import javax.swing.JTextField;

/**
 *
 * @author Vanessa
 */
public class VendasController implements iVendasController {
    
    private JTextField codven;
    private JTextField quant;

    public VendasController() {
    }

    public VendasController(JTextField codven) {
        this.codven = codven;
    }
    
    @Override
    public void controlaEstoque() {
        vendas v = new vendas();
        v.setCod(Integer.parseInt(codven.getText()));
        v.setQuantidade(Integer.parseInt(quant.getText()));
    }
    
}
