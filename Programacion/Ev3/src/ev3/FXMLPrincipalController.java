package ev3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class FXMLPrincipalController implements Initializable {
    
    private static Utilidades Utilidades = new Utilidades();
    
    @FXML
    // Lista Profesores
    private ListView<Profesor> listProfesores;
    private ObservableList<Profesor> listProfesoresData = FXCollections.observableArrayList();

    // Pestaña Profesores
    @FXML
    private TextField txtProfesoresNif;
    @FXML
    private TextField txtProfesoresNombre;
    @FXML
    private TextField txtProfesoresTelefono;
    @FXML
    private TextField txtProfesoresDireccion;
    @FXML
    private CheckBox chkProfesoresMayor55;
    @FXML
    private RadioButton radProfesoresCarrera;
    @FXML
    private RadioButton radProfesoresInterino;
    
    // Pestaña Añadir
    @FXML
    private TextField txtAnadirNif;
    @FXML
    private TextField txtAnadirNombre;
    @FXML
    private TextField txtAnadirTelefono;
    @FXML
    private TextField txtAnadirDireccion;
    @FXML
    private CheckBox chkAnadirMayor55;
    @FXML
    private RadioButton radAnadirCarrera;
    @FXML
    private RadioButton radAnadirInterino;
    
    // Cargamos Profesores
    @FXML
    public void loadProfesores() {
        radProfesoresCarrera.setSelected(false);
        radProfesoresInterino.setSelected(false);
        if (listProfesores.getSelectionModel().getSelectedItem() != null) {
            System.out.println(listProfesores.getSelectionModel().getSelectedItem().getNombre());
            txtProfesoresNif.setText(listProfesores.getSelectionModel().getSelectedItem().getDni());
            txtProfesoresNombre.setText(listProfesores.getSelectionModel().getSelectedItem().getNombre());
            txtProfesoresTelefono.setText(Integer.toString(listProfesores.getSelectionModel().getSelectedItem().getTelefono()));
            txtProfesoresDireccion.setText(listProfesores.getSelectionModel().getSelectedItem().getDireccion());
            chkProfesoresMayor55.setSelected(listProfesores.getSelectionModel().getSelectedItem().getMayor55());
            if (listProfesores.getSelectionModel().getSelectedItem().getFuncionario() == Profesor.TipoFuncionario.CARRERA) {
                radProfesoresCarrera.setSelected(true);
            } else {
                radProfesoresInterino.setSelected(true);
            }
        }
    }
    
    @FXML
    public void acercade() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("A cerca de");
        alert.setHeaderText("Información a cerca del programa");
        alert.setContentText("Autor: Juan Miguel Contreras.\nCurso: 1º DAW\nAño: 2019");
        alert.showAndWait();
    }
    
    private Profesor getProfesor(String dni) {
        for (Profesor profesor : listProfesoresData) {
            if (profesor.getDni().equalsIgnoreCase(dni)) {
                return profesor;
            }
        }
        return null;
    }
    
    @FXML
    public void anadirProfesor() {
        Profesor profesor;
        Profesor.TipoFuncionario tipoFuncionario;
        if (txtAnadirNif.getText().isEmpty() || txtAnadirNombre.getText().isEmpty() || txtAnadirDireccion.getText().isEmpty() || txtAnadirTelefono.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error al añadir objeto");
            alert.setContentText("Debes de rellenar todos los campos!");
            alert.showAndWait();
        } else {
            profesor = getProfesor(txtAnadirNif.getText());
            if (profesor == null) {
                if (radAnadirCarrera.isSelected() || radAnadirInterino.isSelected()) {
                    if (radAnadirCarrera.isSelected()) {
                        tipoFuncionario = Profesor.TipoFuncionario.CARRERA;
                    } else {
                        tipoFuncionario = Profesor.TipoFuncionario.INTERINO;
                    }
                    if (Utilidades.comprobarDni(txtAnadirNif.getText()) == true) {
                        // Introducimos cliente
                        try {
                            listProfesoresData.add(new Profesor(
                                txtAnadirNif.getText().toUpperCase(),
                                txtAnadirNombre.getText(),
                                txtAnadirDireccion.getText(),
                                Integer.parseInt(txtAnadirTelefono.getText()),
                                tipoFuncionario,
                                chkAnadirMayor55.isSelected()
                            ));
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Éxito");
                            alert.setHeaderText("Éxito al añadir objeto");
                            alert.setContentText("El objeto se ha añadido correctamente!");
                            alert.showAndWait();
                        } catch (NumberFormatException e) {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Error");
                            alert.setHeaderText("Error al añadir objeto");
                            alert.setContentText("El número de teléfono solo debe de contener números!");
                            alert.showAndWait();
                        }
                    } else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Error");
                        alert.setHeaderText("Error al añadir objeto");
                        alert.setContentText("DNI incorrecto!");
                        alert.showAndWait();
                    }
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error al añadir objeto");
                    alert.setContentText("Debes de marcar si es carrera o interino!");
                    alert.showAndWait();
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Error al añadir objeto");
                alert.setContentText("Este profesor ya se encuentra en la base de datos!");
                alert.showAndWait();
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // DATOS DE PRUEBA
        listProfesoresData.add(new Profesor("77222299N", "Pepo", "trucutrucu", 678986132, Profesor.TipoFuncionario.INTERINO, true));
        listProfesoresData.add(new Profesor("77222210N", "Angel", "tracatraca", 657845395, Profesor.TipoFuncionario.CARRERA, false));
        listProfesoresData.add(new Profesor("77222298N", "Ana", "triquitriqui", 67236904, Profesor.TipoFuncionario.INTERINO, true));
        
        listProfesores.setItems(listProfesoresData);
        
        listProfesores.setCellFactory((ListView<Profesor> param) -> {
            ListCell<Profesor> cell = new ListCell<Profesor>() {
                @Override
                protected void updateItem(Profesor prof, boolean bln) {
                    super.updateItem(prof, bln);
                    if (prof == null) {
                        setGraphic(null);
                    } else {
                        Text t = new Text(prof.getDni() + "  -  " + prof.getNombre());
                        setGraphic(t);
                    }
                }
            };
            return cell;
        });
    }    
    
}
