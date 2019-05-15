/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv09;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    // MYSQL
    private static conector SQL = new conector();
    private static Connection conn = SQL.conectarMySQL();
    // PreparedStatement
    
    Statement s;
    
    public FXMLDocumentController() throws SQLException {
        this.s = conn.createStatement();
    }
        
          
   ResultSet rs = s.executeQuery ("INSERT INTO `clientes` (`dni`, `nombre`, `direccion`, `localidad`, `codigoPostal`) VALUES ('123', 'juan', 'asd', 'asd', '04720')");

    
    
    private Cliente getCliente(String dni) {
        for (Cliente cliente : listClientesData) {
            if (cliente.getDni().equalsIgnoreCase(dni)) {
                return cliente;
            }
        }
        return null;
    }
    
    private Vehiculo getVehiculo(String matricula) {
        for (Vehiculo vehiculo : listVehiculosData) {
            if (vehiculo.getMatricula().equalsIgnoreCase(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }
    
    private Alquiler getAlquiler(Cliente cliente, Vehiculo vehiculo) {
        for (Alquiler alquiler : listAlquileresData) {
            if (alquiler.getCliente() == cliente && alquiler.getVehiculo() == vehiculo) {
                return alquiler;
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
    // Lista Vehículos
    private ListView<Vehiculo> listVehiculos;
    private ObservableList<Vehiculo> listVehiculosData = FXCollections.observableArrayList();
    
    // TextFields Vehiculos
    @FXML
    private TextField txtVehMatricula = new TextField();
    @FXML
    private TextField txtVehMarca = new TextField();
    @FXML
    private TextField txtVehModelo = new TextField();
    @FXML
    private TextField txtVehCilindrada = new TextField();
    @FXML
    private CheckBox chkVehDisponible = new CheckBox();
    
    @FXML
    // Lista Alquileres
    private ListView<Alquiler> listAlquileres;
    private ObservableList<Alquiler> listAlquileresData = FXCollections.observableArrayList();

    // TextFields Alquileres
    @FXML
    private TextField txtAlqNif = new TextField();
    @FXML
    private TextField txtAlqNombre = new TextField();
    @FXML
    private TextField txtAlqDireccion = new TextField();
    @FXML
    private TextField txtAlqLocalidad = new TextField();
    @FXML
    private TextField txtAlqCP = new TextField();
    @FXML
    private TextField txtAlqMatricula = new TextField();
    @FXML
    private TextField txtAlqMarca = new TextField();
    @FXML
    private TextField txtAlqModelo = new TextField();
    @FXML
    private TextField txtAlqCilindrada = new TextField();
    @FXML
    private CheckBox chkAlqDisponible = new CheckBox();
    
    
    @FXML
    public void loadAlquileres() {
        if (listAlquileres.getSelectionModel().getSelectedItem() != null) {
            txtAlqNif.setText(listAlquileres.getSelectionModel().getSelectedItem().getCliente().getDni());
            txtAlqNombre.setText(listAlquileres.getSelectionModel().getSelectedItem().getCliente().getNombre());
            txtAlqDireccion.setText(listAlquileres.getSelectionModel().getSelectedItem().getCliente().getDireccion());
            txtAlqLocalidad.setText(String.valueOf(listAlquileres.getSelectionModel().getSelectedItem().getCliente().getLocalidad()));
            txtAlqCP.setText(listAlquileres.getSelectionModel().getSelectedItem().getCliente().getCodigoPostal());
            txtAlqMatricula.setText(listAlquileres.getSelectionModel().getSelectedItem().getVehiculo().getMatricula());
            txtAlqMarca.setText(listAlquileres.getSelectionModel().getSelectedItem().getVehiculo().getMarca());
            txtAlqModelo.setText(listAlquileres.getSelectionModel().getSelectedItem().getVehiculo().getModelo());
            txtAlqCilindrada.setText(String.valueOf(listAlquileres.getSelectionModel().getSelectedItem().getVehiculo().getCilindrada()));
            chkAlqDisponible.setSelected(listAlquileres.getSelectionModel().getSelectedItem().getVehiculo().isDisponible());
        }
    }
    
    @FXML
    public void anadirAlquiler() {
        Vehiculo vehiculo;
        Cliente cliente;
        Alquiler alquiler;
        vehiculo = getVehiculo(txtAlqMatricula.getText());
        cliente = getCliente(txtAlqNif.getText());
        alquiler = getAlquiler(cliente, vehiculo);
        if (vehiculo != null && cliente != null) {
            if (alquiler == null) {
                if (Utilidades.comprobarMatricula(txtAlqMatricula.getText()) != null && Utilidades.comprobarDni(txtAlqNif.getText()) != null) {
                    // Introducimos vehiculo
                    listAlquileresData.add(new Alquiler(cliente, vehiculo));
                } else {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error al añadir objeto");
                    alert.setContentText("Matricula o DNI incorrecta!");
                    alert.showAndWait();
                }
            } else {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Error al añadir objeto");
                alert.setContentText("Este Alquiler ya se encuentra activo!");
                alert.showAndWait();
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error al añadir objeto");
            alert.setContentText("Este vehículo o DNI no se encuentran en la base de datos!");
            alert.showAndWait();
        }
    }
    
    @FXML
    public void borrarAlquiler() {
        if (listAlquileres.getSelectionModel().getSelectedItem() != null) {
            Alquiler tempAlquiler = listAlquileres.getSelectionModel().getSelectedItem();

            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmación");
            alert.setHeaderText("Necesitamos su confirmación");
            alert.setContentText("¿Está seguro de eliminar este alquiler?");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                // borramos vehiculo
                listAlquileres.getSelectionModel().select(-1);
                listAlquileresData.remove(tempAlquiler);
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
    
    @FXML
    public void loadVehiculos() {
        if (listVehiculos.getSelectionModel().getSelectedItem() != null) {
            System.out.println(listVehiculos.getSelectionModel().getSelectedItem().getMatricula());
            txtVehMatricula.setText(listVehiculos.getSelectionModel().getSelectedItem().getMatricula());
            txtVehMarca.setText(listVehiculos.getSelectionModel().getSelectedItem().getMarca());
            txtVehModelo.setText(listVehiculos.getSelectionModel().getSelectedItem().getModelo());
            txtVehCilindrada.setText(String.valueOf(listVehiculos.getSelectionModel().getSelectedItem().getCilindrada()));
            chkVehDisponible.setSelected(listVehiculos.getSelectionModel().getSelectedItem().isDisponible());
        }
    }
    
    @FXML
    public void anadirVehiculo() {
        Vehiculo vehiculo;
        vehiculo = getVehiculo(txtVehMatricula.getText());
        System.out.println(vehiculo);
        if (vehiculo == null) {
            //ES.escribirLn(Utilidades.comprobarMatricula(txtVehMatricula.getText()));
            if (Utilidades.comprobarMatricula(txtVehMatricula.getText()) != null) {
                // Introducimos vehiculo
                listVehiculosData.add(new Familiar(
                    0,
                    false,
                    0,
                    Enumerados.TipoCombustible.DIESEL,
                    txtVehMatricula.getText().toUpperCase(),
                    txtVehMarca.getText(),
                    txtVehModelo.getText(),
                    Integer.parseInt(txtVehCilindrada.getText())
                ));
            } else {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Error al añadir objeto");
                alert.setContentText("Matricula incorrecta!");
                alert.showAndWait();
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Error al añadir objeto");
                alert.setContentText("Este vehículo ya se encuentra en la base de datos!");
                alert.showAndWait();
        }
        
    }
    
    @FXML
    public void borrarVehiculo() {
        if (listVehiculos.getSelectionModel().getSelectedItem() != null) {
            System.out.println("Borrando -> " + listVehiculos.getSelectionModel().getSelectedItem().getMatricula());
            Vehiculo tempVehiculo = listVehiculos.getSelectionModel().getSelectedItem();

            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmación");
            alert.setHeaderText("Necesitamos su confirmación");
            alert.setContentText("¿Está seguro de eliminar a " + listVehiculos.getSelectionModel().getSelectedItem().getMatricula() + "?");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                // borramos vehiculo
                listVehiculos.getSelectionModel().select(-1);
                listVehiculosData.remove(tempVehiculo);
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
    
    public void guardarDatos(){
        String ruta = "";
        String texto = "";
        
        // Clientes
        ES.escribirArchivo(ruta+"clientes.txt", "", false);
        for (Cliente cliente : listClientesData) {
            texto = cliente.getDni()+"#"+cliente.getNombre()+"#"+cliente.getDireccion()+"#"+cliente.getLocalidad()+"#"+cliente.getCodigoPostal()+"\n";
            ES.escribirArchivo(ruta+"clientes.txt", texto, true);
        }
        
        // Vehiculos
        ES.escribirArchivo(ruta+"vehiculos.txt", "", false);
        for (Vehiculo vehiculo : listVehiculosData) {
            texto = vehiculo.getClass().getSimpleName()+"#"+vehiculo.getMatricula()+"#"+vehiculo.getMarca()+"#"+vehiculo.getModelo()+"#"+vehiculo.getCilindrada()+"\n";
            ES.escribirArchivo(ruta+"vehiculos.txt", texto, true);
        }
        
        // Alquileres
        ES.escribirArchivo(ruta+"alquileres.txt", "", false);
        for (Alquiler alquiler : listAlquileresData) {
            texto = alquiler.getCliente()+"#"+alquiler.getVehiculo()+"#"+alquiler.getDias()+"#"+alquiler.getFecha()+"\n";
            ES.escribirArchivo(ruta+"alquileres.txt", texto, true);
        }
    }
    
    @FXML
    public void leerDatos() throws IOException{
        String ruta = "";
        String[] txt;
        String[] elemento;
        
        // Clientes
        txt = ES.leerArchivo(ruta+"clientes.txt").split("\n");
        for (String linea : txt) {
            if (linea.matches("^(.*)#(.*)#(.*)#(.*)#(.*)$")) {
                elemento = linea.split("#");
                listClientesData.add(new Cliente(
                    elemento[0],
                    elemento[1],
                    elemento[2],
                    elemento[3],
                    elemento[4]
                ));
            } 
        }
        // Vehiculos
        txt = ES.leerArchivo(ruta+"vehiculos.txt").split("\n");
        for (String linea : txt) {
            if (linea.matches("^(.*)#(.*)#(.*)#(.*)#(.*)$")) {
                elemento = linea.split("#");
                switch(elemento[0].toLowerCase()){
                    case "deportivo":
                        // pongo por defecto estos valores como ejemplo
                        listVehiculosData.add(new Deportivo(true, Enumerados.CajaCambios.MANUAL, 3, Enumerados.TipoCombustible.DIESEL, elemento[1], elemento[2], elemento[3], Integer.valueOf(elemento[4])));
                        break;
                    case "familiar":
                        // pongo por defecto estos valores como ejemplo
                        listVehiculosData.add(new Familiar(7, true, 5, Enumerados.TipoCombustible.DIESEL, elemento[1], elemento[2], elemento[3], Integer.valueOf(elemento[4])));
                        break;
                    case "furgoneta":
                        // pongo por defecto estos valores como ejemplo
                        listVehiculosData.add(new Furgoneta(false, Enumerados.Tamanio.GRANDE, 10, 10, elemento[1], elemento[2], elemento[3], Integer.valueOf(elemento[4])));
                        break;
                    default:
                        ES.escribirLn("Se han encontrado datos corruptos!");
                        break;
                }
            } 
        }
        // Alquileres
        txt = ES.leerArchivo(ruta+"alquileres.txt").split("\n");
        for (String linea : txt) {
            if (linea.matches("^(.*)#(.*)#(.*)#(.*)$")) {
                elemento = linea.split("#");
                // la idea es añadir dni y matricula... y aquí luego crear la "relación" con su nuevo objeto
                //alquileres.add(new Alquiler(elemento[0], elemento[1]));
            } 
        }
    }
    
    @FXML
    public void acercade() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("A cerca de");
        alert.setHeaderText("Información a cerca del programa");
        alert.setContentText("Creado por Juan Miguel Contreras.");
        alert.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /* metemos datos de prueba
        listClientesData.add(new Cliente("11232311A", "Pepe Lopez", "Calle de arriba", "Vicar", "04720"));
        listClientesData.add(new Cliente("11232999B", "Andrea Perez", "Calle de en medio", "Vicar", "04720"));
        listClientesData.add(new Cliente("11456711C", "Alex Romero", "Calle de abajo", "Vicar", "04720"));
        // metemos vehiculos de prueba
        listVehiculosData.add(new Familiar(0, true, 0, Enumerados.TipoCombustible.DIESEL, "1111BBB", "Audi", "A3", 0));
        listVehiculosData.add(new Familiar(0, true, 0, Enumerados.TipoCombustible.DIESEL, "2222BBB", "Citroen", "C3", 0));
        // metemos alquileres de prueba
        listAlquileresData.add(new Alquiler(listClientesData.get(0), listVehiculosData.get(0)));
        */
        
        listClientes.setItems(listClientesData);
        listVehiculos.setItems(listVehiculosData);
        listAlquileres.setItems(listAlquileresData);

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
        
        listVehiculos.setCellFactory(new Callback<ListView<Vehiculo>, ListCell<Vehiculo>>() {
            @Override
            public ListCell<Vehiculo> call(ListView<Vehiculo> param) {
                ListCell<Vehiculo> cell = new ListCell<Vehiculo>() {
                    @Override
                    protected void updateItem(Vehiculo veh, boolean bln) {
                        super.updateItem(veh, bln);
                        if (veh == null) {
                            setGraphic(null);
                        } else {
                            Text t = new Text(veh.getMatricula() + "  -  " + veh.getMarca()+"  -  "+veh.getModelo());
                            setGraphic(t);
                        }
                    }
                };
                return cell;
            }
        });
        
        listAlquileres.setCellFactory(new Callback<ListView<Alquiler>, ListCell<Alquiler>>() {
            @Override
            public ListCell<Alquiler> call(ListView<Alquiler> param) {
                ListCell<Alquiler> cell = new ListCell<Alquiler>() {
                    @Override
                    protected void updateItem(Alquiler alq, boolean bln) {
                        super.updateItem(alq, bln);
                        if (alq == null) {
                            setGraphic(null);
                        } else {
                            Text t = new Text(alq.getCliente().getDni() + "  -  " + alq.getVehiculo().getMatricula());
                            setGraphic(t);
                        }
                    }
                };
                return cell;
            }
        });
    }
}
