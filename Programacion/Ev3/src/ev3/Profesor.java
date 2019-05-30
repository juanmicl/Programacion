package ev3;

public class Profesor {
    public enum TipoFuncionario {
        CARRERA,
        INTERINO
    };

    private String dni;
    private String nombre;
    private String direccion;
    private int telefono;
    private TipoFuncionario funcionario;
    private boolean mayor55;

    public Profesor(String dni, String nombre, String direccion, int telefono, TipoFuncionario funcionario, boolean mayor55) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.funcionario = funcionario;
        this.mayor55 = mayor55;
    }
    
    public Profesor (Profesor profesor){
        dni = profesor.dni;
        nombre = profesor.nombre;
        direccion = profesor.direccion;
        telefono = profesor.telefono;
        funcionario = profesor.funcionario;
        mayor55 = profesor.mayor55;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public TipoFuncionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(TipoFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    public boolean getMayor55() {
        return mayor55;
    }

    public void setMayor55(boolean mayor55) {
        this.mayor55 = mayor55;
    }
    
}
