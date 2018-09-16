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

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
       
        Parent fxmlmenuPrincipal = FXMLLoader.load(getClass().getResource("FXML.menuPrincipal.fxml")); 
        menuPrincipal = new Scene(fxmlmenuPrincipal);
        
        stage.setScene(menuPrincipal);
        stage.show();
    }
    
    public static void trocaTela(String tela){
        switch(tela){
            case "menuPrincipal": stage.setScene(menuPrincipal);
            break;
            //case "telaDePedido": stage.setScene(pedidoScene);
            //break;
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
