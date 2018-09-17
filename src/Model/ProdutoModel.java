
package Model;

/**
 *
 * @author danie
 */
public class ProdutoModel {
    private String nome;
    private double valor;
    private String codigo;
    private String fornecedor;

    public ProdutoModel(String nome, double valor, String codigo, String fornecedor) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
        this.fornecedor = fornecedor;
    }
    public ProdutoModel() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
   
}