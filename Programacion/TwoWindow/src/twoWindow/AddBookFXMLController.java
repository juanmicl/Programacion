package twoWindow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import twoWindow.OldMain;

/**
 * FXML Controller class
 *
 * @author Antonio Ramos
 */
public class AddBookFXMLController implements Initializable {

    @FXML
    private Button btn_cancel;
    @FXML
    private TextField tf_isbn;
    @FXML
    private TextField tf_nombre;
    @FXML
    private TextField tf_autor;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * Método que llama el botón cancel para cerrar la ventana actual y 
     * volver al panel principal
     * @param event 
     */
    @FXML
    private void volverPanelPrincipal(ActionEvent event) {
        closePane();
    }

    /**
     * Método que añade un nuevo libro al arraylist
     * @param event 
     */
    @FXML
    private void anadirLibro(ActionEvent event) {
        if (tf_autor.getText().equals("") || tf_isbn.getText().equals("") || tf_nombre.getText().equals("")) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Campos vacíos:");
            alert.setContentText("Es necesario completar todos los campos");

            alert.showAndWait();
        }
        else{
            OldMain.anadirLibro(new Libro(tf_isbn.getText(), tf_nombre.getText(), tf_autor.getText()));
            
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Libro añadido");
            alert.setHeaderText("Libro añadido correctamente.");
            alert.showAndWait();
            
            closePane();
        }        
    }
    
    /**
     * Método que cierra la ventana actual
     */
    private void closePane(){
        Stage stage = (Stage) btn_cancel.getScene().getWindow();
        stage.close();
    }
}
