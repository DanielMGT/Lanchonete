
package Model;

/**
 *
 * @author danie
 */
public class ClienteModel {
    private String nome;
    private String tel;
    private String end;

    public ClienteModel(String nome, String tel, String end) {
        this.nome = nome;
        this.tel = tel;
        this.end = end;
    }
    public ClienteModel() {
        
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }
    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", tel=" + tel + ", end=" + end + '}';
    }
    
}
