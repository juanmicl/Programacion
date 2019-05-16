/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twoWindow;

import java.sql.*;

/**
 *
 * @author 0101001011
 */
public class conector {
    
    //Instancia de la clase BD
    private static final conector bd = new conector();
    // Llamar al metodo que tiene la clase y devuelve una conexion
    private static final Connection conn = bd.conectarMySQL();
    
    public String driver = "com.mysql.jdbc.Driver";
    public String database = "biblioteca";
    public String hostname = "localhost";
    public String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
    public String username = "root";
    public String password = "";

    public Connection conectarMySQL() {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        return conn;
    }
    
    private static PreparedStatement preparedStatement(String query) throws SQLException {
        return conn.prepareStatement(query);
    }
    
    public static void db2array() throws SQLException {
        // Cargamos libricos
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM libros");
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            OldMain.anadirLibro(new Libro(rs.getString(1), rs.getString(2), rs.getString(3)));
        }
    }
    
    public static void libro2db(String isbn, String nombre, String autor, String desc) throws SQLException {
        // Insertamos librico
        String query = "INSERT INTO `libros` (`isbn`, `nombre`, `autor`, `descripcion`) VALUES (?, ?, ?, ?);";
        PreparedStatement statement = preparedStatement(query);
        try { 
            statement.setString(1, isbn);
            statement.setString(2, nombre);
            statement.setString(3, autor);
            statement.setString(4, desc);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }
}