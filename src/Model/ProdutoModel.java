
package Model;

/**
 *
 * @author danie
 */
public class ProdutoModel extends Pedido {
    private double codigo;
    private String fornecedor;

    public ProdutoModel(double codigo, String desc, double preco) {
        super(desc, preco);
        this.codigo = codigo;
    }

    public double getCodigo() {
        return codigo;
    }
    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

   
}