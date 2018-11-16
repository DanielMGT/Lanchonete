/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import static javafx.application.Application.launch;
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
    private static Scene telaCadastroCliente;
    private static Scene telaAlteracaoCliente;
    private static Scene telaRemocaoCliente;
    private static Scene telaCadastroProduto;
    private static Scene telaAlterarProduto;
    private static Scene telaRemocaoProduto;
    private static Scene telaLogin;
    private static Scene telaCadastroPedido;
    private static Scene telaAlteraPedido;
    private static Scene telaCancelaPedido;
    private static Scene telaContaMesa;
    private static Scene telaEfetuaPag;

    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
       
        Parent fxmlmenuPrincipal = FXMLLoader.load(getClass().getResource("FXML.menuPrincipal.fxml")); 
        menuPrincipal = new Scene(fxmlmenuPrincipal);
        Parent fxmltelaPedido = FXMLLoader.load(getClass().getResource("FXML.TelaPedido.fxml")); 
        telaPedido = new Scene(fxmltelaPedido);
        Parent fxmltelaProduto = FXMLLoader.load(getClass().getResource("FXML.TelaProduto.fxml")); 
        telaProduto = new Scene(fxmltelaProduto);
        Parent fxmltelaCliente = FXMLLoader.load(getClass().getResource("FXML.TelaCliente.fxml")); 
        telaCliente = new Scene(fxmltelaCliente);
        Parent fxmltelaCadastroCliente = FXMLLoader.load(getClass().getResource("FXML.TelaCadastroCliente.fxml")); 
        telaCadastroCliente = new Scene(fxmltelaCadastroCliente);
        Parent fxmltelaAlteracaoCliente = FXMLLoader.load(getClass().getResource("FXML.TelaAlteracaoCliente.fxml")); 
        telaAlteracaoCliente = new Scene(fxmltelaAlteracaoCliente);
        Parent fxmltelaRemocaoCliente = FXMLLoader.load(getClass().getResource("FXML.TelaRemocaoCliente.fxml")); 
        telaRemocaoCliente = new Scene(fxmltelaRemocaoCliente);
        Parent fxmltelaCadastroProduto = FXMLLoader.load(getClass().getResource("FXML.TelaCadastroProduto.fxml")); 
        telaCadastroProduto = new Scene(fxmltelaCadastroProduto);
        Parent fxmltelaAlterarProduto = FXMLLoader.load(getClass().getResource("FXML.TelaAlterarProduto.fxml")); 
        telaAlterarProduto = new Scene(fxmltelaAlterarProduto);
        Parent fxmltelaRemocaoProduto = FXMLLoader.load(getClass().getResource("FXML.TelaRemocaoProduto.fxml")); 
        telaRemocaoProduto = new Scene(fxmltelaRemocaoProduto);
        Parent fxmltelaLogin = FXMLLoader.load(getClass().getResource("FXML.TelaLogin.fxml")); 
        telaLogin = new Scene(fxmltelaLogin);
        Parent fxmltelaCadastroPedido = FXMLLoader.load(getClass().getResource("FXML.TelaCadastroPedido.fxml")); 
        telaCadastroPedido = new Scene(fxmltelaCadastroPedido);
        Parent fxmltelaAlteraPedido = FXMLLoader.load(getClass().getResource("FXML.TelaAlteraPedido.fxml")); 
        telaAlteraPedido = new Scene(fxmltelaAlteraPedido);
        //Parent fxmltelaCancelaPedido = FXMLLoader.load(getClass().getResource("FXML.TelaCancelaPedido.fxml")); 
        //telaCancelaPedido = new Scene(fxmltelaCancelaPedido);
        //Parent fxmltelaContaMesa = FXMLLoader.load(getClass().getResource("FXML.TelaContaMesa.fxml")); 
        //telaContaMesa = new Scene(fxmltelaContaMesa);
        //Parent fxmltelaEfetuaPag = FXMLLoader.load(getClass().getResource("FXML.TelaEfetuaPag.fxml")); 
        //telaEfetuaPag = new Scene(fxmltelaEfetuaPag);
        
        stage.setScene(telaLogin);
        stage.show();
    }
    
    public static void trocaTela(String tela){
        switch(tela){
            case"telaLogin": stage.setScene(telaLogin);
                break;
            case "menuPrincipal": stage.setScene(menuPrincipal);
                break;
            case "telaPedido": stage.setScene(telaPedido);
                break;
            case "telaProduto": stage.setScene(telaProduto);
                break;
            case "telaCliente": stage.setScene(telaCliente);
                break;
            case "telaCadastroCliente": stage.setScene(telaCadastroCliente);
                break;
            case "telaAlteracaoCliente": stage.setScene(telaAlteracaoCliente);
                break;
            case "telaRemocaoCliente": stage.setScene(telaRemocaoCliente);
                break;
            case"telaCadastroProduto": stage.setScene(telaCadastroProduto);
                break;
            case"telaAlterarProduto": stage.setScene(telaAlterarProduto);
                break;
            case"telaRemocaoProduto": stage.setScene(telaRemocaoProduto);
                break;
            case"telaCadastroPedido": stage.setScene(telaCadastroPedido);
                break;
            case"telaAlteraPedido": stage.setScene(telaAlteraPedido);
                break;
            case"telaCancelaPedido": stage.setScene(telaCancelaPedido);
                break;
            case"telaContaMesa": stage.setScene(telaContaMesa);
                break;
            case"telaEfetuaPag": stage.setScene(telaEfetuaPag);
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
