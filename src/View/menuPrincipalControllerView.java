                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 

package View;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author danie
 */
public class menuPrincipalControllerView implements Initializable {
      
    @FXML
    private Label lbmenuPrincipal;
    @FXML
    private Button btPedido;
    @FXML
    private Button btCliente;
    @FXML
    private Button btProduto;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    public void chamaPedido(){
        Lanchonete.trocaTela("telaPedido");
    }
    
    public void chamaCliente(){
        Lanchonete.trocaTela("telaCliente");
    }
    
    public void chamaProduto(){
        Lanchonete.trocaTela("telaProduto");
    }
    
    public void chamaLogin(){       
        Lanchonete.trocaTela("telaLogin");
    }
    
}