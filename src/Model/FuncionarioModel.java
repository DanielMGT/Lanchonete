package Model;

public class FuncionarioModel extends PessoaModel {    
    private String matricula;

    
    public FuncionarioModel(String nome, String tel, String matricula) {
        super(nome, tel);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
