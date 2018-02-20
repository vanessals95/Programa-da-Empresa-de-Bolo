
package classes;

/**
 *
 * @author Vanessa
 */
public class vendas {
    private int cod;
    private int quantidade;

    public vendas() {
    }
    
    public vendas(int cod, int quantidade) {
        this.cod = cod;
        this.quantidade = quantidade;
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
