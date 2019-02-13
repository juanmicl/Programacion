package Ejercicio2;

/**
 * Clase que posee los principales atributos de un vehículo y que permite crear objetos a partir de ella
 * @author Antonio Ramos
 * @version 1.0
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String descripcion;
    private float presupuesto;
    private String propietario;
    private String telefono;

    /**
     * Constructor que recibe como parámetros todos los atributos de la clase vehículo
     * @param matricula cadena de caracteres que permite guardar la matricula del vehiculo
     * @param marca cadena de caracteres que permite guardar la marca del vehiculo
     * @param modelo cadena de caracteres que permite guardar el modelo del vehiculo
     * @param descripcion cadena de caracteres que permite guardar una descripción sobre la averia del vehiculo
     * @param presupuesto cantidad de dinero que cuesta la reparación (sin IVA)
     * @param propietario cadena de caracteres que permite guardar el propietario del vehiculo
     * @param telefono número entero largo que se usa para almacenar el teléfono del propietario
     */
    public Vehiculo(String matricula, String marca, String modelo, String descripcion, float presupuesto, String propietario, String telefono) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        if (presupuesto < 0)
            this.presupuesto = 0;
        else
            this.presupuesto = presupuesto;
        this.propietario = propietario;
        this.telefono = telefono;
    }

    /**
     * Método que devuelve la matrícula del vehículo
     * @return matrícula del vehículo
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Método que permite actualizar el valor del atributo matrícula
     * @param matricula nueva matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Método que devuelve la marca de un vehículo
     * @return marca del vehículo
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método que permite actualizar el valor del atributo marca
     * @param marca nueva marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método que devuelve el modelo de un vehículo
     * @return modelo del vehículo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *  Método que permite actualizar el valor del atributo modelo
     * @param modelo nuevo modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método que devuelve la descripción de la averia de un vehículo
     * @return descripción del vehículo
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *  Método que permite actualizar el valor del atributo descripción
     * @param descripcion nueva descripción de la avería 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que devuelve el precio estimado que costará la reparación de un vehículo
     * @return presupuesto del vehículo
     */
    public float getPresupuesto() {
        return presupuesto;
    }

    /**
     *  Método que permite actualizar el valor del atributo presupuesto
     * @param presupuesto nueva cantidad que cuesta la reparación
     */
    public void setPresupuesto(float presupuesto) {
        if(presupuesto >= 0)
            this.presupuesto = presupuesto;
    }

    /**
     * Método que devuelve el propietario de un vehículo
     * @return marca del vehículo
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     *  Método que permite actualizar el valor del atributo propietario
     * @param propietario nuevo propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * Método que devuelve el teléfono del propietario de un vehículo
     * @return número de teléfono del vehículo
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *  Método que permite actualizar el valor del atributo teléfono
     * @param telefono nuevo teléfono del propietario
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método que devuelve la cantidad que se ha de abonar por la reparación del vehículo (incluido el IVA)
     * @return cantidad que cuesta la reparación
     */
    public float totalACobrar() {
        return presupuesto + presupuesto*0.21f;
    }
    
    /**
     * Método que muestra los datos almacenados en los atributos de la clase
     * @return cadena de caracteres con la información de un vehículo
     */
    @Override
    public String toString() {
        return "Vehiculo{" + "matrícula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", descripción=" + descripcion + ", presupuesto=" + presupuesto + ", total=" + totalACobrar() + ", propietario=" + propietario + ", teléfono=" + telefono + '}';
    }
    
    
}
