public class TiposEmpleados {
    //Definir atributos
    private int id_Tipo_Empleado;
    private String nombre_Tipo_Empleado;

    //Constructor sin parámetros
    public TiposEmpleados() {
    }

    //Constructor con parámetros
    public TiposEmpleados(int id_Tipo_Empleado, String nombre_Tipo_Empleado) {
        this.id_Tipo_Empleado = id_Tipo_Empleado;
        this.nombre_Tipo_Empleado = nombre_Tipo_Empleado;
    }

    //Métodos Setters
    public void setId_Tipo_Empleado(int id_Tipo_Empleado) {
        this.id_Tipo_Empleado = id_Tipo_Empleado;
    }
    public void setNombre_Tipo_Empleado(String nombre_Tipo_Empleado) {
        this.nombre_Tipo_Empleado = nombre_Tipo_Empleado;
    }

    //Métodos Getters
    public int getId_Tipo_Empleado() {
        return id_Tipo_Empleado;
    }
    public String getNombre_Tipo_Empleado() {
        return nombre_Tipo_Empleado;
    }    
}
