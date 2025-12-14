public class Empleados {
    //Definición de atributos
    private int id_Documento;
    private int id_Tipo_Empleado;
    private int id_Tipo_Documento;
    private String nombre_Empleado;
    private String Direccion;
    private String telefono_Empleado;
    private String correo_Empleado;

    //Constructor sin parámetros
    public Empleados() {
    }

    //Constructor con parámetros
    public Empleados(int id_Documento, int id_Tipo_Empleado, int id_Tipo_Documento, String nombre_Empleado, String Direccion, String telefono_Empleado, String correo_Empleado) {
        this.id_Documento = id_Documento;
        this.id_Tipo_Empleado = id_Tipo_Empleado;
        this.id_Tipo_Documento = id_Tipo_Documento;
        this.nombre_Empleado = nombre_Empleado;
        this.Direccion = Direccion;
        this.telefono_Empleado = telefono_Empleado;
        this.correo_Empleado = correo_Empleado;
    }  

    //Métodos Setters
    public void setId_Documento(int id_Documento) {
        this.id_Documento = id_Documento;
    }
    public void setId_Tipo_Empleado(int id_Tipo_Empleado) {
        this.id_Tipo_Empleado = id_Tipo_Empleado;
    }
    public void setId_Tipo_Documento(int id_Tipo_Documento) {
        this.id_Tipo_Documento = id_Tipo_Documento;
    }
    public void setNombre_Empleado(String nombre_Empleado) {
        this.nombre_Empleado = nombre_Empleado;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public void setTelefono_Empleado(String telefono_Empleado) {
        this.telefono_Empleado = telefono_Empleado;
    }
    public void setCorreo_Empleado(String correo_Empleado) {
        this.correo_Empleado = correo_Empleado;
    }

    //Métodos Getters
    public int getId_Documento() {
        return id_Documento;
    }
    public int getId_Tipo_Empleado() {
        return id_Tipo_Empleado;
    }
    public int getId_Tipo_Documento() {
        return id_Tipo_Documento;
    }
    public String getNombre_Empleado() {
        return nombre_Empleado;
    }
    public String getDireccion() {
        return Direccion;
    }
    public String getTelefono_Empleado() {
        return telefono_Empleado;
    }
    public String getCorreo_Empleado() {
        return correo_Empleado;
    }
}
