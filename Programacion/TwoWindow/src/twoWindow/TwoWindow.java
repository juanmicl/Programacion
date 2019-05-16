package twoWindow;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    public static conector conector = new conector();
    
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
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        /* OldMain.anadirLibro(new Libro("1234", "Don Quijote de la mancha", "Cervantes"));
        OldMain.anadirLibro(new Libro("45678", "El hobbit", "Tolkein"));
        */
        conector.db2array();
        launch(args);
    }
    
}
