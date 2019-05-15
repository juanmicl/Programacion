package twoWindow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Antonio Ramos
 */
public class TwoWindow extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainFXML.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Gestor de Libros");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OldMain.anadirLibro(new Libro("1234", "Don Quijote de la mancha", "Cervantes"));
        OldMain.anadirLibro(new Libro("45678", "El hobbit", "Tolkein"));
        launch(args);
    }
    
}
