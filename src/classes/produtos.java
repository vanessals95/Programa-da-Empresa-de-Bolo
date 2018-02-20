
package classes;

import java.util.Date;
import classes.vendas;

/**
 *
 * @author Vanessa
 */
public class produtos {
    
    private int codigo_produto; 
    private String descricao_produto; 	
    private int quantidade_produto;
    private double preco_produto; 
    private Date data_validade_produto;
    
    public int getSubtracaoQuantidade(){
        int sub_quant = 0;
        int quant_vendas = 0;
        int quant_produtos = 0;
        
        vendas vend = new vendas();
        quant_vendas = vend.getQuantidade();
        
        produtos p = new produtos();
        quant_produtos = p.getQuantidade_produto();
        
        sub_quant = quant_produtos - quant_vendas;
        
        return sub_quant;
    }

    public produtos() {
    }
    

    public produtos(int codigo_produto, String descricao_produto, int quantidade_produto, double preco_produto, Date data_validade_produto) {
        this.codigo_produto = codigo_produto;
        this.descricao_produto = descricao_produto;
        this.quantidade_produto = quantidade_produto;
        this.preco_produto = preco_produto;
        this.data_validade_produto = data_validade_produto;
    }

    /**
     * @return the codigo_produto
     */
    
   
    public int getCodigo_produto() {
        return codigo_produto;
    }

    /**
     * @param codigo_produto the codigo_produto to set
     */
    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    /**
     * @return the descricao_produto
     */
    public String getDescricao_produto() {
        return descricao_produto;
    }

    /**
     * @param descricao_produto the descricao_produto to set
     */
    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }
    
     public int getQuantidade_produto() {
        return quantidade_produto;
    }

    public void setQuantidade_produto(int quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    /**
     * @return the preco_produto
     */
    public double getPreco_produto() {
        return preco_produto;
    }

    /**
     * @param preco_produto the preco_produto to set
     */
    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }

    /**
     * @return the data_validade_produto
     */
    public Date getData_validade_produto() {
        return data_validade_produto;
    }

    /**
     * @param data_validade_produto the data_validade_produto to set
     */
    public void setData_validade_produto(Date data_validade_produto) {
        this.data_validade_produto = data_validade_produto;
    }

    public void getData_validade_produto(java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
