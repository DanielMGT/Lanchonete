            
package Model;

public class ClienteModel extends PessoaModel{
    private String end;

    public ClienteModel(String nome, String tel, String end) {
        super(nome, tel);
        this.end = end;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }
    
}
