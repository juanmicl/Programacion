/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv09;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;
import javafx.util.Callback;

/**
 *
 * @author 0101001011
 */
public class FXMLDocumentController implements Initializable {

    private static ES ES = new ES();
    private static Utilidades Utilidades = new Utilidades();
    
    /**
     * Nos devuelve si existe un cliente con dicho dni o null en caso contrario
     * @param dni
     * @return 
     */
    private Cliente getCliente(String dni) {
        for (Cliente cliente : listClientesData) {
            if (cliente.getDni().equalsIgnoreCase(dni)) {
                return cliente;
            }
        }
        return null;
    }

    @FXML
    // Lista Clientes
    private ListView<Cliente> listClientes;
    private ObservableList<Cliente> listClientesData = FXCollections.observableArrayList();

    // TextFields Clientes
    @FXML
    private TextField txtClientesNif = new TextField();
    @FXML
    private TextField txtClientesNombre = new TextField();
    @FXML
    private TextField txtClientesDireccion = new TextField();
    @FXML
    private TextField txtClientesLocalidad = new TextField();
    @FXML
    private TextField txtClientesCP = new TextField();

    @FXML
    public void loadClientes() {
        if (listClientes.getSelectionModel().getSelectedItem() != null) {
            System.out.println(listClientes.getSelectionModel().getSelectedItem().getNombre());
            txtClientesNif.setText(listClientes.getSelectionModel().getSelectedItem().getDni());
            txtClientesNombre.setText(listClientes.getSelectionModel().getSelectedItem().getNombre());
            txtClientesDireccion.setText(listClientes.getSelectionModel().getSelectedItem().getDireccion());
            txtClientesLocalidad.setText(listClientes.getSelectionModel().getSelectedItem().getLocalidad());
            txtClientesCP.setText(listClientes.getSelectionModel().getSelectedItem().getCodigoPostal());
        }
    }

    @FXML
    public void anadirCliente() {
        Cliente cliente;
        cliente = getCliente(txtClientesNif.getText());
        System.out.println(cliente);
        if (cliente == null) {
            if (Utilidades.comprobarDni(txtClientesNif.getText()) != null && Utilidades.comprobarCodigoPostal(txtClientesCP.getText()) != null) {
                // Introducimos cliente
                listClientesData.add(new Cliente(
                    txtClientesNif.getText().toUpperCase(),
                    txtClientesNombre.getText(),
                    txtClientesDireccion.getText(),
                    txtClientesLocalidad.getText(),
                    txtClientesCP.getText()
                ));
            } else {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Error al añadir objeto");
                alert.setContentText("Codigo postal o DNI incorrectos!");
                alert.showAndWait();
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Error al añadir objeto");
                alert.setContentText("Este cliente ya se encuentra en la base de datos!");
                alert.showAndWait();
        }
        
    }

    @FXML
    public void borrarCliente() {
        if (listClientes.getSelectionModel().getSelectedItem() != null) {
            System.out.println("Borrando -> " + listClientes.getSelectionModel().getSelectedItem().getNombre());
            Cliente tempCliente = listClientes.getSelectionModel().getSelectedItem();

            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmación");
            alert.setHeaderText("Necesitamos su confirmación");
            alert.setContentText("¿Está seguro de eliminar a " + listClientes.getSelectionModel().getSelectedItem().getNombre() + "?");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                // borramos cliente
                listClientes.getSelectionModel().select(-1);
                listClientesData.remove(tempCliente);
            } else {
                // no ocurre nada
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error al eliminar objeto");
            alert.setContentText("Necesitas tener un objeto seleccionado para poder eliminarlo!");

            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // metemos datos de prueba
        listClientesData.add(new Cliente("11232311A", "Pepe Lopez", "Calle de arriba", "Vicar", "04720"));
        listClientesData.add(new Cliente("11232999B", "Andrea Perez", "Calle de en medio", "Vicar", "04720"));
        listClientesData.add(new Cliente("11456711C", "Alex Romero", "Calle de abajo", "Vicar", "04720"));

        listClientes.setItems(listClientesData);

        listClientes.setCellFactory(new Callback<ListView<Cliente>, ListCell<Cliente>>() {
            @Override
            public ListCell<Cliente> call(ListView<Cliente> param) {
                ListCell<Cliente> cell = new ListCell<Cliente>() {
                    @Override
                    protected void updateItem(Cliente cli, boolean bln) {
                        super.updateItem(cli, bln);
                        if (cli == null) {
                            setGraphic(null);
                        } else {
                            Text t = new Text(cli.getDni() + "  -  " + cli.getNombre());
                            setGraphic(t);
                        }
                    }
                };
                return cell;
            }
        });
    }
}
