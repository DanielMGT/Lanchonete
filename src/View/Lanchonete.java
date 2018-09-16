/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author danie
 */
public class Lanchonete extends Application implements Initializable {
    private static Stage stage;
    private static Stage popup;
    
    private static Scene menuPrincipal;
    private static Scene telaPedido;
    private static Scene telaProduto;
    private static Scene telaCliente;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
       
        Parent fxmlmenuPrincipal = FXMLLoader.load(getClass().getResource("FXML.menuPrincipal.fxml")); 
        menuPrincipal = new Scene(fxmlmenuPrincipal);
        Parent fxmltelaPedido = FXMLLoader.load(getClass().getResource("FXML.telaPedido.fxml")); 
        telaPedido = new Scene(fxmltelaPedido);
        Parent fxmltelaProduto = FXMLLoader.load(getClass().getResource("FXML.telaProduto.fxml")); 
        telaProduto = new Scene(fxmltelaProduto);
        Parent fxmltelaCliente = FXMLLoader.load(getClass().getResource("FXML.telaCliente.fxml")); 
        telaCliente = new Scene(fxmltelaCliente);
        
        stage.setScene(menuPrincipal);
        stage.show();
    }
    
    public static void trocaTela(String tela){
        switch(tela){
            case "menuPrincipal": stage.setScene(menuPrincipal);
                break;
            case "telaPedido": stage.setScene(telaPedido);
                break;
            case "telaProduto": stage.setScene(telaProduto);
                break;
            case "telaCliente": stage.setScene(telaCliente);
                break;
        }
    }
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
