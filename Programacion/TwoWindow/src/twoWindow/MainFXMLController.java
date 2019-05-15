package twoWindow;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Antonio Ramos
 */
public class MainFXMLController implements Initializable {
    
    @FXML
    private AnchorPane mainPane;
    
    @FXML
    private TextField tf_isbn;    
    @FXML
    private TextField tf_nombre;
    @FXML
    private TextField tf_autor;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mostrarDatos(OldMain.siguienteLibro());
    }  
    
    @FXML
    private void siguienteLibroBtnAction(ActionEvent event) {
        mostrarDatos(OldMain.siguienteLibro());
    }
    
    @FXML
    private void anteriorLibroBtnAction(ActionEvent event) {
        mostrarDatos(OldMain.anteriorLibro());
    }
    
    @FXML
    private void cargarPanelAnadirLibroBtnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddBookFXML.fxml"));        
        Scene scene = new Scene(root);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Añadir Libro");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }
    
    private void mostrarDatos(Libro libro){
        if(libro != null){
            tf_isbn.setText(libro.getIsbn());
            tf_nombre.setText(libro.getNombre());
            tf_autor.setText(libro.getAutor());
        }
        
    }
    
}
